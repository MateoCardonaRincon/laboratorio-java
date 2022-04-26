package com.laboratorio;

import java.util.ArrayList;
import java.util.List;

public class PuntoDieciseis extends Persona implements Ejercicio {

    private String nombreEntrada;
    private Integer edadEntrada;
    private char sexoEntrada;
    private String dni;
    private Double pesoEntrada;
    private Double alturaEntrada;
    private List<Persona> personas = new ArrayList<>();

    private void pedirDatos() {
        System.out.println("Nombre: ");
        nombreEntrada = SCANNER.nextLine();
        System.out.println("Edad: ");
        edadEntrada = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Sexo (Digite H: Hombre, M: Mujer)");
        sexoEntrada = SCANNER.nextLine().charAt(0);
        System.out.println("Peso (en Kilogramos): ");
        pesoEntrada = Double.parseDouble(SCANNER.nextLine());
        System.out.println("Altura (en metros): ");
        alturaEntrada = Double.parseDouble(SCANNER.nextLine());
    }

    // Crea 3 objetos de la clase Persona, con las indicaciones del enunciado
    private void instanciarPersonas() {
        personas.add(new Persona(nombreEntrada, edadEntrada, sexoEntrada, pesoEntrada, alturaEntrada));
        personas.add(new Persona(nombreEntrada, edadEntrada, sexoEntrada));
        personas.add(new Persona());

        personas.get(2).setNombre("José");
        personas.get(2).setEdad(15);
        personas.get(2).setPeso(50.8);
        personas.get(2).setAltura(1.55);
    }

    private void comprobarIMC() {
        for (Persona persona : personas) {
            mostrarIMC(persona);
        }
    }

    private void mostrarIMC(Persona persona) {
        String equivalencias[] = {"bajo peso", "un peso ideal", "sobrepeso"};
        System.out.println(persona.getNombre() + " tiene " + equivalencias[persona.calcularIMC() + 1]);
    }

    private void comprobarMayoriaDeEdad() {
        for (Persona p : personas) {
            System.out.println(p.getNombre() + ": " + (p.esMayorDeEdad() ? "mayor" : "menor") + " de edad.");
        }
    }

    private void mostrarInformacion() {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    @Override
    public void run() {
        pedirDatos();
        instanciarPersonas();
        comprobarIMC();
        comprobarMayoriaDeEdad();
        mostrarInformacion();
    }
}
