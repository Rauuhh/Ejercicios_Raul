package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Vector {
    public void vector()
    {
        Scanner entrada = new Scanner(System.in);
        /* int n;

        System.out.println("Introduce los numeros a invertir");

        int[] vector = new int[5];

        for (int i = 0; i < vector.length; i++)
        {
            vector[i] = entrada.nextInt();
        }

        System.out.println(Arrays.toString(vector));

        for ( int i = 0; i<vector.length/2; i++)
        {
            n = vector[i];
            vector[i] = vector[vector.length-1-i];
            vector[vector.length-1-i] = n;

        }
        System.out.println(Arrays.toString(vector));




        Random random = new Random();
        int[] vector = new int[25];
        int numero = 0;

        for (int i = 0; i < vector.length; i++)
        {
            vector[i] = random.nextInt(101);
        }

        System.out.println("Ingresa un numero para buscar [0-100]");
        do {
            if (entrada.hasNextInt())
            {
                numero = entrada.nextInt();
            }
            else
            {
                System.out.println("Ingresa un numero valido");
                entrada.next();
            }
        }while (numero > 100 || numero < 0);

        int contador = 0;

        for (int i = 0; i < vector.length; i++)
        {
            if (vector[i] == numero)
            {
                contador++;
            }
        }

        System.out.println("El numero " + numero + " aparece " + contador + " veces");


    }
    public void vector2()
    {
        Scanner entrada = new Scanner(System.in);
        String  palabra[] = {"Paco", "Pepe", "Manolo", "Antonio", "Alexander"};
        for (String i : palabra)
        {
            System.out.print(i);
        }

         */

       /* int numero[] = {1,2,3,4,5};
        int aux = numero[numero.length - 1];
        for (int i = numero.length-1; i >=0 ; i--)
        {
            if (i == 0)
            {
                numero[i] = aux;
            }else {
                numero[i] = numero[ i - 1];
            }
        }
        System.out.println(Arrays.toString(numero));*/
        /*int palindromo[] = {1,2,3,2,1};
        int si = 0;
        int contador = palindromo.length-1 ;
                for (int i = 0; i<= palindromo.length-1; i++)
                    {
                        if (palindromo[i] == palindromo[contador])
                        {
                            si++;
                        }
                        if (contador != 0)
                        {
                            contador--;
                        }



                    }
                if (si == palindromo.length)
                {
                    System.out.println("Es simetrico: SI");
                }else
                {
                    System.out.println("Es simetrico: NO");
                }*/
        
    }
}
