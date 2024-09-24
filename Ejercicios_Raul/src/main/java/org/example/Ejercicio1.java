package org.example;

import java.util.Scanner;

public class Ejercicio1 {
    public void ejercicio1() {
        System.out.println("Introduce un numero");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        if (numero > 0)
            System.out.println("El numero mayor que 0");
        if (numero < 0)
            System.out.println("El numero menor que 0");
        if (numero == 0)
            System.out.println("El numero es 0");

    }
}
