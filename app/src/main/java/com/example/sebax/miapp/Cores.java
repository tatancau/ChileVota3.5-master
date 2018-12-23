package com.example.sebax.miapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Cores extends AppCompatActivity implements View.OnClickListener {
    TextView tvcarlos,tvcampodonico,tvximena,tvbecerra,tvjoselee,tvlee,tvgiancarlo,tvbartolu;
    Button btncarlos,btnximena,btnjoslee,btngiancarlo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cores);

        tvcarlos=findViewById(R.id.TVcarlosferry);
        tvcampodonico=findViewById(R.id.TVcompodonico);
        tvximena=findViewById(R.id.TVximena);
        tvbecerra=findViewById(R.id.TVbecerra);
        tvjoselee=findViewById(R.id.TVjoselee);
        tvlee=findViewById(R.id.TVlee);
        tvgiancarlo=findViewById(R.id.TVgiancarlo);
        tvbartolu=findViewById(R.id.TVbaltolu);


        btncarlos=findViewById(R.id.BTcarlosferry);
        btnximena=findViewById(R.id.BTNximena);
        btnjoslee=findViewById(R.id.BTNjoselee);
        btngiancarlo=findViewById(R.id.BTNgiancarlo);



        btncarlos.setOnClickListener(this);
        btnximena.setOnClickListener(this);
        btnjoslee.setOnClickListener(this);
        btngiancarlo.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.BTcarlosferry:

                final String carlos = tvcarlos.getText().toString();
                final String ferry = tvcampodonico.getText().toString();
                ClassVoto.setCore(carlos + " " + ferry);
                Intent intentcarlosf = new Intent(Cores.this,MuestraVoto.class);
                Cores.this.startActivity(intentcarlosf);

                break;
            case R.id.BTNximena:

                final String sandra = tvximena.getText().toString();
                final String velasquez = tvbecerra.getText().toString();
                ClassVoto.setCore(sandra + " " + velasquez);
                Intent intentsandra = new Intent(Cores.this,MuestraVoto.class);
                Cores.this.startActivity(intentsandra);

                break;
            case R.id.BTNjoselee:

                final String claudio = tvjoselee.getText().toString();
                final String murilo = tvlee.getText().toString();
                ClassVoto.setCore(claudio + " " + murilo);
                Intent intentclaudio = new Intent(Cores.this,MuestraVoto.class);
                Cores.this.startActivity(intentclaudio);

                break;

            case R.id.BTNgiancarlo:

                final String veronica = tvgiancarlo.getText().toString();
                final String foppiano = tvbartolu.getText().toString();
                ClassVoto.setCore(veronica + " " + foppiano);
                Intent intentveronica = new Intent(Cores.this,MuestraVoto.class);
                Cores.this.startActivity(intentveronica);

                break;






        }
    }
}
