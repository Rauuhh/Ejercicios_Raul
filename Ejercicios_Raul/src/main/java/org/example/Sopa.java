package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sopa {

    public void sopa() {
        Scanner entrada = new Scanner(System.in);
        int fila = 0;
        int columna = 0;
        while (true) {
            try {
                System.out.println("Introduce el número de filas: ");
                fila = entrada.nextInt();
                System.out.println("Introduce el número de columnas: ");
                columna = entrada.nextInt();

                if (fila > 0 && columna > 0) {
                    break;
                }
                System.out.println("Las filas y columnas deben ser mayores que 0.");
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Solo se permiten números.");
                return;
            }
        }
        String[][] sopa = new String[fila][columna];
        for (int i = 0; i < fila; i++) {
            while (true) {
                System.out.print("Introduce las letras de la fila " + (i + 1) + ": ");
                String linea = entrada.next();

                if (linea.length() == columna && linea.matches("[a-zA-Z]+")) {
                    for (int j = 0; j < columna; j++) {
                        sopa[i][j] = "" + linea.charAt(j); 
                    }
                    break;
                }
                System.out.println("La fila debe tener " + columna + " letras.");
                return;
            }
        }
        System.out.println("\nSopa de letras:");
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Introduce la palabra a buscar: ");
        String palabra = entrada.next();
        boolean encontrada = false;

        for (int i = 0; i < fila && !encontrada; i++) {
            String filaSopa = "";
            for (int j = 0; j < columna; j++) {
                filaSopa += sopa[i][j]; 
            }

            int pos = filaSopa.indexOf(palabra);
            if (pos != -1) {
                System.out.println("Palabra encontrada en la posicion " + (i) + " " + (pos));
                encontrada = true;
            }
        }

        if (!encontrada) {
            for (int j = 0; j < columna && !encontrada; j++) {
                String columnaSopa = "";
                for (int i = 0; i < fila; i++) {
                    columnaSopa += sopa[i][j];  
                }

                int pos = columnaSopa.indexOf(palabra);
                if (pos != -1) {
                    System.out.println("Palabra encontrada en la posicion " + (j) + " " + (pos));
                    encontrada = true;
                }
            }
        }
        if (!encontrada) {
            System.out.println("No se ha encontrado la palabra.");
        }
    }
}

