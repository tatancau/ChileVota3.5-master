package com.example.sebax.miapp;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sebax on 09-07-2018.
 */

public class VotoRequest extends StringRequest {

    private static final String VOTO_REQUEST_UML="http://10.40.43.154/Votos.php";
    private Map<String,String> params;

    public VotoRequest(String presidente,String diputado,String senador,String core, Response.Listener<String> listener){
         super(Method.POST, VOTO_REQUEST_UML,listener,null);
           params=new HashMap<>();
        params.put("Presidente",presidente);
        params.put("Diputado",diputado);
        params.put("Senador",senador);
        params.put("Core",core);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
