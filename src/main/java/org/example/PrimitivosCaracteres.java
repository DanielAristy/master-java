package org.example;

public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040'; //Arroba unicode
        char decimal = 64; //Arroba decimal
        char simbolo = '@'; //Arroba simbolo
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("caracter = decimal " + (caracter == decimal));
        System.out.println("simbolo = " + simbolo);
        System.out.println("-------------------------------------------------------------\n");
        System.out.println("tipo char corresponde en byte a " + Character.BYTES);
        System.out.println("tipo char corresponde en bites a " + Character.SIZE);
        System.out.println("valor minimo de un char a " + Character.MIN_VALUE);
        System.out.println("valor maximo de un char a " + Character.MAX_VALUE);

        System.out.println("-------------------------------------------------------------\n");

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';
        System.out.println("Hola" + espacio + "mundo");
        System.out.println("Hola " + retroceso + "mundo");
        System.out.println("Hola" + tabulador + "mundo");
        System.out.println("Hola" + nuevaLinea + "mundo");
        System.out.println("Hola" + retornoCarro + "mundo");
    }
}
