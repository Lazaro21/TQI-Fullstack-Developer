package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex6_fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int fatorial = 1;
        System.out.println("Digite um número: ");
        numero = scan.nextInt();
//        System.out.println(numero);

        for(int i = numero; i > 0; i--) {
//            System.out.println(i);
//            System.out.println(fatorial);
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}
