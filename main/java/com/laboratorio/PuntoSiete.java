package com.laboratorio;

import java.util.Scanner;

public class PuntoSiete {

    private double number;

    private void checkNumber() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Ingresa un número: ");
            number = scanner.nextDouble();
            showNumber(number);
        } while (number < 0);
    }

    private void showNumber(double number) {
        if(number >= 0){
            System.out.println("Usted ingresó el número " + number);
        }
    }

    public void run(){
        checkNumber();
    }
}
