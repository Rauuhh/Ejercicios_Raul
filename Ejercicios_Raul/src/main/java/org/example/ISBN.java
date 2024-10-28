package org.example;

import java.util.Scanner;

public class ISBN {
    public void isbn() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un ISBN (10 dígitos, usa '?' para el dígito faltante si es necesario): ");
        String ISBN = entrada.next();
        int resultado = 0;
        int posicionFaltante = -1;

        // Validar longitud del ISBN
        if (ISBN.length() != 10) {
            System.out.println("El ISBN no es válido: debe tener 10 dígitos.");
            return;
        }

        // Calcular el resultado parcial y localizar el dígito faltante
        for (int i = 0; i < 10; i++) {
            char caracter = ISBN.charAt(i);
            int digito;

            if (caracter == '?') {
                posicionFaltante = i;
                continue;
            }

            if (i == 9 && caracter == 'X') { // Caso especial para 'X' en la última posición
                digito = 10;
            } else {
                try {
                    digito = Character.getNumericValue(caracter);
                } catch (NumberFormatException e) {
                    System.out.println("El ISBN no es válido: contiene caracteres no numéricos.");
                    return;
                }
            }

            // Sumar al resultado parcial
            resultado += digito * (10 - i);
        }

        // Comprobar si falta un dígito
        if (posicionFaltante != -1) {
            // Calcular el dígito faltante que hace que el ISBN sea válido
            for (int j = 0; j <= 10; j++) {
                int total = resultado + j * (10 - posicionFaltante);
                if (total % 11 == 0) {
                    if (j == 10) {
                        System.out.println("El dígito que falta es: X");
                    } else {
                        System.out.println("El dígito que falta es: " + j);
                    }
                    return;
                }
            }
            System.out.println("No se encontró un valor que haga válido el ISBN.");
        } else {
            // Verificar si el ISBN es válido
            if (resultado % 11 == 0) {
                System.out.println("El ISBN es válido.");
            } else {
                System.out.println("El ISBN no es válido.");
            }
        }
    }
}
