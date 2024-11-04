package org.example;

import java.nio.charset.MalformedInputException;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.Date;
// HOLA 
public class Examen {
    public void ejercicio1 ()
    {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random(); // Llamams a random
        int numero;
        int contadorhumano = 0; // veces que ganas a la maquina
        int contadormaquina = 0; // veces que te gana la maquina
        int opcionjugador2 = 0; // la letra transformada a numero

        for (int i = 1; i <= 3; i++) { // Como son solo 3 rondas, hago un bucle definido "3 veces"
            System.out.println("Ronda " + i);
            System.out.println("¿Piedra papel o tijera?(p/a/t)");

            String opcionjugador = entrada.nextLine(); // Eliges tu opcion opcion


            if (opcionjugador.equals("p")) { // cambias las letras a 1 numero para hacer las comparacion sin cambiar de string a int y esas cosas
                opcionjugador2 = 1;
            } else if (opcionjugador.equals("a")) {
                opcionjugador2 = 2;
            } else if (opcionjugador.equals("t")) {
                opcionjugador2 = 3;
            } else { // pero si no pones las letras a la hora de leegir t dara error
                System.out.println("Parametro no valido");
                System.exit(0);
            }
            numero = aleatorio.nextInt(3) + 1; // ponemos el +1 por que el 0 cuanta como posicion, entonces seria del 0 al 2 aunque ponga 3

            if (opcionjugador2 == 1 && numero == 2) {
                System.out.println("El ordenador ha elegido: Papel");
                System.out.println("Has perdido");
                System.out.println("-----------------");
                contadormaquina++;
                System.out.println("contador actual (PC-Usuario) " + contadorhumano + " - " + contadormaquina);
            } else if (opcionjugador2 == 2 && numero == 3) {
                System.out.println("El ordenador ha elegido: Tijera");
                System.out.println("Has perdido");
                System.out.println("-----------------");
                contadormaquina++;
                System.out.println("contador actual (PC-Usuario) " + contadorhumano + " - " + contadormaquina);
            } else if (opcionjugador2 == 3 && numero == 1) {
                System.out.println("El ordenador ha elegido: Piedra");
                System.out.println("Has perdido");
                System.out.println("-----------------");
                contadormaquina++;
                System.out.println("contador actual (PC-Usuario) " + contadorhumano + " - " + contadormaquina);
            } else if (opcionjugador2 == 2 && numero == 1) {
                System.out.println("El ordenador ha elegido: Piedra");
                System.out.println("Has Ganado");
                System.out.println("-----------------");
                contadorhumano++;
                System.out.println("contador actual (PC-Usuario) " + contadorhumano + " - " + contadormaquina);
            } else if (opcionjugador2 == 3 && numero == 2) {
                System.out.println("El ordenador ha elegido: Papel");
                System.out.println("Has Ganado");
                System.out.println("-----------------");
                contadorhumano++;
                System.out.println("contador actual (PC-Usuario) " + contadorhumano + " - " + contadormaquina);
            } else if (opcionjugador2 == 1 && numero == 3) {
                System.out.println("El ordenador ha elegido: Tijera");
                System.out.println("Has Ganado");
                System.out.println("-----------------");
                contadorhumano++;

                // las opciones estan para que todos los resultados posibles que se puedan dar esten bien
                System.out.println("contador actual (PC-Usuario) " + contadorhumano + " - " + contadormaquina);
            } else if (opcionjugador2 == numero) { // excepto si hay empate, pone que la ronda se repita, entonces no nos guardamos nada y retamos i para que cuando se sume por el for, sigas en la misma ronda
                System.out.println("Habeis sacado lo mismo");
                i = i - 1;

            }


        }
        if (contadormaquina > contadorhumano) { // y aqui te dice quien de los 2 ha ganado, no puede haber empate ya que gracias a no guardarnos nada y restar la ronda, en algun momento sacareis algo diferente
            System.out.println("GANA LA MAQUINA");
        } else {
            System.out.println("GANA EL USUARIO");
        }

    }

    public void ejercicio2()
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su año de nacimiento");
        try {
            int nacimiento = entrada.nextInt();
            LocalDateTime fecha = LocalDateTime.now(); //Importo la fecha actual
            int ano = fecha.getYear(); // solo selecciono el año
            int contador = 0; // Contador para simular nuestra edad
            if (nacimiento < 1900 || nacimiento > ano) //no puedes nacer antes del 1900 o nacer el año que viene hoy
            {
                System.out.println("tiene que ser un año entre 1900 y el actual");
                System.exit(0);
            }
            for (int i = nacimiento; i <= ano; i++) { // mientras el año de nacimiento sea menor o igual que el año actual
                System.out.println(i + "- edad " + contador); // muestro el año y la edad
                contador++; // +1 a la edad
            }
        }catch (InputMismatchException e) //Confirmamos que lo que hemos introducido es un entero
        {
            System.out.println("Formato incorrecto");
        }
    }
}
// Al segundo ejercicio le decimos qe nos diga su año de nacimiento, si ponemos el formato correcto y el año esta entre el 1900 y el año actual, nos dira cuantoa años teniamos en las años anteriores, para hacerlo comparamos nuestro año de nacimiento con el actual y creo una variable contador para simular los años que tenia en ese año en concreto, cada año que se suma, tambien se suma el contador de simulacion de nuestros años

