package com.laboratorio;

public class PuntoUno implements Ejercicio{

    private Double value1 = 22.0;
    private Double value2 = 26.0;

    private void compareNumbers() {
        Double max = Math.max(value1, value2);
        System.out.println("Mayor entre " + value1 + " y " + value2 + ": " + max);
    }

    @Override
    public void run() {
        compareNumbers();
    }
}
