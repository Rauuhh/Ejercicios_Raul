package org.example;

import java.util.Arrays;
import java.util.Random;

public class Duplicado
{
    public void duplicado()
    {
        /*int vector [] = {7,8,1,4,6};

        int numero = 4;

        int posicion = Arrays.binarySearch(vector,numero);
        System.out.println(posicion);

        Arrays.sort(vector);
        System.out.println(Arrays.toString(vector));

        posicion = Arrays.binarySearch(vector,numero);
        System.out.println(posicion);*/

        int vector [] = {4,8,9,1,2,2,1,3};
        int aux [] = new int[vector.length];
        Arrays.sort(vector);
        int tam = 0;
        for (int i = 0 ; i < vector.length; i++)
        {
            if ( i!= 0 && vector[i] == vector[i-1])
            {
                continue;
            }else{
                aux[i] = vector[i];
                tam++;
            }
        }
        int limpio [] = new int[tam];
        int pos = 0;
        for (int i = 0; i < aux.length ;i++)
        {
            if (aux[i] != 0) {
                limpio[pos] = aux[i];
                pos++;
            }
        }
        System.out.println(Arrays.toString(limpio));

    }
    public void duplicado2()
    {
        int vector [] = {4,8,9,1,2,2,1,3};
        Arrays.sort(vector);
        int tam = 0;
        for (int i = 0 ; i < vector.length; i++)
        {
            if ( i!= vector.length - 1 && vector[i] == vector[i+1])
            {
                vector[i] = 0;
            }else{
                tam++;
            }
        }

        int limpio[] = new int[tam];
        int pos = 0;
        for (int i = 0; i < vector.length ;i++)
        {
            if ( limpio[i] != 0) {
                limpio[pos] = vector[i];
                pos++;
            }
        }

        System.out.println(Arrays.toString(vector));
    }
    public void sorteo()
    {
        int sorteo[] = new int [6];
        Random aleatorio = new Random();

        for(int i = 0; i< sorteo.length; i++)
        {
            sorteo[i] = aleatorio.nextInt(49) +1;
        }


        Arrays.sort(sorteo);
        System.out.println(Arrays.toString(sorteo));
        boolean ordenado = true;
        while(ordenado)
        {
            ordenado = false;
            for (int i = 0; i < sorteo.length; i++) {
                if (i != sorteo.length - 1 && sorteo[i] == sorteo[i + 1]) {

                    System.out.println("Duplicado: " + sorteo[i]);
                    sorteo[i] = aleatorio.nextInt(49) + 1;
                    ordenado = true;
                }
            }
        }
        Arrays.sort(sorteo);
        System.out.println(Arrays.toString(sorteo));

    }

    public void distint()
    {
        int original[] = {1,1,2,2,3,4,9,9};
        int limpio[] = Arrays.stream(original).distinct().toArray();
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(limpio));
    }


}
