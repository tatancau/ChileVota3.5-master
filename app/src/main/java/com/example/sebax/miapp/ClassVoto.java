package com.example.sebax.miapp;

public class ClassVoto {

    private static ClassVoto instance;
    private static String presidente;
    private static String senador;
    private static String diputado;
    private static String core;

    public static ClassVoto getInstance() {
        return instance;
    }

    public static void setInstance(ClassVoto instance) {
        ClassVoto.instance = instance;
    }

    public static String getPresidente() {
        return presidente;
    }

    public static void setPresidente(String presidente) {
        ClassVoto.presidente = presidente;
    }

    public static String getSenador() {
        return senador;
    }

    public static void setSenador(String senador) {
        ClassVoto.senador = senador;
    }

    public static String getDiputado() {
        return diputado;
    }

    public static void setDiputado(String diputado) {
        ClassVoto.diputado = diputado;
    }

    public static String getCore() {
        return core;
    }

    public static void setCore(String core) {
        ClassVoto.core = core;

    }
}
