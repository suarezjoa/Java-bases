package com.example;

public class VariablesPrimitivas {

    public static void main( String[] args )
    {
        int numero = 10;
        float decimal = 10.5f;

        System.out.println("El valor de la variable numero es: " + numero);
        System.out.println("El valor de la variable decimal es: " + decimal);

        String cadena = "Hola Mundo";

        System.out.println(cadena);

        cadena = "Adios Mundo";

        System.out.println(cadena);
        // la palabra reserbada VAR infiere el tipo de dato de la variable.
        //var algo = "Hola Mundo";
    }
}
