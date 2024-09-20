package org.example;

public class PrimitivosEnteros {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------\n");
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("valor minimo de un byte a " + Byte.MIN_VALUE);
        System.out.println("valor maximo de un byte a " + Byte.MAX_VALUE);

        System.out.println("-------------------------------------------------------------\n");
        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("valor minimo de un short a " + Short.MIN_VALUE);
        System.out.println("valor maximo de un short a " + Short.MAX_VALUE);

        System.out.println("-------------------------------------------------------------\n");
        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("valor minimo de un int a " + Integer.MIN_VALUE);
        System.out.println("valor maximo de un int a " + Integer.MAX_VALUE);

        System.out.println("-------------------------------------------------------------\n");
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("valor minimo de un long a " + Long.MIN_VALUE);
        System.out.println("valor maximo de un long a " + Long.MAX_VALUE);

        System.out.println("-------------------------------------------------------------\n");
    }
}
