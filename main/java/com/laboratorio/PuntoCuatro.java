package com.laboratorio;

import java.util.Scanner;

public class PuntoCuatro {

    private final double IVA = 0.21;
    private double price;

    private void readPrice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        price = scanner.nextDouble();
    }

    private void computeTaxes(){
        price += price * IVA;
        System.out.println("Precio con IVA: " + price);
    }

    public void run(){
        readPrice();
        computeTaxes();
    }
}
