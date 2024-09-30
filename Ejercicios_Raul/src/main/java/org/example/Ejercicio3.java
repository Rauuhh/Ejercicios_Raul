package org.example;

import java.util.Scanner;

public class Ejercicio3 {
    public void ejercicio3() {
        System.out.println("Ingrese un numero : ");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        System.out.println("Ingrese otro numero");
        int numero2 = entrada.nextInt();

        if (numero2 == 0) {
            System.out.println("No dividas entre 0");
        }
        int resultado = numero / numero2;
        System.out.println("El resultado es: " + resultado);
    }
}