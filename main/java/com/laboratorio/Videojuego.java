package com.laboratorio;

public class Videojuego implements Entregable {

    private String titulo = "";
    private Integer horasEstimadas = 10;
    private Boolean entregado = false;
    private String genero = "";
    private String compania = "";

    public Videojuego() {
    }

    public Videojuego(String titulo, Integer horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, Integer horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public Videojuego setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public Integer getHorasEstimadas() {
        return horasEstimadas;
    }

    public Videojuego setHorasEstimadas(Integer horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
        return this;
    }

    public String getGenero() {
        return genero;
    }

    public Videojuego setGenero(String genero) {
        this.genero = genero;
        return this;
    }

    public String getCompania() {
        return compania;
    }

    public Videojuego setCompania(String compania) {
        this.compania = compania;
        return this;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public Boolean isEntregado() {
        return entregado;
    }

    @Override
    public Videojuego copareTo(Object a) {
        Videojuego videojuego = (Videojuego) a;
        if(this.horasEstimadas > videojuego.getHorasEstimadas()){
            return this;
        }
        return videojuego;
    }
}
