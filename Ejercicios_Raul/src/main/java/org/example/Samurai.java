package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Samurai {
    public void samurai()
        {
            Scanner entrada = new Scanner(System.in);
            int[] equipo1 = new int[7];
            int[] equipo2 = new int[7];
            int array[] = new int[7];
            int numero = 1;
            int suma2 = 0;
            do
            {
                int suma = 0;
                System.out.println("Equipo " + numero);
                System.out.print("Introduce la potencia de los samurais");
                String cadena = entrada.nextLine();
                String [] cadena2 = cadena.split(" ");
                for (int i = 0; i< equipo1.length; i++)
                {

                    equipo1[i] = Integer.parseInt(cadena2[i]);
                    suma += equipo1[i];
                }
                switch (numero) {
                    case 1:
                        equipo1 =array.clone();
                        if(suma == 30)
                        {
                            numero = 2;
                        }
                        break;
                    case 2:
                        equipo2 =array.clone();
                        if(suma == 30)
                            numero = 3;
                        break;
                    default:
                }
            }while( numero <= 2);
            Arrays.toString(equipo1);
            Arrays.toString(equipo2);



        }
}
