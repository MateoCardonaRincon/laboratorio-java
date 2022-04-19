package com.laboratorio;

public class PuntoCinco implements Ejercicio {

    private void showNumbers() {
        int number = 1;
        while (number <= 100) {
            System.out.println(number);
            number++;
        }
    }

    public void run() {
        showNumbers();
    }

}
