package com.example.sebax.miapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.v7.app.AlertDialog;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.nio.file.Files;

public class Presidenciales extends AppCompatActivity implements View.OnClickListener {
    TextView  TTVnombre, TVrut, TVgoic, TVcarolina, TVguiller, TVAlejandro,TVsebastian,TVpiñera,TVedu,TVartes,TVbeatriz,TVsanchez,
            TVmarcos,TVmeo,TVjuan,TVkast,TVale,TVnavarro;

    Button BTNcarolina, BTNguiller,BTNpiñera,BTNnavarro,BTNartes,BTNsanchez,BTNmeo,BTNkast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presidenciales);

        TVedu=findViewById(R.id.TVedu);
        TVartes=findViewById(R.id.TVartes);
        TVbeatriz=findViewById(R.id.TVbeatriz);
        TVsanchez=findViewById(R.id.TVsanchez);
        TVmarcos=findViewById(R.id.TVmarcos);
        TVmeo=findViewById(R.id.TVmeo);
        TVjuan=findViewById(R.id.TVjuan);
        TVkast=findViewById(R.id.TVkast);
        TVale=findViewById(R.id.TVale);
        TVnavarro=findViewById(R.id.TVnavarro);
        TVsebastian=findViewById(R.id.TVsebastian);
        TVpiñera=findViewById(R.id.TVpiñera);
        TVAlejandro = findViewById(R.id.TValejandro);
        TVguiller = findViewById(R.id.TVguiller);
        TVgoic = findViewById(R.id.TVgoic);
        TVcarolina = findViewById(R.id.TVcarolina);



        BTNkast = findViewById(R.id.BTNkast);
        BTNmeo = findViewById(R.id.BTNmeo);
        BTNsanchez = findViewById(R.id.BTNsanchez);
        BTNartes = findViewById(R.id.BTNartes);
        BTNnavarro = findViewById(R.id.BTNnavarro);
        BTNpiñera = findViewById(R.id.BTNpiñera);
        BTNcarolina = findViewById(R.id.BTNcarolina);
        BTNguiller = findViewById(R.id.BTNguller);


        BTNartes.setOnClickListener(this);
        BTNsanchez.setOnClickListener(this);
        BTNmeo.setOnClickListener(this);
        BTNkast.setOnClickListener(this);
        BTNnavarro.setOnClickListener(this);
        BTNpiñera.setOnClickListener(this);
        BTNguiller.setOnClickListener(this);
        BTNcarolina.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.BTNcarolina:

                final String Nombre = TVgoic.getText().toString();
                final String Apellido = TVcarolina.getText().toString();
                ClassVoto.setPresidente(Nombre + " " + Apellido);
                Intent intent = new Intent(Presidenciales.this,Diputados.class);
                Presidenciales.this.startActivity(intent);

        break;
            case R.id.BTNguller:

                final String ale = TVAlejandro.getText().toString();
                final String gui = TVguiller.getText().toString();
                ClassVoto.setPresidente(ale + " " + gui);
                Intent intentguiller = new Intent(Presidenciales.this,Diputados.class);
                Presidenciales.this.startActivity(intentguiller);
                break;



            case R.id.BTNpiñera:

                final String seba = TVsebastian.getText().toString();
                final String piñe = TVpiñera.getText().toString();
                ClassVoto.setPresidente(seba + " " + piñe);
                Intent intentpiñera = new Intent(Presidenciales.this,Diputados.class);
                Presidenciales.this.startActivity(intentpiñera);

                break;

            case R.id.BTNartes:
                final String edu = TVedu.getText().toString();
                final String artes = TVartes.getText().toString();
                ClassVoto.setPresidente(edu + " " + artes);
                Intent intentartes = new Intent(Presidenciales.this,Diputados.class);
                Presidenciales.this.startActivity(intentartes);

                break;

            case R.id.BTNsanchez:
                final String bea = TVbeatriz.getText().toString();
                final String sanchez = TVsanchez.getText().toString();
                ClassVoto.setPresidente(bea + " " + sanchez);
                Intent intentsanchez = new Intent(Presidenciales.this,Diputados.class);
                Presidenciales.this.startActivity(intentsanchez);

                break;

            case R.id.BTNmeo:
                final String marco = TVmarcos.getText().toString();
                final String ominami = TVmeo.getText().toString();
                ClassVoto.setPresidente(marco + " " + ominami);
                Intent intentominami = new Intent(Presidenciales.this,Diputados.class);
                Presidenciales.this.startActivity(intentominami);

                break;

            case R.id.BTNkast:
                final String juan = TVjuan.getText().toString();
                final String kast = TVkast.getText().toString();
                ClassVoto.setPresidente(juan + " " + kast);
                Intent intentkast = new Intent(Presidenciales.this,Diputados.class);
                Presidenciales.this.startActivity(intentkast);

                break;

            case R.id.BTNnavarro:
                final String alejandro = TVale.getText().toString();
                final String navarro = TVnavarro.getText().toString();
                ClassVoto.setPresidente(alejandro + " " + navarro);
                Intent intentnavarro = new Intent(Presidenciales.this,Diputados.class);
                Presidenciales.this.startActivity(intentnavarro);

                break;
        }
   }

    }