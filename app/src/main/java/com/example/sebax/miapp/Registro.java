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

public class Registro extends AppCompatActivity {
Button btnPresidenciales,btnDiputados,btnSenadores,btnCore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btnPresidenciales=findViewById(R.id.btnPresidenciales);
        btnDiputados=findViewById(R.id.btnDiputados);
        btnSenadores=findViewById(R.id.btnSenadores);
        btnCore=findViewById(R.id.btnCore);

        btnPresidenciales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registro.this,Presidenciales.class);
                Registro.this.startActivity(intent);
            }
        });
        btnDiputados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registro.this,Diputados.class);
                Registro.this.startActivity(intent);
            }
        });
        btnSenadores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registro.this,Senadores.class);
                Registro.this.startActivity(intent);
            }
        });
     btnCore.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent = new Intent(Registro.this,Core.class);
             Registro.this.startActivity(intent);
         }
     });

    }
}
