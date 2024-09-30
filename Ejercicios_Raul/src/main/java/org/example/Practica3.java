package org.example;

import java.util.Scanner;

public class Practica3 {
    public void practica3() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese tu nombre ");
        String nombre = entrada.nextLine();
        System.out.println("Hola " + nombre + ", introduce tu edad");
        int edad = entrada.nextInt();
        while (edad < 0)
        {
            System.out.println("El edad no puede ser negativa");
            System.out.println("Introduce bien la edad");
            edad = entrada.nextInt();
        }
        if (edad > 0 && edad < 18)
        {
            int result = (18 - edad);
            System.out.println("Tienes que ser mayor de edad para votar");
            System.out.println("Te quedan " + result + " año/s para votar");
        }else
        {
            System.out.println("Enhorabuena " + nombre + ", puedes votar");
        }

    }
}
