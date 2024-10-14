package org.example;

import java.util.Scanner;

public class Practica1 {
    public void practica1() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa tu fecha de nacimiento (dd/mm/yyyy): ");
        String fecha = entrada.nextLine();


        String dia = fecha.substring(0,2);
        String mes = fecha.substring(3,5);
        String anio = fecha.substring(6,10);
                     int dia2 =  Integer.parseInt(dia);
                     int mes2 =  Integer.parseInt(mes);
                     int ano2 =  Integer.parseInt(anio);
        if (dia2 < 1 || dia2 > 31 || mes2 < 1 || mes2 > 12 || ano2 < 1)
        {
            System.out.println("Error: La fecha de nacimiento no es correcta");
            System.exit(0);
        }
        int result = dia2+mes2+ano2;
        String resultado = String.valueOf(result);
        System.out.println(dia2 + "+" + mes + "+" + ano2 + " = " + result);

        int digito1 = Integer.parseInt(resultado.substring(0,1));
        int digito2 = Integer.parseInt(resultado.substring(1,2));
        int digito3 = Integer.parseInt(resultado.substring(2,3));
        int digito4 = Integer.parseInt(resultado.substring(3,4));
        int result2 = digito1+digito2+digito3+digito4;
        System.out.println(digito1 + "+" + digito2 + "+" + digito3 + "+" + digito4 + " = " + result2);
        System.out.println("Tu numero de la suerte es el: " + result2);



    }
}