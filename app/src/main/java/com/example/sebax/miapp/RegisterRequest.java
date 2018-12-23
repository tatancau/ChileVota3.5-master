package com.example.sebax.miapp;

import android.app.DownloadManager;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sebax on 08-07-2018.
 */

public class RegisterRequest extends StringRequest {

private static final String REGISTER_REQUEST_URL="http://10.40.43.154/Registro.php";

public RegisterRequest(  Response.Listener<String> listener){
super(Method.POST, REGISTER_REQUEST_URL, listener, null);






}


}
