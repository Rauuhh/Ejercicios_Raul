package org.example;

import java.util.InputMismatchException;
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
        int numero = 0;
        int numero2 = 0;
        while(numero == 0 || numero2 == 0)
        {
            try {
                System.out.println("Introduce un numero");
                numero = entrada.nextInt();
                System.out.println("Introduce otro numero");
                numero2 = entrada.nextInt();
            }catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Introduce un numero valido");
                entrada.nextLine();
            }
            if (numero == 0 || numero2 == 0)
            {
                System.out.println("No sumes con 0");
                numero = 0;
                numero2 = 0;
            }else{
                int resultado = numero + numero2;
                System.out.println("El resultado es: " + resultado);
            }
        }
        // System.in.read();
    }
}
