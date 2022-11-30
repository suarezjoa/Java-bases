package com.example;

public class OperadoresTerniarios {
    public static void main( String[] args )
    {
        String resultado = (1 > 2) ? "Verdadero" : "Falso";
        System.out.println("resultado = " + resultado);
        

        int numero = 9;
        String paridad = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("paridad = " + paridad);
    }
}
