package com.example.sebax.miapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.content.Intent;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import android.support.v7.app.AlertDialog;

import org.json.JSONException;
import org.json.JSONObject;

public class Diputados extends AppCompatActivity implements View.OnClickListener {
TextView tvandrea,tvduarte,tvraul,tvmaraboli,tvcarolina,tvhinojosa,tvjorge,tvarroyo,tvjulian,tvalcayaga,tvpatricia,tvvalenzuela;
Button btnandrea,btnraul,btncarolina,btnjorge,btnjulian,btnpatricia;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diputados);

        tvandrea=findViewById(R.id.TVandrea);
        tvduarte=findViewById(R.id.TVduarte);
        tvraul=findViewById(R.id.TVraul);
        tvmaraboli=findViewById(R.id.TVmaraboli);
        tvcarolina=findViewById(R.id.TVcarolina);
        tvhinojosa=findViewById(R.id.TVHinojosa);
        tvjorge=findViewById(R.id.TVjorge);
        tvarroyo=findViewById(R.id.TVarroyo);
        tvjulian=findViewById(R.id.TVjulian);
        tvalcayaga=findViewById(R.id.TValcayaga);
        tvpatricia=findViewById(R.id.TVpatricia);
        tvvalenzuela=findViewById(R.id.TVvalenzuela);


        btnandrea=findViewById(R.id.BTNandrea);
        btnraul=findViewById(R.id.BTNraul);
        btncarolina=findViewById(R.id.BTNcarolina);
        btnjorge=findViewById(R.id.BTjorge);
        btnjulian=findViewById(R.id.BTjulian);
        btnpatricia=findViewById(R.id.BTNpatricia);

        btnandrea.setOnClickListener(this);
        btnraul.setOnClickListener(this);
        btncarolina.setOnClickListener(this);
        btnjorge.setOnClickListener(this);
        btnjulian.setOnClickListener(this);
        btnpatricia.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.BTNandrea:

                final String Nombre = tvandrea.getText().toString();
                final String Apellido = tvduarte.getText().toString();
                ClassVoto.setDiputado(Nombre + " " + Apellido);
                Intent intentandrea = new Intent(Diputados.this,Senador.class);
                Diputados.this.startActivity(intentandrea);

                break;
            case R.id.BTNraul:

                final String raul = tvraul.getText().toString();
                final String maraboli = tvmaraboli.getText().toString();
                ClassVoto.setDiputado(raul + " " +maraboli);
                Intent intentraul= new Intent(Diputados.this,Senador.class);
                Diputados.this.startActivity(intentraul);


                break;
            case R.id.BTNcarolina:

                final String carolina = tvcarolina.getText().toString();
                final String hinojosa = tvhinojosa.getText().toString();
                ClassVoto.setDiputado(carolina + " " +hinojosa);
                Intent intentcarolina= new Intent(Diputados.this,Senador.class);
                Diputados.this.startActivity(intentcarolina);

                break;
            case R.id.BTjorge:

                final String jorge = tvjorge.getText().toString();
                final String arroyo = tvarroyo.getText().toString();
                ClassVoto.setDiputado(jorge + " " +arroyo);
                Intent intentjorge= new Intent(Diputados.this,Senador.class);
                Diputados.this.startActivity(intentjorge);

                break;
            case R.id.BTjulian:

                final String julian = tvjulian.getText().toString();
                final String alcayaga = tvalcayaga.getText().toString();
                ClassVoto.setDiputado(julian + " " +alcayaga);
                Intent intentjulian= new Intent(Diputados.this,Senador.class);
                Diputados.this.startActivity(intentjulian);

                break;
            case R.id.BTNpatricia:

                final String patricia = tvpatricia.getText().toString();
                final String valenzuela = tvvalenzuela.getText().toString();
                ClassVoto.setDiputado(patricia + " " +valenzuela);
                Intent intentpatricia= new Intent(Diputados.this,Senador.class);
                Diputados.this.startActivity(intentpatricia);

                break;

        }
    }
}
