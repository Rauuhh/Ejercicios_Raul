package org.example;

import java.util.Scanner;

public class Preexamen
{
    public void preexamen()
    {
        Scanner entrada = new Scanner(System.in);
        /*System.out.println("Cuantos numeros quieres introducir");
        int numeros = entrada.nextInt();
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        for (int i = 1; i <= numeros; i++)
        {
            System.out.println("introduce el numero " + i);
            int numero = entrada.nextInt();
            if (numero > 0)
            {
                numero1 += 1;
            }
            else if (numero < 0)
            {
                numero2 += 1;
            }
            else
            {
                numero3 += 1;
            }
        }
        System.out.println("hay " + numero1 + "numeros mayores que 0, " + numero2 + " numeros menores que 0, y has puesto el 0 " + numero3 + " veces");

         */
        /*System.out.print("Ingrese un numero base: ");
        int base = entrada.nextInt();
        System.out.print("Ingrese un numero exponente: ");
        int resultado = 1;
        int exponente = entrada.nextInt();
        for (int i = 1; i <= exponente; i++)
        {
             resultado *= base;
        }
        System.out.println("El resultado es: " + resultado);*/

        /*System.out.print("Ingrese los meses de financiacion: ");
        int meses = entrada.nextInt();
        int mes1 = 10;
        int mestotal = 0;
        for (int i = 1; i <= meses; i++)
        {
            System.out.println("Mes" + i + ":" + mes1);
            mestotal += mes1;
            mes1 = mes1 * 2;
        }
        System.out.print("Total a pagar " + mestotal);*/

        System.out.print("Ingresa tu nota numerica(Redondeada): ");
        int nota = entrada.nextInt();
        switch (nota)
        {
            case 0,1,2,3,4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7,8:
                System.out.println("Notable");
                break;
            case 9,10:
                System.out.println("Sobresalinete");
                break;
            default:
                System.out.println("Error");
                break;

        }

    }
}
