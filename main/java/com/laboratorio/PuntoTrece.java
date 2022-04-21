package com.laboratorio;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PuntoTrece implements Ejercicio {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("(yyyy/MM/dd)(hh:mm:ss)");

    private String takeCurrentDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        return formatter.format(currentDateTime);
    }

    private void displayDateTime() {
        JOptionPane.showMessageDialog(null,takeCurrentDateTime());
    }

    @Override
    public void run() {
        displayDateTime();
    }
}
