package com.example.sebax.miapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class Senadores extends AppCompatActivity implements View.OnClickListener {
TextView tvpablo,tvbossay,tvsandra,tvvelasquez,tvclaudio,tvmurillo,tvrodrigo,tvdiaz,tvveronica,tvfoppiano,tvjose,tvmiquel;
Button btnpablo,btnsandra,btnclaudio,btnrodrigo,btnveronica,btnjosemiguel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senadores);

        tvpablo = findViewById(R.id.TVpablo);
        tvbossay = findViewById(R.id.TVbossay);
        tvsandra = findViewById(R.id.TVsandra);
        tvvelasquez = findViewById(R.id.TVvelasquez);
        tvclaudio = findViewById(R.id.TVclaudio);
        tvmurillo = findViewById(R.id.TVmurillo);
        tvrodrigo = findViewById(R.id.TVrodrigo);
        tvdiaz = findViewById(R.id.TVdiaz);
        tvveronica = findViewById(R.id.TVveronica);
        tvfoppiano = findViewById(R.id.TVFoppiano);
        tvjose = findViewById(R.id.TVjoseMiguel);
        tvmiquel = findViewById(R.id.TVmiguel);

        btnpablo.findViewById(R.id.BTbosay);
        btnsandra.findViewById(R.id.BTNsandra);
        btnclaudio.findViewById(R.id.BTNclaudio);
        btnrodrigo.findViewById(R.id.BTNrodrigo);
        btnveronica.findViewById(R.id.BTveronica);
        btnjosemiguel.findViewById(R.id.BTNjoseMiguel);


        btnpablo.setOnClickListener(this);
        btnsandra.setOnClickListener(this);
        btnclaudio.setOnClickListener(this);
        btnrodrigo.setOnClickListener(this);
        btnveronica.setOnClickListener(this);
        btnjosemiguel.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.BTbosay:

                final String pablo = tvpablo.getText().toString();
                final String bossay = tvbossay.getText().toString();
                ClassVoto.setSenador(pablo + " " + bossay);
                Intent intentkast = new Intent(Senadores.this,Core.class);
                Senadores.this.startActivity(intentkast);

                break;
            case R.id.BTNsandra:

                final String sandra = tvsandra.getText().toString();
                final String velasquez = tvvelasquez.getText().toString();
                ClassVoto.setSenador(sandra + " " + velasquez);
                Intent intentsandra = new Intent(Senadores.this,Core.class);
                Senadores.this.startActivity(intentsandra);
                break;
            case R.id.BTNclaudio:

                final String claudio = tvclaudio.getText().toString();
                final String murilo = tvmurillo.getText().toString();
                ClassVoto.setSenador(claudio + " " + murilo);
                Intent intentclaudio = new Intent(Senadores.this,Core.class);
                Senadores.this.startActivity(intentclaudio);

                break;
            case R.id.BTNrodrigo:

                final String rodrigo = tvrodrigo.getText().toString();
                final String diaz = tvdiaz.getText().toString();
                ClassVoto.setSenador(rodrigo + " " + diaz);
                Intent intentrodrigo = new Intent(Senadores.this,Core.class);
                Senadores.this.startActivity(intentrodrigo);

                break;
            case R.id.BTveronica:

                final String veronica = tvveronica.getText().toString();
                final String foppiano = tvfoppiano.getText().toString();
                ClassVoto.setSenador(veronica + " " + foppiano);
                Intent intentfoppiano = new Intent(Senadores.this,Core.class);
                Senadores.this.startActivity(intentfoppiano);
                break;
            case R.id.BTNjoseMiguel:

                final String jose = tvjose.getText().toString();
                final String miguel = tvmiquel.getText().toString();
                ClassVoto.setSenador(jose + " " + miguel);
                Intent intentjose = new Intent(Senadores.this,Core.class);
                Senadores.this.startActivity(intentjose);

                break;





        }
    }
}
