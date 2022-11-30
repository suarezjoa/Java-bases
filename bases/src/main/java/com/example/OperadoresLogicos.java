package com.example;

public class OperadoresLogicos {
    public static void main(String args[]) {
        int a=3, b=2;
        int resultado = a + b;
        System.out.println("resultado suma = " + resultado);
        
        resultado = a - b;
        System.out.println("resultado resta = " + resultado);
        
        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);
        
        double resultado2 = 3D / b;
        System.out.println("resultado division = " + resultado2);
        
        resultado = a % b;
        System.out.println("resultado modulo = " + resultado);
        
        if( b % 2 == 0){
            System.out.println("Es numero par");
        }
        else{
            System.out.println("Es numero impar"); 
        }
        int h = 1;

        h += 2; // h = h + 2	
        System.out.println("h = " + h);

        int i = -h; // i = -1
        System.out.println("i = " + i);

        boolean verdadero = true;
        boolean falso = !verdadero; // falso = false
        System.out.println("falso = " + falso);

        int j = 3;
        int k = ++j; // k = 4, j = 4 pre incremento
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        int l = 3;
        int m = l++; // m = 3, l = 4 post incremento
        System.out.println("l = " + l);
        System.out.println("m = " + m);
        int n = 3;
        int o = --n; // o = 2, n = 2 pre decremento
        System.out.println("n = " + n);
        System.out.println("o = " + o);
        int p = 3;
        int q = p--; // q = 3, p = 2 post decremento
        System.out.println("p = " + p);
        System.out.println("q = " + q);
    }
}
