package com.example.sebax.miapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    Button BTNiniciar;
    EditText ETCodigo_carnet,ETrut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BTNiniciar = findViewById(R.id.BTNiniciar);
        ETrut = findViewById(R.id.ETrut);
        ETCodigo_carnet = findViewById(R.id.ETCodigo_carnet);

        BTNiniciar = findViewById(R.id.BTNiniciar);
        BTNiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            final String Rut = ETrut.getText().toString();
                final String Codigo_carnet = ETCodigo_carnet.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                        Boolean success = jsonResponse.getBoolean("success");
                        if (success){
                            String Rut=jsonResponse.getString("Rut");
                          String Codigo_carnet=jsonResponse.getString("Codigo_carnet");
                          String Sufragio=jsonResponse.getString("Sufragio");
                          String estatus=jsonResponse.getString("Estado");
                          String Nombre=jsonResponse.getString("Nombre");
                         if (Sufragio.equals("si") ) {
                             if (estatus.equals("no")||estatus.equals("ep") ) {

                                 Votante.setRut(Rut);
                                Votante.setNombre(Nombre);

                                 Intent intent = new Intent(MainActivity.this, Usuario.class);
                                 intent.putExtra("Rut", Rut);
                                 intent.putExtra("Codigo_carnet", Codigo_carnet);


                                 MainActivity.this.startActivity(intent);
                             }else {

                                 AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                                 builder.setMessage("Usted ya voto ").setNegativeButton("Retry",null).create().show();
                             }

                         }else {

                             AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                             builder.setMessage("No esta habiitado para sufragar").setNegativeButton("Retry",null).create().show();
                         }

                        } else {

                            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                            builder.setMessage("Intentar otra vez").setNegativeButton("Retry",null).create().show();
                        }


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                };
                LoginRequest loginRequest = new LoginRequest(Rut,Codigo_carnet,responseListener);
                RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
                queue.add(loginRequest);
            }
        });
    }
}
