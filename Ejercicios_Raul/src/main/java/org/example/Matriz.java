package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matriz {
    Scanner entrada = new Scanner(System.in);
    public void matriz()
    {

        System.out.println("Introduce la altura del triangulo: ");
        int altura = entrada.nextInt();
        int j;
        for (int i = 1; i<= altura; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
    public void multiplicar()
    {
        for (int i = 1; i <= 10; i++) {
            System.out.print("\n");
            System.out.println("Tabla del " + i);
            System.out.print("\n");
            for (int j = 1; j<=10; j++)
            {
                int resul = i * j;
                System.out.println(i + " + " + j + " = " + resul);
            }

        }
    }
    public void primos()
    {
        System.out.println("Introduzca el valor m: ");
        int primo = entrada.nextInt();
        bucle1:
        for (int i = 2; i <= primo; i++)
        {
            for (int j = 2 ; j < i ; j++)
            {
                if (i % j == 0)
                {
                    continue bucle1;
                }
            }
            System.out.print(i + " ");
        }
    }
    public void matrices()
    {
        int[][] matriz = new int[3][4];
        int[][] matriz2 = {{12, 32, 44, 1}, {33, 2, 90, 56}};

        System.out.println(matriz2[0][2]);
        System.out.println(matriz2.length);
        System.out.println(matriz2[0].length);

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {

                System.out.print(matriz2[i][j] + " ");
            }
            System.out.print("\n");

        }

        for (int[] filas : matriz2) {
            System.out.println(Arrays.toString(filas));
        }

        for (int[] filas : matriz2) {
            for (int columnas : filas) {

                System.out.print(columnas + " ");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                if (matriz2[i][j] == 90) {
                    System.out.println("Existe el numero 90");
                }
            }
        }
    }
    public void matriz2()
    {
        int[][] matriz = new int[3][4];
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Dime el valor de la posicion (" + i + "," + j + "):");
                matriz[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
    public void matriz3()
    {
       int matriz[][] = new int [5][5];
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                if (i==j)
                {
                    matriz[i][j] = 1;
                }
                if (matriz[i][j] == 1)
                {
                    System.out.print("X ");
                }else
                {
                    System.out.print("- ");
                }
            }
            System.out.print("\n");
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[i].length - 1;j >= 0; j--)
            {
                if (i==j)
                {
                    matriz[i][j] = 1;
                }
                if (matriz[i][j] == 1)
                {
                    System.out.print("X ");
                }else
                {
                    System.out.print("- ");
                }

            }
            System.out.print("\n");
        }
    }
    public void matriz4()
    {
        int matriz[][] = {{1,5,9},{20,17,2}};
        int matriz2[][] = {{6,7,5},{15,10,0}};
        int matriz3[][] = new int [2][3];

        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > matriz2[i][j])
                {
                    matriz3[i][j] = matriz[i][j];
                }
                else
                {
                    matriz3[i][j] = matriz2[i][j];
                }
                System.out.print(matriz3[i][j]+ " ");
            }
            System.out.print("\n");
        }



    }
    public void matriz5()
    {
        int matriz[][] = {{1,5,9},{20,17,2}};
        int matriz2[][] = {{1,7,5},{15,10,0}};
        int matriz3[][] = new int [2][3];

        if (matriz.length != matriz2.length || matriz[0].length != matriz2[0].length)
        {
            System.out.println("Las matrices no tienen el mismo tamaño");
        }
        else {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] > matriz2[i][j]) {
                        matriz3[i][j] = matriz[i][j];
                    } else if (matriz[i][j] < matriz2[i][j]) {
                        matriz3[i][j] = matriz2[i][j];
                    }
                    else
                    {
                        System.out.println(matriz[i][j] + " y " + matriz2[i][j] + " son iguales.");
                        matriz3[i][j] = matriz[i][j];
                    }
                    System.out.print(matriz3[i][j]+ " ");
                }
                System.out.print("\n");
            }
        }



    }
    public void ejercicio1()
    {
        int matriz[][] = new int [3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Pon un numero");
                matriz[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.print("\n");
        }

        System.out.println("Introduce el numero a buscar: ");
        int numero = entrada.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (numero == matriz[i][j])
                {
                        System.out.println("Salida");
                        System.out.println("El numero " + numero + " se encuentra en la posicion (" + i +","+ j + ")" );
                        return;
                }
            }

        }
        System.out.println("El numero no se encuentra en la matriz");

    }
    public void ejercicio2()
    {
        Random aleatorio = new Random();

        int filas = aleatorio.nextInt(5)+ 1;
        int columnas = aleatorio.nextInt(5)+ 1;

        int matriz[][] = new int [filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(10)+ 1;
            }
        }
        System.out.println("Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        int fila = 0;
        System.out.println("Suma de filas:");
        System.out.print("\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                 fila = matriz[i][j] + fila;
            }
            System.out.println("Fila " + (i+1) + ": " + fila);
            fila = 0;

        }
        int columna = 0;
        System.out.print("\n");
        System.out.println("Suma de columnas:");
        System.out.print("\n");
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                columna = matriz[j][i] + columna;
            }
            System.out.println("Columna " + (i+1) + ": " + columna);
            columna = 0;

        }

    }
    public void ejercicio3()
    {
        System.out.println("Hola! Cuantos estudiantes hay?");
        int est = entrada.nextInt();
        System.out.println("Cuantas asiganturas tienen");
        int asi = entrada.nextInt();

        String notas [][] = new String[est+1][asi+1];
        notas[0][0] = "Estudiantes";
        for (int i = 1; i < notas.length ; i++)
        {
            System.out.println("Introduce el nombre del estudiante " + i);
             notas[i][0] = entrada.next();
        }

        for (int i = 1; i < notas[0].length  ; i++)
        {
            System.out.println("Introduce la asignatura " + i);
            notas[0][i] = entrada.next();
        }

        for (int i = 1; i < notas.length; i++) {
            for (int j = 1; j < notas[0].length; j++) {
                System.out.println("Introduce la nota de " + notas[i][0] + " para la asignatura de " + notas[0][j]);
                notas[i][j] = entrada.next();

            }

        }

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i = 1; i < notas.length; i++) {
            double estu = 0;
            for (int j = 1; j < notas[i].length; j++) {
                estu += Double.parseDouble(notas[i][j]);
            }
            double promedioestu = estu / (notas.length - 1);
            System.out.println("La nota media del alumno " + notas[i][0] + " es " + promedioestu);
        }
        System.out.print("\n");

        for (int i = 1; i < notas[0].length; i++) {
            double asig = 0;
            for (int j = 1; j < notas.length; j++) {
                asig += Double.parseDouble(notas[j][i]);
            }
            double promedioasig = asig / (notas.length - 1);
            System.out.println("La nota media de la asignatura " + notas[0][i] + " es " + promedioasig);
        }
        System.out.print("\n");
    }
    public void tratamiento()
    {
        int vector[] = {3,4,5,3,2};
        int matriz[][] = new int [2][vector.length];

        for (int i = 0; i < vector.length; i++)
        {
            matriz[0][i] = vector[i];
        }
        for (int [] filas : matriz)
        {
            for (int columnas : filas)
            {
                System.out.print(columnas + " ");
            }
            System.out.print("\n");
        }

        int matriz2[][] = new int[3][4];
        for (int i = 0; i < matriz2.length; i++) {
            System.out.println("Introduce valores de la fila");
            String fila[] = entrada.next().split(",");
            for (int j = 0; j < matriz2[0].length; j++) {
                matriz2[i][j] = Integer.parseInt(fila[j]);
            }

        }
        for (int [] filas : matriz2)
        {
            for (int columnas : filas)
            {
                System.out.print(columnas + " ");
            }
            System.out.print("\n");
        }

        String matriz3[][] = new String[10][10];
        for (int i = 0; i < matriz3.length; i++) {
            System.out.println("Introduce valores de la fila");
            String fila[] = entrada.next().split("");
            for (int j = 0; j < matriz3[0].length; j++) {
                matriz3[i][j] = fila[j];
            }

        }
        for (String [] filas : matriz3)
        {
            for (String columnas : filas)
            {
                System.out.print(columnas + " ");
            }
            System.out.print("\n");
        }

    }
}
