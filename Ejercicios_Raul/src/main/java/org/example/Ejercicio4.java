package org.example;

import java.util.Scanner;

public class Ejercicio4 {
    public void ejercicio4() {
        Scanner entrada = new Scanner(System.in);
       System.out.print("Ingrese un numero base: ");
       int numero = entrada.nextInt();
       if (numero <= 0)
       {
           System.out.println("El numero tiene que ser positivo");
           while (numero <= 0)
           {
               System.out.println("Ingrese un numero valido");
               numero = entrada.nextInt();
           }
       }
           System.out.println("Ingrese la altura");
           int altura = entrada.nextInt();
           if (altura <= 0)
           {
               System.out.println("El altura tiene que ser positivo");
               while (altura <= 0)
               {
                   System.out.println("Ingrese un numero valido");
                   altura = entrada.nextInt();
               }
           }
               int resultado = ((numero * altura)/2);
               System.out.println("El area del triangulo es: " + resultado);



    }
}