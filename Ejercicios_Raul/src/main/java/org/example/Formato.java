package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Formato {
    public void formato() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido al programa de las generaciones");
        System.out.println("Elige un modo");
        System.out.println("    1. Año de nacimiento");
        System.out.println("    2. Edad");
        String opcion = entrada.nextLine();
        LocalDateTime Time = LocalDateTime.now();
        int actual = Time.getYear();
        int nacim = 1800;
        if (opcion.equals("1"))
        {
                System.out.println("Elige un año");
                String nacimiento = entrada.next();
                try
                {
                    nacim = Integer.parseInt(nacimiento);
                }
                catch (NumberFormatException error)
                {
                        System.out.println("Has introducido en formato erroneo, no es un numero");
                }

                if (nacim < 1900 || nacim > actual)
                {
                    System.out.println("El año introducido no es correcto");
                }
        }
        else if (opcion.equals("2"))
        {
            int edad = 0;
            System.out.println("Ingresa tu edad");
            if (entrada.hasNextInt())
            {
                edad = entrada.nextInt();
            }
            else
            {
                System.out.println("La edad introducido no tiene un formato valido");
            }
            if (edad < 0)
            {
                System.out.println("La edad introducida no es valida");
            }
            else
            {
                nacim = actual - edad;
            }

        }
        else
        {
            System.out.println("Opcion no valida");
        }
        if (nacim >= 1900 && nacim <= 1927)
        {
            System.out.println("Eres de la generacion sin bautizar");
        }
        else if (nacim >= 1928 && nacim <= 1944)
        {
            System.out.println("Eres de la generacion Silent");
        }
        else if (nacim >= 1945 && nacim <= 1964)
        {
            System.out.println("Eres de la generacion baby boomers");
        }
        else if (nacim >= 1965 && nacim <= 1981)
        {
            System.out.println("Eres de la generacion X");
        }
        else if (nacim >= 1982 && nacim <= 1994)
        {
            System.out.println("Eres de la generacion Y/Millenial");
        }
        else if (nacim >= 1995 && nacim <= actual)
        {
            System.out.println("Eres de la generacion Z/Centennial");
        }
    }
}