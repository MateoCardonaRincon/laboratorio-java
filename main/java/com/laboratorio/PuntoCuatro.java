package com.laboratorio;

public class PuntoCuatro implements Ejercicio{

    private final double IVA = 0.21;
    private double price;

    private void readPrice(){
        System.out.println("Ingrese el precio del producto: ");
        price = SCANNER.nextDouble();
    }

    private void computeTaxes(){
        price += price * IVA;
        System.out.println("Precio con IVA: " + price);
    }

    @Override
    public void run(){
        readPrice();
        computeTaxes();
    }
}
