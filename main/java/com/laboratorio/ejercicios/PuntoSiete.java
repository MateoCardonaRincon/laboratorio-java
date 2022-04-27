package com.laboratorio.ejercicios;

public class PuntoSiete implements Ejercicio {

    private void checkNumber() {
        double number;
        do {
            System.out.println("Ingresa un número: ");
            number = SCANNER.nextDouble();
            showNumber(number);
        } while (number < 0);
    }

    private void showNumber(double number) {
        if (number >= 0) {
            System.out.printf("Usted ingresó el número %.2f", number);
        }
    }

    @Override
    public void run() {
        checkNumber();
    }
}
