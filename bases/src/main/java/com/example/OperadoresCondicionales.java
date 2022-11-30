package com.example;

import java.util.Scanner;

public class OperadoresCondicionales {
    public static void main( String[] args )
    {
        int a = 10;
        int MAX = 10;
        int MIN = 0;


        boolean c = a <= MAX && a >= MIN;
        System.out.println("c = " + c);

        if(a <= MAX && a >= MIN ){
            System.out.println("Dentro de rango");
        }
        else{
            System.out.println("Fuera de rango");
        }

        boolean estoyAlPedo = false;
        boolean tengoDinero = true;

        if(estoyAlPedo || tengoDinero){
            System.out.println("Vamos de shopping");
        }
        else{
            System.out.println("Me quedo en casa");
        }







        try (Scanner consola = new Scanner(System.in)) {
            System.out.println("Proporciona un valor entre 0 y 12: ");
            int mes = Integer.parseInt(consola.nextLine());
            System.out.println("numero = " + mes);

            if (mes ==1 || mes == 2 || mes == 12){
                System.out.println("Es invierno");
            }
            else if (mes == 3 || mes == 4 || mes == 5){
                System.out.println("Es primavera");
            }
            else if (mes == 6 || mes == 7 || mes == 8){
                System.out.println("Es verano");
            }
            else if (mes == 9 || mes == 10 || mes == 11){
                System.out.println("Es otoño");
            }
            else{
                System.out.println("Mes incorrecto");
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
