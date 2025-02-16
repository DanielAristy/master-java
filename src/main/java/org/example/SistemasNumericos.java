package org.example;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SistemasNumericos {
    public static void main(String[] args) {
        String entrada;
        int numeroDecimal = 0;
        entrada = JOptionPane.showInputDialog("Ingrese un número entero:");

        try {
            numeroDecimal = Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese un número entero.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            main(args);
            System.exit(0);
        }

        String mensajeBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String mensajeOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String mensajeHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);


        String message = mensajeBinario + "\n" +
                mensajeOctal+ "\n" +
                mensajeHex;
        JOptionPane.showMessageDialog(null, message);
    }

    /*private static boolean hasSpecialCharacters(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }*/
}
