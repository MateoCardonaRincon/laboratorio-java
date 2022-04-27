package com.laboratorio;

public class PuntoNueve implements Ejercicio {

    protected String text;

    public PuntoNueve() {
        text = "La sonrisa será la mejor arma contra la tristeza";
    }

    protected void replaceCharacters(String oldString, String newString) {
        text = text.replace(oldString, newString);
    }

    protected String readText() {
        System.out.println("Ingresa un texto: ");
        String newText = SCANNER.nextLine();
        return newText;
    }

    private void addSomeText(String newText) {
        text = text.concat(newText);
    }

    protected void showText() {
        System.out.println(text);
    }

    @Override
    public void run() {
        replaceCharacters("a", "e");
        addSomeText(readText());
        showText();
    }
}
