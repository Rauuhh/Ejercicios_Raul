package org.example;

import java.util.Scanner;

public class Actividad_inicial {
    public void ejecutar() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("¿Como te llamas?\n");

        Scanner entrada = new Scanner (System.in);
        String nombre = entrada.nextLine();

        System.out.print("¿A que curso vas?\n");
        String curso = entrada.nextLine();

        System.out.println("Hola " + nombre + ", bienvenido a  " + curso + ".");
        System.out.println("Introduce un numero");
        int numero = entrada.nextInt();
        System.out.println("Introduce otro numero");
        int numero2 = entrada.nextInt();
        int resultado = numero + numero2;
        System.out.println("El resultado es: " + resultado);




        // System.in.read();


    }
}
