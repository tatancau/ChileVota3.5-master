package com.example.sebax.miapp;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class SenadoresRequest extends StringRequest {


        private static final String SENADORES_REQUEST_UML="http://10.40.43.154/Senadores.php";
        private Map<String,String> params;

        public SenadoresRequest(String Nombre,String Apellido, Response.Listener<String> listener){
            super(Method.POST, SENADORES_REQUEST_UML,listener,null);
            params=new HashMap<>();
            params.put("Nombre",Nombre);
            params.put("Apellido",Apellido);
        }

        @Override
        public Map<String, String> getParams() {
            return params;
        }
}
