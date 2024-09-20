package org.example;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SistemasNumericos {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------\n");

        String entrada;
        int numeroDecimal = 0;
        boolean entradaValida;

        do {
            entrada = JOptionPane.showInputDialog("Ingrese un número entero:");

            if (entrada == null) {
                System.exit(0); // El usuario cerró la ventana o presionó Cancelar
            }

            entradaValida = false;

            try {
                numeroDecimal = Integer.parseInt(entrada);
                entradaValida = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese un número entero.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (!entradaValida);

        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        System.out.println("-------------------------------------------------------------\n");
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);
        System.out.println("numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroBinario));

        System.out.println("-------------------------------------------------------------\n");
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);
        System.out.println("numero hexadecimal de " + numeroOctal + " = " + Integer.toHexString(numeroOctal));

        System.out.println("-------------------------------------------------------------\n");
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);

    }

    private static boolean hasSpecialCharacters(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }
}
