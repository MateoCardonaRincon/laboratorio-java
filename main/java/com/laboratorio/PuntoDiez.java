package com.laboratorio;

public class PuntoDiez extends PuntoNueve {

    public PuntoDiez() {
        text = readText();
    }

    @Override
    public void run() {
        replaceCharacters(" ", "");
        showText();
    }
}
