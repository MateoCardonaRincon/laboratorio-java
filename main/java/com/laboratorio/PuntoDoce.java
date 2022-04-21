package com.laboratorio;

public class PuntoDoce implements Ejercicio {

    private String word1;
    private String word2;
    private String tail = "";
    private String bodyDifference = "";

    private void readWords() {
        System.out.println("Ingresa una palabra: ");
        word1 = SCANNER.nextLine();
        System.out.println("Ingresa otra palabra: ");
        word2 = SCANNER.nextLine();
    }

    private void sortWords() {
        if (word1.length() > word2.length()) {
            String temp = word2;
            word2 = word1;
            word1 = temp;
        }
    }

    // Toma el sobrante del string más largo desde la posición igual a la longitud del string más corto
    private void takeTail() {
        tail = word2.substring(word1.length());
    }

    private void compareWords() {
        for (int i = 0; i < word1.length(); i++) {
            compareLetters(word1.charAt(i), word2.charAt(i), i);
        }
    }

    private void compareLetters(char c1, char c2, int index) {
        bodyDifference += c1 == c2 ? "=" : word2.charAt(index);
    }

    @Override
    public void run() {
        readWords();
        sortWords();
        takeTail();
        compareWords();
        System.out.println("Diferencias: " + bodyDifference + tail);
    }
}