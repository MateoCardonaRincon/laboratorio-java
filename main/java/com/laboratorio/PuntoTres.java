package com.laboratorio;

public class PuntoTres implements Ejercicio {

    private Double radio;

    private void readRadius() {
        System.out.println("Ingrese radio del círculo: ");
        radio = SCANNER.nextDouble();
    }

    private void computeArea() {
        Double area = Math.PI * Math.pow(radio, 2);
        System.out.println("área del círculo: " + area);
    }

    @Override
    public void run() {
        readRadius();
        computeArea();
    }

}
