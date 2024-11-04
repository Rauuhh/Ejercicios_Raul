package org.example;
import java.util.Scanner;
public class ISBN {
    public void isbn() {
        Scanner escaner = new Scanner(System.in);
        int operacion = 0;
        int interrogacion = 0;
        int ninterrogacion;
        int nfinal = 0;
        int nfinal2 = 0;

        System.out.println("Introduzca un ISBN");
        String isbn = escaner.next();

        if (isbn.length() == 10) //Si la longitud de la variable es igual a 10 caracteres
        {

            for (int i = 1; i <= 10; i++) {
                if (isbn.charAt(i - 1) == '?') { //Si el valor en la posición e i es ?
                    interrogacion = i; // nos guardamos la posicion
                } else {
                    if (i == 10 && isbn.charAt(i - 1) == 'X') // si la posicion es la 10 y es una X
                    {
                        nfinal = (10 * i); //multiplicas la i por un 10

                    } else {
                        try { //Intenta convertir la posicion en número entero, y multiplica el valor por i
                            int entero = Integer.parseInt(isbn.substring(i - 1, i));
                            nfinal = (entero * i);
                        } catch (NumberFormatException error) {
                            System.exit(0);
                        }

                    }
                    operacion = (operacion + nfinal); //esto nos va a ir sumando las multiplicaciones
                }
            }
            if (interrogacion != 0) { //Si hay interrogaciones...

                for (int f = 0; f <= 9; f++) {
                    ninterrogacion = (interrogacion * f); //hacemos un blucle para ir probando numero por numero el que multiplicado por la posicion y sumado a los demas sea divisible entre 11, si lo es la metemos a la variable y nos salimos del for
                    if ((operacion + ninterrogacion) % 11 == 0) {
                        break;
                    }
                }
                System.out.println("El numero que falta es " + nfinal2);

            } else {

                if ((operacion % 11) == 0) {
                    System.out.println("El ISBN es valido");
                } else {
                    System.out.println("El ISBN no es valido");
                }
            }
        }
    }
}
