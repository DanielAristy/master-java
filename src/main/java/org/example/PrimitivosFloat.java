package org.example;

public class PrimitivosFloat {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------\n");
        float realFloat = 0.00000000015f; //1.5E-10 mantisa
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("valor minimo de un float a " + Float.MIN_VALUE);
        System.out.println("valor maximo de un float a " + Float.MAX_VALUE);

        System.out.println("-------------------------------------------------------------\n");
        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("tipo double corresponde en bites a " + Double.SIZE);
        System.out.println("valor minimo de un double a " + Double.MIN_VALUE);
        System.out.println("valor maximo de un double a " + Double.MAX_VALUE);
    }
}
