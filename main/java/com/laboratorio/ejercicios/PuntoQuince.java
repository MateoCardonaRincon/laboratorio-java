package com.laboratorio.ejercicios;

public class PuntoQuince implements Ejercicio {

    private void iterateUntilUserQuit() {
        String userSelection;
        do {
            userSelection = readUserSelection();
            executeUserAction(userSelection);
        } while (!userSelection.equals("8"));
    }

    private String readUserSelection() {
        System.out.println("****** GESTION CINEMATOGRAFICA ********\n" +
                "1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6-VER PELICULAS DE LOS ACTORES\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR");
        return SCANNER.nextLine();
    }

    private void executeUserAction(String userSelection) {
        switch (userSelection) {
            case "1", "2", "3", "4", "5", "6", "7" -> { break; }
            case "8" -> System.out.println("¡Hasta pronto!");
            default -> {
                System.out.println("Opción incorrecta");
            }
        }
    }

    @Override
    public void run() {
        iterateUntilUserQuit();
    }
}
