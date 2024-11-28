package org.example;

import java.util.Scanner;

public class Sopa {
    public void sopa()
    {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe el numero de filas");
        int filal = entrada.nextInt();
        System.out.println("Escribe el numero de columnas");
        int columnal = entrada.nextInt();
        String matriz[][] = new String [filal][columnal];
        for (int i = 0; i < matriz.length ; i++) {
            System.out.println("Introduce valores de la fila");
            String fila = entrada.next();
            String fila2[] = fila.split("");
            if ( columnal != fila2.length )
            {
                System.out.println("Longitud de linea erronea, vuelvela a poner");
                i--;
                continue;
            }
            if (!fila.matches("[a-zA-Z]+"))
            {
                System.out.println("No cumple el formato correcto, solo se pueden letras");
                i--;
                continue;
            }
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = fila2[j];
            }

        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("\n");
        }

        int posi = 0;
        int posj = 0;
        System.out.println("Introduce la palabra a buscar");
        String buscar = entrada.next();
        String[] buscar2 = buscar.split("");
        for (int i = posi; i < matriz.length ; i++)
        {
            for (int j = 0; j < buscar2.length; j++)
            {
                for (int k = 0; k < buscar2.length; k++)
                {
                    if (!matriz[i][j+k].equals(buscar2[k]))
                    {
                        break;
                    }
                    if (k == buscar2.length) {
                        posi = j;
                        posj = j;
                        break;
                    }
                }

            }
        }
        if (posi != -1 && posj != -1) {
            System.out.println("Encontrada!!! Comienza en la posición" + posi + ", columna " + posj);
            return;
        }

         posi = -1;
         posj = -1;
        for (int j = posj; j < matriz[0].length ; j++)
        {
            for (int i = 0; i < buscar2.length; i++)
            {
                for (int k = 0; k < buscar2.length; k++)
                {
                    if (!matriz[i - k][j].equals(buscar2[i]))
                    {
                        break;
                    }
                    if (k == buscar2.length) {
                        posi = i;
                        posj = j;
                        break;
                    }
                }
                if (posi != -1 && posj != -1)
                {
                    break;
                }
            }
        }
        if (posi != -1 && posj != -1)
        {
            System.out.println("Encontrada!!! Comienza en la posición" + posi + ", columna " + posj);
        } else {
            System.out.println("Palabra no encontrada en la sopa de letras.");
        }



    }
}
