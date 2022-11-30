package com.example;

public class ConcadenacionDeCadenas {
    public static void main( String[] args )
    {
        String usuario = "Juan";
        String titulo = "Ingeniero";


        String union = titulo + " " + usuario;

        System.out.println(union);

        int i = 3;
        int j = 4;

        System.out.println(i + j+ " " + titulo + " " + usuario);
        System.out.println(usuario +" "+ i + j);
        System.out.println(usuario +" "+  (i + j));
    }
}
