package com.laboratorio;

public class EjercicioEjecutable implements Ejercicio {

    private void elegirEjercicio() {
        System.out.println("Digite el número del ejercicio que quiere ejecutar (del 1 al 18): ");
        String numeroEjercicio = SCANNER.nextLine();

        switch (numeroEjercicio) {
            case "1" -> new PuntoUno().run();
            case "2" -> new PuntoDos().run();
            case "3" -> new PuntoTres().run();
            case "4" -> new PuntoCuatro().run();
            case "5" -> new PuntoCinco().run();
            case "6" -> new PuntoSeis().run();
            case "7" -> new PuntoSiete().run();
            case "8" -> new PuntoOcho().run();
            case "9" -> new PuntoNueve().run();
            case "10" -> new PuntoDiez().run();
            case "11" -> new PuntoOnce().run();
            case "12" -> new PuntoDoce().run();
            case "13" -> new PuntoTrece().run();
            case "14" -> new PuntoCatorce().run();
            case "15" -> new PuntoQuince().run();
            case "16" -> new PuntoDieciseis().run();
            case "17" -> new PuntoDiecisiete().run();
            case "18" -> new PuntoDieciocho().run();
            default -> elegirEjercicio();
        }
    }

    @Override
    public void run() {
        elegirEjercicio();
    }
}
