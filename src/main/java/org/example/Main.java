package org.example;

public class Main {
    public static void main(String[] args) {
        ejemploInicial();

    }

    private static void ejemploInicial() {
        String saludar = "Hola Mundo desde Java!";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 11;
        String nombre = "Juan";

        if (numero > 10){
            nombre = "Jeronimo";
        }

        System.out.println(nombre);
    }
}