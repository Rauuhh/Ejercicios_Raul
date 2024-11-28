package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ruleta {
    public void ruleta()
    {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        /*Integer numeros[] = new Integer[37];
        for (int i = 0; i<numeros.length;i++)
        {
            numeros[i]= i ;
        }
        String color[] = {"rojo","negro"};
        String tipo[] = {"par","impar"};
        System.out.println("******BIENVENIDO A LA RULE******");
        System.out.println("Introduce un numero para la rule");
        int num = entrada.nextInt();
        boolean numenc = Arrays.asList(numeros).contains(num);
        if (!numenc)
        {
            System.out.println("El numero no es valido");
            return;
        }else
        {
            if (num != 0)
            {
                System.out.println("Introduce un color (rojo/negro)");
                String colores = entrada.next();

                boolean colorenc = Arrays.asList(color).contains(colores);
                if (!colorenc)
                {
                    System.out.println("El color no es valido");
                    return;
                }else
                {
                    System.out.println("Inserta par o impar");
                    String pares = entrada.next();
                    boolean paresenc = Arrays.asList(tipo).contains(pares);
                    if (!paresenc)
                    {
                        System.out.println("El tipo no es valido");
                        return;
                    }
                }

            }
        }

        String sorteo_color = color[random.nextInt(color.length)];
        int sorteo_num = numeros[random.nextInt(numeros.length)];
        String sorteo_par = "";
        if (sorteo_num % 2 == 0)
        {
            sorteo_par = "par";
        }
        else
        {
            sorteo_par = "impar";
        }
        System.out.println("Ha tocado " + sorteo_num + " " + sorteo_num + " " + sorteo_par);
            if (sorteo_num == num && sorteo_color.equals(color) && sorteo_par.equals(tipo))
        {
            System.out.println("Felicidades, has ganado");
        } else if (num != 0 && sorteo_color.equals(color))
        {
            System.out.println("Has acertado el color");
        }else if (num != 0 && sorteo_par.equals(tipo))
        {
            System.out.println("Felicidades has acertado el tipo " + tipo);
        }else if (num != 0 && num==sorteo_num)
        {
                System.out.println("Has acertado el numero");
        }else*/

        int vector[] = {5, 3, 8, 4, 2};
        int aux;
        for (int i = 0; i < vector.length; i++)
        {
            for (int j = 0; j < vector.length - i - 1; j++)
            {
                //El valor máximo lo más a la derecha posible
                if (vector[j] > vector[j + 1])
                {
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }

    }
}
