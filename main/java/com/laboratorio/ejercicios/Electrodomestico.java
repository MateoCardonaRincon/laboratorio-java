package com.laboratorio.ejercicios;

import java.util.*;
import java.util.stream.Collectors;

import static javax.swing.UIManager.put;

public class Electrodomestico {

    protected final Integer PRECIOBASE;
    protected final Integer PESO;
    protected final char CONSUMOENERGETICO;
    protected final String COLOR;

    public Electrodomestico() {
        PRECIOBASE = 100;
        PESO = 5;
        CONSUMOENERGETICO = 'F';
        COLOR = "blanco";
    }

    public Electrodomestico(Integer precio, Integer peso) {
        this.PRECIOBASE = precio;
        this.PESO = peso;
        CONSUMOENERGETICO = 'F';
        COLOR = "blanco";
    }

    public Electrodomestico(Integer precio, Integer peso, char consumo, String color) {
        this.PRECIOBASE = precio;
        this.PESO = peso;
        this.CONSUMOENERGETICO = comprobarConsumoEnergetico(consumo);
        this.COLOR = comprobarColor(color);
    }

    private char comprobarConsumoEnergetico(char letra) {
        return ("ABCDEF".indexOf(letra) != -1) ? letra : 'F';
    }

    private String comprobarColor(String color) {
        List<String> coloresPermitidos = Arrays.asList("blanco", "negro", "rojo", "azul", "gris");
        return (coloresPermitidos.contains(color.toLowerCase())) ? color.toLowerCase() : "blanco";
    }

    protected Double precioFinal() {
        Map<Character, Integer> recargoPorConsumo = new HashMap<>() {{
            put('A', 100);
            put('B', 80);
            put('C', 60);
            put('D', 50);
            put('E', 30);
            put('F', 10);
        }};
        return PRECIOBASE + recargoPorPeso() + recargoPorConsumo.get(CONSUMOENERGETICO);
    }

    private Double recargoPorPeso() {
        Map<Integer, Integer> recargoPorPeso = new LinkedHashMap<>() {{
            put(20, 50);
            put(50, 80);
            put(80, 100);
        }};
        double recargo = 10;
        for (Map.Entry<Integer, Integer> item : recargoPorPeso.entrySet()) {
            recargo = obtenerRecargo(item, recargo);
        }
        return recargo;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "PRECIOBASE=" + PRECIOBASE +
                ", PESO=" + PESO +
                ", CONSUMOENERGETICO=" + CONSUMOENERGETICO +
                ", COLOR='" + COLOR + '\'' +
                '}';
    }

    private Double obtenerRecargo(Map.Entry<Integer, Integer> item, double recargo) {
        return PESO >= item.getKey() ? item.getValue() : recargo;
    }

    public Integer getPrecioBase() {
        return PRECIOBASE;
    }

    public Integer getPeso() {
        return PESO;
    }

    public char getConsumoEnergetico() {
        return CONSUMOENERGETICO;
    }

    public String getColor() {
        return COLOR;
    }
}
