package com.example.sebax.miapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.nio.file.Files;

public class Usuario extends AppCompatActivity {

    Button btnAvotar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        btnAvotar = findViewById(R.id.btnAvotar);

        btnAvotar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Rut= Votante.getRut();
                Response.Listener<String> responListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            Boolean success = jsonObject.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(Usuario.this, Presidenciales.class);
                                Usuario.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Usuario.this);
                                builder.setMessage("Intentar otra vez").setNegativeButton("Retry", null).create().show();

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                };
                EstadoRequest candiRequest = new EstadoRequest(Rut,responListener);
                RequestQueue queue = Volley.newRequestQueue(Usuario.this);
                queue.add(candiRequest);

            }
        });

    }
}





