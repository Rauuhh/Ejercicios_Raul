package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica3 {
    public void practica3() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese tu nombre ");
        String nombre = entrada.nextLine();
        int edad = 0;
        boolean hola = true;
        while (hola == true) {
            try {
                System.out.println("Hola " + nombre + ", introduce tu edad");
                edad = entrada.nextInt();
                hola = false;
            } catch
            (NumberFormatException | InputMismatchException e) {

                System.out.println("No se puede ingresar el edad, no has puesto 1 numero");
                entrada.nextLine();
            }
        }
        while (edad < 0)
        {

                if (edad < 0)
                System.out.println("La edad no puede ser negativa");
                System.out.println("Introduce bien la edad");
                edad = entrada.nextInt();
        }
        if (edad >= 0 && edad < 18)
        {
            int result = (18 - edad);
            System.out.println("Tienes que ser mayor de edad para votar");
            System.out.println("Te quedan " + result + " año/s para votar");
        }
        if (edad > 18)
        {
            System.out.println("Enhorabuena " + nombre + ", puedes votar");
        }

    }
}
