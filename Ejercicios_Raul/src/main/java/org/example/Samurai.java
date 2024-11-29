package org.example;
import java.util.Random;
import java.util.Scanner;

public class Samurai {

    public void samurai() {
        Scanner entrada = new Scanner(System.in);

        int[] equipo1 = new int[7];
        int[] equipo2 = new int[7];

        // Entrada para el Equipo 1
        while (true) {
            System.out.println("Introduce las potencias de los samuráis para el Equipo 1 (7 números separados por espacio):");
            int suma1 = 0;
            for (int i = 0; i < 7; i++) {
                equipo1[i] = entrada.nextInt();
                suma1 += equipo1[i];
            }
            if (suma1 == 30) {
                break;
            } else {
                System.out.println("ERROR. La potencia total debe ser 30.");
            }
        }

        // Entrada para el Equipo 2
        while (true) {
            System.out.println("Introduce las potencias de los samuráis para el Equipo 2 (7 números separados por espacio):");
            int suma2 = 0;
            for (int i = 0; i < 7; i++) {
                equipo2[i] = entrada.nextInt();
                suma2 += equipo2[i];
            }
            if (suma2 == 30) {
                break;
            } else {
                System.out.println("ERROR. La potencia total debe ser 30.");
            }
        }

        Random aleatorio = new Random();
        int turno = aleatorio.nextInt(7)+1 ;  // Elige un turno aleatorio para comenzar

        int bajasEquipo1 = 0, bajasEquipo2 = 0;

        // Ahora recorremos todas las peleas (siempre 7)
        for (int i = 0; i < 7; i++) {
            int samuraiIndex = (turno + i) % 7;  // Ciclo entre los 7 samuráis

            // Pelea entre samuráis
            if (equipo1[samuraiIndex] > equipo2[samuraiIndex]) {
                bajasEquipo2++;
                System.out.println("Samurai " + (samuraiIndex + 1) + " gana para el Equipo 1: " + equipo1[samuraiIndex] + " vs " + equipo2[samuraiIndex]);
            } else if (equipo2[samuraiIndex] > equipo1[samuraiIndex]) {
                bajasEquipo1++;
                System.out.println("Samurai " + (samuraiIndex + 1) + " gana para el Equipo 2: " + equipo1[samuraiIndex] + " vs " + equipo2[samuraiIndex]);
            } else {
                System.out.println("Empate. Samurai " + (samuraiIndex + 1) + " mueren ambos: " + equipo1[samuraiIndex] + " vs " + equipo2[samuraiIndex]);
            }

            // Verificación de las bajas
            if (bajasEquipo1 > 3) {
                System.out.println("¡Equipo 2 GANA!");
                return;  // Termina el juego si el equipo 1 tiene más de 3 bajas
            } else if (bajasEquipo2 > 3) {
                System.out.println("¡Equipo 1 GANA!");
                return;  // Termina el juego si el equipo 2 tiene más de 3 bajas
            }

        }

        // Si después de las 7 peleas no hay más de 3 bajas en ningún equipo, el juego termina en empate
        if (bajasEquipo1 <= 3 && bajasEquipo2 <= 3) {
            System.out.println("¡Se han jugado las 7 peleas!");
        }
    }
}

