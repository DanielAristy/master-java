package org.example;

public class EjemplosStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "imagen_nueva.jpg";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.substring(i + 1) = " + archivo.substring(i + 1));

        String archivo2 = "imagen.nueva.jpg";
        // Es para definir el caracter en particular
        // - \\. ó [.]
        String[] archivoArr = archivo2.split("\\.");
        int longitud = archivoArr.length;
        for (int j = 0; j < longitud; j++) {
            System.out.println("archivoArr["+ j + "] = " + archivoArr[j]);
        }
    }
}
