package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public void calculadora() {
        int a = 1, b, i, j;
        b = 0;

        for (i = -1; i <= a; i += 2) {
            b = b + i;
        }

        for (j = a; j <= i; j++) {
            b = b + j;
        }

        System.out.println(b);
    }
}


        /*
        Scanner entrada = new Scanner(System.in);
        float num1 = 0;
        float num2 = 0;
        float resul = 0;
        if (num1 == 0 || num2 == 0)
        {
            try
            {
                System.out.println("Introduzca el primer numero: ");
                num1 = entrada.nextInt();
            }
            catch (NumberFormatException | InputMismatchException error)
            {
                System.out.println("Formato incorrecto");
                System.exit(192);
            }
        }
            System.out.println("Introduce el operando (+,-,X,/,R)");
            String modo = entrada.next();
            switch (modo)
            {
                case "+":
                    try
                    {
                    System.out.println("Introduzca el segundo numero: ");
                    num2 = entrada.nextInt();
                        resul = num1 + num2;
                        System.out.println("El resultado es: " + resul);
                    }
                    catch
                    (NumberFormatException | InputMismatchException error)
                    {
                        System.out.println("Formato incorrecto");
                    }
                    break;
                case "-":
                    try
                    {
                        System.out.println("Introduzca el segundo numero: ");
                        num2 = entrada.nextInt();
                        resul = num1 - num2;
                        System.out.println("El resultado es: " + resul);
                    }
                    catch
                    (NumberFormatException | InputMismatchException error)
                    {
                        System.out.println("Formato incorrecto");
                    }
                    break;
                case "X":
                    try
                    {
                        System.out.println("Introduzca el segundo numero: ");
                        num2 = entrada.nextInt();
                        resul = num1 * num2;
                        System.out.println("El resultado es: " + resul);
                    }
                    catch
                    (NumberFormatException | InputMismatchException error)
                    {
                        System.out.println("Formato incorrecto");
                    }
                    break;
                case "/":
                    try
                    {
                        System.out.println("Introduzca el segundo numero: ");
                        num2 = entrada.nextInt();
                        if (num2 == 0 )
                        {
                            System.out.println("No puedes dividir entre 0");
                            break;
                        }
                        resul = num1 / num2;
                        System.out.println("El resultado es: " + resul);
                        break;
                    }
                    catch
                    (NumberFormatException | InputMismatchException error)
                    {
                        System.out.println("Formato incorrecto");
                    }
                    break;
                case "R":
                    if (num1 < 0)
                    {
                        System.out.println("No puedes tener raiz de un numero menor que 0");
                        break;
                    }
                    resul = (float) Math.sqrt(num1);
                    System.out.println("El resultado es: " + resul);
                    break;
                default:
                    System.out.println("Formato incorrecto");
                    break;
            }
    }
}*/