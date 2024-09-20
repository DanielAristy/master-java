package org.example;

import javax.swing.*;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------\n");

        Scanner scanner = new Scanner(System.in);

        String entrada;
        int numeroDecimal = 0;

        System.out.println("Ingrese un número entero:");
        entrada = scanner.nextLine();

        try {
            numeroDecimal = Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, ingrese un número entero.\n");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);
        String mensajeBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String mensajeOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String mensajeHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);


        String message = mensajeBinario + "\n" +
                mensajeOctal+ "\n" +
                mensajeHex;
        System.out.println(message);
    }

    /*private static boolean hasSpecialCharacters(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }*/
}
