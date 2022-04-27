package com.laboratorio.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PuntoDiecisiete extends Electrodomestico implements Ejercicio {

    private List<Electrodomestico> electrodomesticos = new ArrayList<>();

    private void instanciarElectrodomesticos() {
        electrodomesticos.add(new Electrodomestico());
        electrodomesticos.add(new Electrodomestico(500, 15));
        electrodomesticos.add(new Lavadora());
        electrodomesticos.add(new Lavadora(600, 20));
        electrodomesticos.add(new Lavadora(25, 650, 15, 'C', "azul"));
        electrodomesticos.add(new Lavadora(30, 700, 20, 'B', "negro"));
        electrodomesticos.add(new Television());
        electrodomesticos.add(new Television(300, 10));
        electrodomesticos.add(new Television(32, true, 300, 10, 'D', "negro"));
        electrodomesticos.add(new Television(43, false, 400, 15, 'E', "azul"));
    }

    private void mostrarPrecios() {
        System.out.println("Precio total lavadoras: " + sumarPrecios(preciosLavadoras()));
        System.out.println("Precio total televisores: " + sumarPrecios(preciosTelevisores()));
        System.out.println("Precio total electrodomésticos: " + sumarPrecios(preciosElectrodomesticos()));
    }

    private Double sumarPrecios(Stream<Double> electrodomestico) {
        return electrodomestico.reduce(0., (a, b) -> a + b);
    }

    private Stream<Double> preciosLavadoras(){
        return electrodomesticos.stream().filter(e -> e instanceof Lavadora).map(Electrodomestico::precioFinal);
    }

    private Stream<Double> preciosTelevisores(){
        return electrodomesticos.stream().filter(e -> e instanceof Television).map(Electrodomestico::precioFinal);
    }

    private Stream<Double> preciosElectrodomesticos(){
        return electrodomesticos.stream().filter(e -> e instanceof Electrodomestico).map(Electrodomestico::precioFinal);
    }

    @Override
    public void run() {
        instanciarElectrodomesticos();
        mostrarPrecios();
    }
}
