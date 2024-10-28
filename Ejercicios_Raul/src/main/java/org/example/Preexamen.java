package org.example;

import java.util.Scanner;

public class Preexamen {
    public void preexamen() {
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

        /*System.out.print("Ingresa tu nota numerica(Redondeada): ");
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

        }*/
        /*int sueldos = 0;
        System.out.print("Ingresa el sueldo 1: ");
        int sueldo1 = entrada.nextInt();
        if (sueldo1 > 1000)
        {sueldos = sueldos + 1;}
        System.out.print("Ingresa el sueldo 2: ");
        int sueldo2 = entrada.nextInt();
        if (sueldo2 > 1000)
        {sueldos = sueldos + 1;}
        System.out.print("Ingresa el sueldo 3: ");
        int sueldo3 = entrada.nextInt();
        if (sueldo3 > 1000)
        {sueldos = sueldos + 1;}
        System.out.print("Ingresa el sueldo 4: ");
        int sueldo4 = entrada.nextInt();
        if (sueldo4 > 1000)
        {sueldos = sueldos + 1;}
        System.out.print("Ingresa el sueldo 5: ");
        int sueldo5 = entrada.nextInt();
        if (sueldo5 > 1000)
        {sueldos = sueldos + 1;}
        if (sueldo1 > sueldo2 && sueldo1 > sueldo3 && sueldo1 > sueldo4 && sueldo1 > sueldo5 )
        {
            System.out.println("El sueldo mas alto es de " + sueldo1);
        }
        if (sueldo2 > sueldo1 && sueldo2 > sueldo3 && sueldo2 > sueldo4 && sueldo2 > sueldo5 )
        {
            System.out.println("El sueldo mas alto es de " + sueldo2);
        }
        if (sueldo3 > sueldo1 && sueldo3 > sueldo2 && sueldo3 > sueldo4 && sueldo3 > sueldo5 )
        {
            System.out.println("El sueldo mas alto es de " + sueldo3);
        }
        if (sueldo4 > sueldo1 && sueldo4 > sueldo2 && sueldo4 > sueldo3 && sueldo4 > sueldo5 )
        {
            System.out.println("El sueldo mas alto es de " + sueldo4);
        }
        if (sueldo5 > sueldo1 && sueldo5 > sueldo2 && sueldo5 > sueldo3 && sueldo5 > sueldo4 )
        {
            System.out.println("El sueldo mas alto es de " + sueldo5);
        }
        System.out.println("hay " + sueldos + " sueldos q sean mas de 1000€");*/

       /* System.out.print("Ingrese el numero de alumnos: ");
        int alumnos = entrada.nextInt();
        float edad2 = 0;
        float altura2 = 0;
        int mayor = 0;
        int alto = 0;
        for (int i = 0; i < alumnos; i++)
        {
            System.out.print("Introduce la edad del alumno " + (i + 1) + ": ");
             float edad = entrada.nextInt();
             if (edad > 18)
                 mayor = mayor + 1;
            System.out.print("Introduce la altura " + (i + 1) + ": ");
             float altura = entrada.nextInt();
            if (altura > 175)
                alto = alto + 1;
             edad2 += edad;
             altura2 += altura;
        }

        float edadmedia = edad2 / alumnos;
        float alturamedia = altura2 / alumnos;
        System.out.println("El edad media es: " + edadmedia + " y la altura media es " + alturamedia + "cm");
        System.out.println("Hay " + mayor + " alumnos mayores de edad");
        System.out.println("Hay " + alto + " mas altos que 175");*/
        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();
        int fibbonaci = 0;
        int fibbonaci2 = 1;
        System.out.print("Secuencia de numeros: ");
        for (int i = 0 ; i < numero ; i++)
        {
            System.out.print(fibbonaci + " ");
            fibbonaci = fibbonaci + fibbonaci2;
            fibbonaci2 = fibbonaci - fibbonaci2;
        }



    }
}

