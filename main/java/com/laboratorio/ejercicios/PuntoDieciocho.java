package com.laboratorio.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class PuntoDieciocho implements Ejercicio {

    private List<Serie> series = new ArrayList<>();
    private List<Videojuego> videojuegos = new ArrayList<>();

    private void instanciarSeries() {
        series.add(new Serie());
        series.add(new Serie("Dark", "Baran bo Odar and Jantje Friese"));
        series.add(new Serie("Friends", 10, "Comedia", "Hwang Dong-hyuk"));
        series.add(new Serie("The Big Bang Theory", 12, "Comedia", "Chuck Lorre et al."));
        series.add(new Serie("The 100", 7, "Ciencia ficción", "Jason Rothenberg"));
    }

    private void instanciarVideojuegos() {
        videojuegos.add(new Videojuego());
        videojuegos.add(new Videojuego("Katana Zero", 5));
        videojuegos.add(new Videojuego("Crash Bandicoot", 10, "Aventura", "Naughty Dog"));
        videojuegos.add(new Videojuego("Hollow Knight", 27, "Metroidvania", "Team Cherry"));
        videojuegos.add(new Videojuego("Guitar Hero 3: Legends of Rock", 20, "Música", "Budcat Creations"));
    }

    public void entregarUnidades() {
        series.get(1).entregar();
        series.get(3).entregar();
        series.get(4).entregar();
        series.get(4).devolver();

        videojuegos.get(0).entregar();
        videojuegos.get(2).entregar();
        videojuegos.get(4).entregar();
    }

    private void encontrarSeriesEntregadas() {
        System.out.println("Series entregadas (" +
                series.stream().filter(Serie::isEntregado).count() + "):");

        series.stream().filter(Serie::isEntregado).forEach(System.out::println);
    }

    private void encontrarVideojuegosEntregados() {
        System.out.println("Videojuegos entregados ("
                + videojuegos.stream().filter(Videojuego::isEntregado).count() + "):");

        videojuegos.stream().filter(Videojuego::isEntregado).forEach(System.out::println);
    }

    private Serie obtenerSerieMasExtensa() {
        Serie serieMasExtensa = series.get(0);
        for (int i = 0; i < series.size() - 1; i++) {
            serieMasExtensa = serieMasExtensa.copareTo(series.get(i + 1));
        }
        return serieMasExtensa;
    }

    private Videojuego obtenerVideojuegoMasExtenso() {
        Videojuego juegoMasExtenso = videojuegos.get(0);
        for (int i = 0; i < videojuegos.size() - 1; i++) {
            juegoMasExtenso = juegoMasExtenso.copareTo(videojuegos.get(i + 1));
        }
        return juegoMasExtenso;
    }

    @Override
    public void run() {
        instanciarSeries();
        instanciarVideojuegos();
        entregarUnidades();
        encontrarSeriesEntregadas();
        encontrarVideojuegosEntregados();
        System.out.println("Serie más extensa:\n" + obtenerSerieMasExtensa());
        System.out.println("Videojuego más extenso:\n" + obtenerVideojuegoMasExtenso());
    }
}
