package com.laboratorio;

public class PuntoSeis implements Ejercicio {

    private void showNumbers() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    @Override
    public void run() {
        showNumbers();
    }
}
