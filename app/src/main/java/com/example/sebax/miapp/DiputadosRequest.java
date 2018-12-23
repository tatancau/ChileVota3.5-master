package com.example.sebax.miapp;

import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;
import com.android.volley.Response;

public class DiputadosRequest extends StringRequest {

    private static final String Diputados_REQUEST_UML="http://10.40.43.154/Diputados.php";
    private Map<String,String> params;

    public DiputadosRequest(String Nombre,String Apellido, Response.Listener<String> listener){
        super(Method.POST, Diputados_REQUEST_UML,listener,null);
        params=new HashMap<>();
        params.put("Nombre",Nombre);
        params.put("Apellido",Apellido);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
