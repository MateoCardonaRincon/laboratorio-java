package com.laboratorio;

public class Lavadora extends Electrodomestico {

    private final Integer CARGA;

    public Lavadora() {
        this.CARGA = 5;
    }

    public Lavadora(Integer precio, Integer peso) {
        super(precio, peso);
        this.CARGA = 5;
    }

    public Lavadora(Integer carga, Integer precio, Integer peso, char consumo, String color) {
        super(precio, peso, consumo, color);
        this.CARGA = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "PRECIOBASE=" + PRECIOBASE +
                ", PESO=" + PESO +
                ", CONSUMOENERGETICO=" + CONSUMOENERGETICO +
                ", COLOR='" + COLOR + '\'' +
                ", CARGA=" + CARGA +
                '}';
    }

    @Override
    protected Double precioFinal() {
        return super.precioFinal() + recargoPorCarga();
    }

    private Integer recargoPorCarga() {
        return CARGA > 30 ? 50 : 0;
    }

    public Integer getCARGA() {
        return CARGA;
    }

}
