package com.laboratorio;

public class PuntoDos implements Ejercicio{

    private Double value1;
    private Double value2;

    private void readNumbers(){
        System.out.println("Ingrese un número: ");
        value1 = SCANNER.nextDouble();
        System.out.println("Ingrese otro número: ");
        value2 = SCANNER.nextDouble();
    }

    private void compareNumbers() {
        Double max = Math.max(value1, value2);
        System.out.println("El número mayor es: " + max);
    }

    @Override
    public void run() {
        readNumbers();
        compareNumbers();
    }
}
