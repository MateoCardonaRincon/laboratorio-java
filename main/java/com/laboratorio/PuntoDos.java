package com.laboratorio;

import java.util.Scanner;

public class PuntoDos {

    private double value1;
    private double value2;

    private void readNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        value1 = scanner.nextDouble();
        System.out.println("Ingrese otro número: ");
        value2 = scanner.nextDouble();
    }

    private void compareNumbers() {
        double max = Math.max(value1, value2);
        System.out.println(max);
    }

    public void run() {
        readNumbers();
        compareNumbers();
    }
}
