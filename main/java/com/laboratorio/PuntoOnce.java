package com.laboratorio;

public class PuntoOnce extends PuntoNueve {

    public PuntoOnce() {
        text = readText();
    }

    private void showTextLength(){
        System.out.println("Longitud de la cadena: " + text.length());
    }

    private void showNumberOfVowels(){
        System.out.println("Número de vocales: " + countVowels());
    }

    private int countVowels(){
        return text.replaceAll("[^AEIOUaeiou]", "").length();
    }

    @Override
    public void run() {
        showTextLength();
        showNumberOfVowels();
    }

}
