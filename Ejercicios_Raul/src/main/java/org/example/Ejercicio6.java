package org.example;

import java.util.Scanner;

public class Ejercicio6 {
    public void ejercicio6()
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Tenemos Tomate? Si/No");
        String tomate = entrada.nextLine();
        System.out.println("¿Tenemos Aceite? Si/No");
        String aceite = entrada.nextLine();
        System.out.println("¿Tenemos Jamon? Si/No");
        String jamon = entrada.nextLine();
        if (tomate.equals("Si") && aceite.equals("Si") && jamon.equals("Si")) {
            System.out.println("¡No tenemos que ir a comprar!");
        }else {
            System.out.println("¡Tenemos que ir a comprar!");
        }
    }
}