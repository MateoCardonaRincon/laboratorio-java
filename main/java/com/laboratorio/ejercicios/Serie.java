package com.laboratorio.ejercicios;

public class Serie implements Entregable {

    private String titulo = "";
    private Integer numeroTemporadas = 3;
    private Boolean entregado = false;
    private String genero = "";
    private String creador = "";

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, Integer numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public Serie setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public Integer getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public Serie setNumeroTemporadas(Integer numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
        return this;
    }

    public String getGenero() {
        return genero;
    }

    public Serie setGenero(String genero) {
        this.genero = genero;
        return this;
    }

    public String getCreador() {
        return creador;
    }

    public Serie setCreador(String creador) {
        this.creador = creador;
        return this;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
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
    public Serie copareTo(Object a) {
        Serie videojuego = (Serie) a;
        if (this.numeroTemporadas > videojuego.getNumeroTemporadas()) {
            return this;
        }
        return videojuego;
    }
}
