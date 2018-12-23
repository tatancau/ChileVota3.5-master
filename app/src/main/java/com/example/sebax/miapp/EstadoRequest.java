package com.example.sebax.miapp;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class EstadoRequest extends StringRequest {


    private static final String Estado_REQUEST_UML="http://10.40.43.154/estadoEP.php";
    private Map<String,String> params;

    public EstadoRequest(String Rut, Response.Listener<String> listener){
        super(Method.POST, Estado_REQUEST_UML,listener,null);
        params=new HashMap<>();
        params.put("Rut",Rut);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
