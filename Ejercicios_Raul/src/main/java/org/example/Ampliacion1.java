package org.example;

import java.util.Scanner;

public class Ampliacion1 {
    public void ampliacion1()
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese tu altura (cm): ");
        int altura = entrada.nextInt();
        if (altura <= 150)
        {
            System.out.println("Eres una persona bajita");
        } else if (altura >= 151 && altura <= 175 )
        {
         System.out.println("Eres una persona del monton");
        }
        else
        {
            System.out.println("Eres una persona alta");
        }
    }
}
