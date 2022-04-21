package com.laboratorio;

public class PuntoUno implements Ejercicio{

    private double value1 = 22;
    private double value2 = 26;

    private void compareNumbers() {
        double max = Math.max(value1, value2);
        System.out.println(max);
    }

    @Override
    public void run() {
        compareNumbers();
    }
}
