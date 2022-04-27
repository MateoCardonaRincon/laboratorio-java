package com.laboratorio;

public class PuntoOnce extends PuntoNueve implements Ejercicio{

    public PuntoOnce() {
        text = readText();
    }

    private void showTextLength(){
        System.out.println("Longitud de la cadena: " + text.length());
    }

    private void showNumberOfVowels(){
        System.out.println("Número de vocales: " + countVowels());
    }

    // La expresión regular ^AEIOUaeiou engloba todos los caracteres diferentes a vocales
    private int countVowels(){
        return text.replaceAll("[^AEIOUaeiou]", "").length();
    }

    @Override
    public void run() {
        showTextLength();
        showNumberOfVowels();
    }

}
