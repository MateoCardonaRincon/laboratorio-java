package com.laboratorio;

public class PuntoDiez extends PuntoNueve implements Ejercicio{

    public PuntoDiez() {
        text = readText();
    }

    @Override
    public void run() {
        replaceCharacters(" ", "");
        showText();
    }
}
