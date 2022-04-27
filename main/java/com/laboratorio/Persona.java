package com.laboratorio;

import java.util.concurrent.ThreadLocalRandom;

public class Persona {

    private final char SEXO;
    private String dni;
    private Integer edad = 0;
    private Double peso = 0.0;
    private Double altura = 0.0;
    private String nombre = "";

    public Persona() {
        SEXO = 'H';
        this.dni = generaDNI();
    }

    public Persona(String nombre, Integer edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.SEXO = comprobarSexo(sexo);
        this.dni = generaDNI();
    }

    public Persona(String nombre, Integer edad, char sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.SEXO = comprobarSexo(sexo);
        this.dni = generaDNI();
        this.peso = peso;
        this.altura = altura;
    }

    protected int calcularIMC() {
        double imc = peso / Math.pow(altura, 2);
        int rangoIMC = sobrePeso(imc);
        return bajoPeso(imc, rangoIMC);
    }

    private int sobrePeso(double imc) {
        return imc > 25 ? 1 : 0;
    }

    private int bajoPeso(double imc, int rangoIMC) {
        return imc < 20 ? -1 : rangoIMC;
    }

    protected boolean esMayorDeEdad() {
        return edad >= 18;
    }

    private char comprobarSexo(char sexo) {
        return sexo == 'M' ? 'M' : 'H';
    }

    public String generaDNI() {
        int numeroAleatorio = ThreadLocalRandom.current().nextInt(10000000, 100000000);
        String letraGenerada = generarLetra(numeroAleatorio);
        return numeroAleatorio + letraGenerada;
    }

    // comúnmente, con este algoritmo se generan las letras aleatorias del DNI
    private String generarLetra(int numeroAleatorio) {
        int resto = numeroAleatorio % 23;
        String letras[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B",
                "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        return letras[resto];
    }

    protected Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    protected String getNombre() {
        return this.nombre;
    }

    protected Persona setEdad(Integer edad) {
        this.edad = edad;
        return this;
    }

    protected Persona setPeso(Double peso) {
        this.peso = peso;
        return this;
    }

    protected Persona setAltura(Double altura) {
        this.altura = altura;
        return this;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo='" + SEXO + '\'' +
                ", dni='" + dni + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
