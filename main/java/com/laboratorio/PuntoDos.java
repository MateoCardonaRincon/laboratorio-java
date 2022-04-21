package com.laboratorio;

public class PuntoDos implements Ejercicio{

    private double value1;
    private double value2;

    private void readNumbers(){
        System.out.println("Ingrese un número: ");
        value1 = SCANNER.nextDouble();
        System.out.println("Ingrese otro número: ");
        value2 = SCANNER.nextDouble();
    }

    private void compareNumbers() {
        double max = Math.max(value1, value2);
        System.out.println(max);
    }

    @Override
    public void run() {
        readNumbers();
        compareNumbers();
    }
}
