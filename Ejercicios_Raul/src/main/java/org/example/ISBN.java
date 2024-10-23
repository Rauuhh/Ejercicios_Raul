package org.example;

import java.util.Scanner;

public class ISBN {
    public void isbn(){
                Scanner entrada = new Scanner(System.in);
                System.out.println("Introduce un ISBN: ");
                String ISBN = entrada.next();
                int resultado = 0;
                int Multiplo = 10;
                int digito = 0;
                if (ISBN.length() !=10 )
                {
                    System.out.println("El ISBN no es valido");
                }else
                {
                    for (int i = 0; i < 10; i++)
                    {
                        if (String.valueOf(ISBN.charAt(i)).equals("?"))
                        {
                            int posicion = i;
                            int multiplo2 = Multiplo;
                            continue;
                        }
                        if (ISBN.length() - 1 == i && String.valueOf(ISBN.charAt(i)).equals("X"))
                           {
                                digito = 10;
                           }
                            else
                               {
                                   try
                                   {
                                       digito = Integer.parseInt(ISBN.substring(i, i + 1));
                                   }
                                   catch (NumberFormatException e)
                                   {
                                       System.out.println("El ISBN no es valido");
                                   }
                               }


                        resultado += digito * Multiplo;
                        Multiplo = Multiplo - 1;
                    }

                    for (int j = 0 ; j <= 9 ; j++)
                    {
                        int resultado2 = j * Multiplo;
                        int resultotal = resultado2 + resultado;
                        if (resultotal % 11 == 0)
                            {
                                System.out.println(j);
                                System.out.println(Multiplo);
                                System.out.println(resultotal);
                                System.out.println(resultado2);
                                    System.out.println("El numero seria" + j);
                            }

                    }


                    if ( resultado % 11 == 0)
                    {
                        System.out.println("El ISBN es: correcto");
                    }
                    else
                    {
                        System.out.println("El ISBN es: incorrecto");
                    }
                }

            }
        }