package com.laboratorio;

import java.util.Scanner;

public class PuntoTres {
    private double radio;
    private double area;

    private void readRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese radio del círculo: ");
        radio = scanner.nextDouble();
    }

    private void computeArea() {
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("área del círculo: " + area);
    }

    public void run() {
        readRadius();
        computeArea();
    }

}
