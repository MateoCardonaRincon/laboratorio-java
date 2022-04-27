package com.laboratorio.ejercicios;

public class PuntoCatorce implements Ejercicio {

    private int readNumber() {
        System.out.println("Ingresa un número: ");
        return SCANNER.nextInt();
    }

    // Muestra los números con saltos de 2 en 2 partiendo del número ingresado
    private void showNumbersWithJumpsOfTwo() {
        for (int i = readNumber(); i <= 1000; i+=2) {
            System.out.println(i);
        }
    }

    @Override
    public void run() {
        showNumbersWithJumpsOfTwo();
    }
}
