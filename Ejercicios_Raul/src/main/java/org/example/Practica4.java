package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica4 {
    public void practica4(){
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        int numero2 = 0;
        while (numero <= 0 || numero2 <= 0){
            try {
                if (numero == 0){
                    System.out.println("Introduce el número multiplicado (3 cifras)");
                    numero = entrada.nextInt();
                    while (numero > 999 || numero < 100)
                    {
                        System.out.println("Introduce bien el número multiplicado (3 cifras)");
                        numero = entrada.nextInt();
                    }
                }

                {
                    System.out.println("Introduce el número que multiplica (3 cifras)");
                    numero2 = entrada.nextInt();
                    while (numero2 > 999 || numero2 < 100 )
                    {
                        System.out.println("Inroduce bien el numero que multiplica (3 cifras)");
                        numero2 = entrada.nextInt();
                    }
                }

            }catch (InputMismatchException error){
                System.out.println("Introduce un numero ");
                entrada.nextLine();
            }
        }
        int resultado = (numero * numero2);
        String numC2 = Integer.toString(numero2);
        String num2_C1 = numC2.substring(0,1);
        int num1 = Integer.parseInt(num2_C1);
        num1 = (numero * num1);

            String num2_C2 = numC2.substring(1,2);
            int num2 = Integer.parseInt(num2_C2);
            num2 = (numero * num2);

                String num2_C3 = numC2.substring(2,3);
                int num3 = Integer.parseInt(num2_C3);
                num3 = (numero * num3);

        System.out.println( "El Resultado es: " + resultado);
        System.out.println( "El proceso es: ");
        System.out.println( "  " + numero);
        System.out.println( "x " + numero2);
        System.out.println( "------");
        System.out.println( "  " + num3);
        System.out.println( " " + num2 + "x");
        System.out.println( num1 + "xx");
        System.out.println( "------");
        System.out.println(resultado);

    }
}
// Pongo que numero 1 y numero 2 valgan 0 para hacer un buble para que cada vez que pongamos algo que no sea un numero de 3 cifras, nos pregunte otra vez hasta que nos ponga un numero entre 100 y 999,calculamos el resultado, luego multiplicamos el numero 1 por cada caracter del numero 2, los imprimimos por pantalla de tal forma que lo estuvieras haciendo" a mano" y luego imprimes el resultado que hemos calculado antes