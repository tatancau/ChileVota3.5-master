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

public class Core extends AppCompatActivity implements View.OnClickListener {
TextView tvcarlos,tvcampodonico,tvximena,tvbecerra,tvjoselee,tvlee,tvjorge,tvdiaz,tvgiancarlo,tvbartolu,tvgary,tvtapia;
Button btncarlos,btnximena,btnjoslee,btnjorge,btngiancarlo,btngary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_core);

       tvcarlos=findViewById(R.id.TVcarlosferry);
        tvcampodonico=findViewById(R.id.TVcompodonico);
        tvximena=findViewById(R.id.TVximena);
        tvbecerra=findViewById(R.id.TVbecerra);
        tvjoselee=findViewById(R.id.TVjoselee);
        tvlee=findViewById(R.id.TVlee);
        tvjorge=findViewById(R.id.TVjorge);
        tvdiaz=findViewById(R.id.TVdiaz);
        tvgiancarlo=findViewById(R.id.TVgiancarlo);
        tvbartolu=findViewById(R.id.TVbaltolu);
        tvgary=findViewById(R.id.TVgary);
        tvtapia=findViewById(R.id.TVtapia);

        btncarlos=findViewById(R.id.BTcarlosferry);
        btnximena=findViewById(R.id.BTNximena);
        btnjoslee=findViewById(R.id.BTNjoselee);
        btnjorge=findViewById(R.id.BTjorge);
        btngiancarlo=findViewById(R.id.BTNgiancarlo);
        btngary=findViewById(R.id.BTNgary);

        btncarlos.setOnClickListener(this);
        btnximena.setOnClickListener(this);
        btnjoslee.setOnClickListener(this);
        btnjorge.setOnClickListener(this);
        btngiancarlo.setOnClickListener(this);
        btngary.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.BTcarlosferry:

                final String carlos = tvcarlos.getText().toString();
                final String ferry = tvcampodonico.getText().toString();
                ClassVoto.setCore(carlos + " " + ferry);
                Intent intentcarlosf = new Intent(Core.this,MuestraVoto.class);
                Core.this.startActivity(intentcarlosf);

                break;
            case R.id.BTNximena:

                final String sandra = tvximena.getText().toString();
                final String velasquez = tvbecerra.getText().toString();
                ClassVoto.setCore(sandra + " " + velasquez);
                Intent intentsandra = new Intent(Core.this,MuestraVoto.class);
                Core.this.startActivity(intentsandra);

                break;
            case R.id.BTNjoselee:

                final String claudio = tvjoselee.getText().toString();
                final String murilo = tvlee.getText().toString();
                ClassVoto.setCore(claudio + " " + murilo);
                Intent intentclaudio = new Intent(Core.this,MuestraVoto.class);
                Core.this.startActivity(intentclaudio);

                break;
            case R.id.BTNjorgediaz:

                final String rodrigo = tvjorge.getText().toString();
                final String diaz = tvdiaz.getText().toString();
                ClassVoto.setCore(rodrigo + " " + diaz);
                Intent intentrodrigo = new Intent(Core.this,MuestraVoto.class);
                Core.this.startActivity(intentrodrigo);

                break;
            case R.id.BTNgiancarlo:

                final String veronica = tvgiancarlo.getText().toString();
                final String foppiano = tvbartolu.getText().toString();
                ClassVoto.setCore(veronica + " " + foppiano);
                Intent intentveronica = new Intent(Core.this,MuestraVoto.class);
                Core.this.startActivity(intentveronica);

                break;
            case R.id.BTNgary:

                final String jose = tvgary.getText().toString();
                final String miguel = tvtapia.getText().toString();
                ClassVoto.setCore(jose + " " + miguel);
                Intent intentjose = new Intent(Core.this,MuestraVoto.class);
                Core.this.startActivity(intentjose);

                break;






        }
    }
}
