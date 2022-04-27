package com.laboratorio;

public class PuntoOcho implements Ejercicio {

    private String readDay() {
        System.out.println("Ingresa un día de la semana");
        String day = SCANNER.nextLine();
        return day;
    }

    private void isWorkingDay(String day) {
        switch (day.toLowerCase()) {
            case "lunes", "martes", "miercoles", "jueves", "viernes" -> System.out.println("Es un día laboral");
            default -> System.out.println("No es un día laboral");
        }
    }

    @Override
    public void run() {
        isWorkingDay(readDay());
    }

}
