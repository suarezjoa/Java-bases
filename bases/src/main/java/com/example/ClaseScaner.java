package com.example;

import java.util.Scanner;

public class ClaseScaner {
    public static void main( String[] args )
    {
        String usuario = "";

        System.out.println("Proporciona el nombre: ");

        try (Scanner as = new Scanner(System.in)) {
            usuario = as.nextLine();
        }

        System.out.println("El nombre es: " + usuario);
    }
}
