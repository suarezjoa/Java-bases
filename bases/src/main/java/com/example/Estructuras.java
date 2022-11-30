package com.example;

public class Estructuras {
    public static void main(String args[]) {
        //Convertir tipo String a un tipo int
        int edad = Integer.parseInt("20");
        //var edad = "20";
        System.out.println("edad = " + (edad + 1));
        
        double valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        try (//Pedir un valor 
        Scanner consola = new Scanner(System.in)) {
            System.out.println("Proporciona tu edad:");
            edad = Integer.parseInt( consola.nextLine() );
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("edad = " + edad);
    }
}
