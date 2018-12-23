package com.example.sebax.miapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class S extends AppCompatActivity {
    TextView tvpablo,tvbossay,tvsandra,tvvelasquez,tvclaudio,tvmurillo,tvrodrigo,tvdiaz,tvveronica,tvfoppiano,tvjose,tvmiquel;
    Button btnpablo,btnsandra,btnclaudio,btnrodrigo,btnveronica,btnjosemiguel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s);

     tvpablo=findViewById(R.id.TVpablo);
        tvbossay=findViewById(R.id.TVbossay);
        tvsandra=findViewById(R.id.TVsandra);
        tvvelasquez=findViewById(R.id.TVvelasquez);
        tvclaudio=findViewById(R.id.TVclaudio);
        tvmurillo=findViewById(R.id.TVmurillo);
        tvrodrigo=findViewById(R.id.TVrodrigo);
        tvdiaz=findViewById(R.id.TVdiaz);
        tvveronica=findViewById(R.id.TVveronica);
        tvfoppiano=findViewById(R.id.TVFoppiano);
        tvjose=findViewById(R.id.TVjoseMiguel);
        tvmiquel=findViewById(R.id.TVmiguel);

        btnpablo=findViewById(R.id.BTbosay);
        btnsandra=findViewById(R.id.BTNsandra);
        btnclaudio=findViewById(R.id.BTNclaudio);
        btnrodrigo=findViewById(R.id.BTNrodrigo);
        btnveronica=findViewById(R.id.BTveronica);
        btnjosemiguel=findViewById(R.id.BTNjoseMiguel);



    }
}
