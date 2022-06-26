package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdeNumeros;
        int numero;
        int cont = 0;
        String impares = "";
        String pares = "";

        System.out.println("Quantidade de números: ");
        qtdeNumeros = scan.nextInt();

        System.out.println("Digite um número: ");
        numero = scan.nextInt();
        String numeroString = String.valueOf(numero);
        if(numero % 2 == 0) {
            pares += numeroString;
        } else {
            impares += numeroString;
        }
        ++cont;

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            numeroString = String.valueOf(numero);
//            System.out.println(numeroString);
            if(numero % 2 == 0) {
                if(pares.isEmpty()) {
                    pares += numeroString;
                } else {
                   pares += ", " + numeroString;
                }

            } else {
                if(impares.isEmpty()) {
                    impares += numeroString;
                } else {
                    impares += ", " + numeroString;
                }
            }
            ++cont;
        } while(cont < qtdeNumeros);

        System.out.printf("Pares: " + pares);
        System.out.println();
        System.out.printf("Ímpares: " + impares);

    }
}
