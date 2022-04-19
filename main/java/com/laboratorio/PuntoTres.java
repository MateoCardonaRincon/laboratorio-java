package com.laboratorio;

public class PuntoTres implements Ejercicio {
    private double radio;
    private double area;

    private void readRadius() {
        System.out.println("Ingrese radio del círculo: ");
        radio = SCANNER.nextDouble();
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
