package org.example;

import java.util.Scanner;

public class Ejercicio2 {
    public void ejercicio2() {
        System.out.println("Ingrese un numero : ");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        System.out.println("Ingrese otro numero");
        int numero2 = entrada.nextInt();

        if (numero < numero2) {
            System.out.println("El " + numero + " es menor que el " + numero2);
        }
        if (numero > numero2) {
            System.out.println("El " + numero +" es mayor que el " + numero2);
        }
        if (numero == numero2) {
            System.out.println("ERROR, no introduzcas 2 veces el mismo numero");
        }




    }
}