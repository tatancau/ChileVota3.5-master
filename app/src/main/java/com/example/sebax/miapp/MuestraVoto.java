package com.example.sebax.miapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import android.support.v7.app.AlertDialog;

import org.json.JSONException;
import org.json.JSONObject;


import com.android.volley.RequestQueue;

public class MuestraVoto extends AppCompatActivity {
TextView tvpresi,tvdepu,tvsena,tvcore;
Button btnconfirma,btncancela;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muestra_voto);

        tvpresi=findViewById(R.id.TVpresi);
        tvdepu=findViewById(R.id.TVdipu);
        tvsena=findViewById(R.id.TVSena);
        tvcore=findViewById(R.id.TVCore);

        tvpresi.setText(ClassVoto.getPresidente());
        tvdepu.setText(ClassVoto.getDiputado());
        tvsena.setText(ClassVoto.getSenador());
        tvcore.setText(ClassVoto.getCore());

        btnconfirma=findViewById(R.id.BTNconfirma);
        btncancela=findViewById(R.id.BTNcancela);


        btncancela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Rut=Votante.getRut();
                Response.Listener<String> responListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            Boolean success = jsonObject.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(MuestraVoto.this, Usuario.class);
                                MuestraVoto.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(MuestraVoto.this);
                                builder.setMessage("Intentar otra vez").setNegativeButton("Retry", null).create().show();

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                };
                EstadoNoRequest NoRequest = new EstadoNoRequest(Rut,responListener);
                RequestQueue queueno = Volley.newRequestQueue(MuestraVoto.this);
                queueno.add(NoRequest);


            }
        });

        btnconfirma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String presidente = tvpresi.getText().toString();
                String diputado = tvdepu.getText().toString();
                String senador= tvsena.getText().toString();
                String core= tvcore.getText().toString();
                String Rut=Votante.getRut();
                Response.Listener<String> responListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            Boolean success = jsonObject.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(MuestraVoto.this, MainActivity.class);
                                MuestraVoto.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(MuestraVoto.this);
                                builder.setMessage("Intentar otra vez").setNegativeButton("Retry", null).create().show();

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                };
                VotoRequest candiRequest = new VotoRequest(presidente,diputado,senador,core,responListener);
                RequestQueue queue = Volley.newRequestQueue(MuestraVoto.this);
                queue.add(candiRequest);

                EstadoCeRequest ceRequest = new EstadoCeRequest(Rut,responListener);
                RequestQueue queuece = Volley.newRequestQueue(MuestraVoto.this);
                queuece.add(ceRequest);


            }
        });
    }
}
