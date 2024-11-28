package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Primitiva {
    public void primitiva()
    {
        int numeros[] = new int [49];
        for (int i = 1; i < numeros.length; i++)
        {
            numeros[i] = i;
        }
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int sorteonum[] = new int[6];
        int jugador[] = new int[7];



        System.out.println("Introduce los datos de tu boleto");
        String entradaj = entrada.nextLine();
        boolean formato = entradaj.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1,2}");

        if (!formato)
        {
            System.out.println("Formato no valido");
            return;
        }

        String numeros2[] = entradaj.split("[-/]");

        for (int i = 0; i < sorteonum.length; i++)
        {
            int ran = aleatorio.nextInt(numeros.length);
            while (Arrays.asList(sorteonum).contains(ran))
            {
                 ran = aleatorio.nextInt(numeros.length);
                System.out.println(ran);
            }
                sorteonum[i] = ran ;

            System.out.println(Arrays.toString(sorteonum));
        }
        Arrays.sort(sorteonum);
        Arrays.sort(numeros2);

        System.out.println(Arrays.toString(numeros2));


    }
}
