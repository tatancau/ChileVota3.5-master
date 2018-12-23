package com.example.sebax.miapp;

public class Votante {

    private static Votante instance;
    private static String Rut;
    private static String Nombre;

    public static String getNombre() {
        return Nombre;
    }

    public static void setNombre(String nombre) {
        Nombre = nombre;
    }

    public static Votante getInstance() {
        return instance;
    }

    public static void setInstance(Votante instance) {
        Votante.instance = instance;
    }

    public static String getRut() {
        return Rut;
    }

    public static void setRut(String rut) {
        Rut = rut;
    }

}



