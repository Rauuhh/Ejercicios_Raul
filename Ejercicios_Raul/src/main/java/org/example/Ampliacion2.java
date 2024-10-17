package org.example;

import java.util.Scanner;

public class Ampliacion2 {
    public void ampliacion2() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero entre el 1 y el 7: ");
        int num1 = entrada.nextInt();
        switch (num1) {
            case 1:
                System.out.println("Lunes ");
                break;
            case 2:
                System.out.println("Martes ");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves ");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado ");
                break;
            case 7:
                System.out.println("Domingo ");
                break;
            default:
                System.out.println("El numero no es valido");
        }
    }
}