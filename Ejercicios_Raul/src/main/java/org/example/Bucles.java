package org.example;

import java.util.Scanner;

public class Bucles {
    public void bucles(){

        Scanner entrada = new Scanner(System.in);
        /*
        1-------------------------------------
        System.out.println("Ingrese su contraseña");
        String contrasena = entrada.nextLine();
        System.out.println("Verifica su contraseña");
        String contra = entrada.nextLine();
        while (!contra.equals(contrasena))
        {
            System.out.println("Incorrecto, vuelvela a verificar");
            contra = entrada.nextLine();

        }
        System.out.println("Contraseña correcta");
        ---------------------------------------- */
        /*
        2-----------------------------------------

        System.out.println("Ingrese un numero");
        int num = entrada.nextInt();
        for (int i = num; i >= 1; i-- )
        {
            System.out.println(i);
        }
        ------------------------------------------*/

        /*
        3
         -----------------------------------------
        for(int i = 1; i < 50; i++)
        {
             if (i % 3 == 0)
                {
                    System.out.println(i);
                }
        }
         -----------------------------------------*/

        /*
        4
        ------------------------------------------

        System.out.println("Introduce una palabra");
        String palabra = entrada.nextLine();
        for(int i=0; i<palabra.length(); i++)
        {
            System.out.println(palabra.charAt(i));
        }
          -------------------------------------*/
        /*
        5
        --------------------------------------
        System.out.println("Ingrese un numero");
        int numero = entrada.nextInt();
        for (int i = 1; i <= 10; i++)
        {
         int num = numero * i;
         System.out.println(num + " * " + i + " = " + num);
        }
        ----------------------------------------*/

        /*
        6
        ------------------------------------------------
        System.out.println("Cuantos numeros quieres sumar");
        int numeros = entrada.nextInt();
        int resultado = 0;
        for (int i = 1; i <= numeros; i++)
        {
            System.out.print("Inserta Nº" + i + ":");
            int num = entrada.nextInt();
            resultado = resultado + num;
        }
        System.out.println("El resultado es " + resultado);
        -------------------------------------------------*/

        /*
        7
        ---------------------------------------------
        System.out.println("Introuce el numero para factorizarlo");
        int resultado = 1;
        int numero = entrada.nextInt();
        for (int i = numero; i >= 1; i--)
        {
            resultado = resultado * i;
        }
        System.out.println("El resultado es:" + resultado);
        ---------------------------------------------*/

        /*
        8
         -------------------------------------------
        System.out.println("Ingresa una cadena:");
        String cadena = entrada.nextLine();
        for(int i = cadena.length() -1 ; i >= 0; i--)
        {
            System.out.print(cadena.charAt(i));
        }
        ---------------------------------------------*/
    }
}
