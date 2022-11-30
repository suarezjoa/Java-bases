package com.example;

public class BanderaYIf {
    public static void main( String[] args )
    {
        Boolean bandera = true;

        if(bandera){
            System.out.println("La bandera es verdadera");
        }
        else{
            System.out.println("La bandera es falsa");
        }

        int edad = 15;

        boolean esAdulto = edad >= 18;

        if(esAdulto){
            System.out.println("Es adulto");
        }
        else{
            System.out.println("Es menor de edad");
        }
    }
}
