package com.laboratorio;

public class Television extends Electrodomestico {

    private final Integer RESOLUCION;
    private final Boolean TDT;

    public Television() {
        this.RESOLUCION = 20;
        this.TDT = false;
    }

    public Television(Integer precio, Integer peso) {
        super(precio, peso);
        this.RESOLUCION = 20;
        this.TDT = false;
    }

    public Television(Integer RESOLUCION, Boolean TDT, Integer precio, Integer peso, char consumo, String color) {
        super(precio, peso, consumo, color);
        this.RESOLUCION = RESOLUCION;
        this.TDT = TDT;
    }

    @Override
    protected Double precioFinal() {
        return super.precioFinal() + PRECIOBASE * recargoPorResolucion() + recargoPorTDT();
    }

    private Double recargoPorResolucion() {
        return RESOLUCION > 40 ? 0.3 : 0.0;
    }

    private Integer recargoPorTDT() {
        return TDT ? 50 : 0;
    }

    @Override
    public String toString() {
        return "Television{" +
                "PRECIOBASE=" + PRECIOBASE +
                ", PESO=" + PESO +
                ", CONSUMOENERGETICO=" + CONSUMOENERGETICO +
                ", COLOR='" + COLOR + '\'' +
                ", RESOLUCION=" + RESOLUCION +
                ", TDT=" + TDT +
                '}';
    }

    public Integer getRESOLUCION() {
        return RESOLUCION;
    }

    public Boolean getTDT() {
        return TDT;
    }
}
