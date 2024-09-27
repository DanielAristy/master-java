package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ejemploInicial();
        metodosString();
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

    private static void metodosString() {
        System.out.println("Hola \"mundo\"");

        String str1 = "Daniel Gomez";
        String str2 = new String("Daniel Gomez");

        // Por refercencia
        System.out.println("Son el mismo objeto? " + (str1 == str2));
        // length()
        System.out.println("La cantidad de caracteres del objeto str1 = " + (str1.length()));
        /*Se compara por valor
        * Metodo length()*/
        System.out.println("Son el mismo objeto? " + (str1.equals(str2)));
        /* Ignora mayusculas o minusculas
        * equalsIgnoreCase() */
        System.out.println("Son el mismo objeto? " + (str1.equalsIgnoreCase(str2)));
        /*.compareTo
        * compara contra la cadena del argumento:
        * 1. Un valor negativo si la cadena es anterior a b
        * 2. Cero (0) si la cadena es igual a b
        * 3. Un valor positivo si la cadena es posterior a b
        * */
        System.out.println("" + str1.compareTo(str2));
        /*trim()
        * Crea un nuevo objeto eliminando el espacio al inicio o al final de la cadena*/
        String parrafo = "  Hola como estan todos  ";
        System.out.println("Eliminar espacios de " + parrafo + " -> "+ parrafo.trim());
        /*char[] toCharArray
        * Converte una cadena en un arreglo de caracteres*/
        String mensaje = "aniversario";
        char[] caracteres = mensaje.toCharArray();
        System.out.println("mensaje.toCharArray() = " + Arrays.toString(caracteres));
        String alphabet = "Trabajalenguas";
        System.out.println("alphabet.replaceAll(\"a\", \".\") = " + alphabet.replaceAll("a", ".")); // Retorna una nueva instancia imutabilidad
        System.out.println("alphabet.indexOf('a') = " + alphabet.indexOf('a')); // Primera ocurrencia
        System.out.println("alphabet.lastIndexOf('a') = " + alphabet.lastIndexOf('a')); // Ultima ocurrencia
        System.out.println("alphabet.indexOf('a') = " + alphabet.lastIndexOf('z')); // Si no existe ningun caracter retorna -1

    }
}