package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Navidad {
    public void navidad()
        {
            Scanner entrada = new Scanner(System.in);
            final String palabra = "NAVIDAD";
            String palabras[] = palabra.split("");
            System.out.println(Arrays.toString(palabras));
            System.out.println("Introduce la cantidad de letras que quieres...");
            String cantidad = entrada.nextLine();
            String cantidades[] = cantidad.split(" ");
            System.out.println(Arrays.toString(cantidades));
            String resul = "";
            if (cantidades.length == palabras.length) {
                for (int i = 0; i < cantidades.length; i++) {
                    for (int j = 0; j < Integer.parseInt(cantidades[i]); j++) {
                        resul = resul + palabras[i];
                    }
                }
                System.out.println(resul);
            }else
            {
                System.out.printf("No hay 1 numero por letra");
            }
        }
}
