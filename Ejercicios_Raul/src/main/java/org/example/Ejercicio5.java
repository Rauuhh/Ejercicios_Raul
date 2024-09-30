package org.example;

import java.util.Scanner;

public class Ejercicio5 {
    public void ejercicio5() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int numero1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = entrada.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int numero3 = entrada.nextInt();
        if (numero1 == numero2 || numero2 == numero3 || numero1 == numero3 )
        {
            System.out.println("No metas numeros iguales");
            System.exit(101);
        }
        if (numero1 < numero2 && numero1 < numero3)
        {
            System.out.println("El numero " + numero1 + " es el menor");
        }
        if (numero2 < numero1 && numero2 < numero3)
        {
            System.out.println("El numero " + numero2 + " es el menor");
        }
        else
        {
            System.out.println("El numero " + numero3 + " es el menor");
        }
        }
}