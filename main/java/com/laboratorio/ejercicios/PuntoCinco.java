package com.laboratorio.ejercicios;

public class PuntoCinco implements Ejercicio {

    private void showNumbers() {
        int number = 1;
        while (number <= 100) {
            System.out.println(number);
            number++;
        }
    }

    @Override
    public void run() {
        showNumbers();
    }

}
