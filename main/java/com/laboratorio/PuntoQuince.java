package com.laboratorio;

import javax.swing.JOptionPane;

public class PuntoQuince implements Ejercicio {

    private String userSelection;

    private void iterateUntilUserQuit() {
        readUserSelection();
        executeUserAction();
    }

    private void executeUserAction() {
        switch (userSelection) {
            case "1", "2", "3", "4", "5", "6", "7" -> iterateUntilUserQuit();
            case "8" -> JOptionPane.showMessageDialog(null, "Vuelve pronto");
            default -> {
                JOptionPane.showMessageDialog(null, "OPCION INCORRECTA");
                iterateUntilUserQuit();
            }
        }
    }

    private void readUserSelection() {
        userSelection = JOptionPane.showInputDialog(
                "******GESTION CINEMATOGRAFICA******\n" +
                        "1-NUEVO ACTOR\n" +
                        "2-BUSCAR ACTOR\n" +
                        "3-ELIMINAR ACTOR\n" +
                        "4-MODIFICAR ACTOR\n" +
                        "5-VER TODOS LOS ACTORES\n" +
                        "6-VER PELICULAS DE LOS ACTORES\n" +
                        "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                        "8-SALIR");
    }

    @Override
    public void run() {
        iterateUntilUserQuit();
    }
}
