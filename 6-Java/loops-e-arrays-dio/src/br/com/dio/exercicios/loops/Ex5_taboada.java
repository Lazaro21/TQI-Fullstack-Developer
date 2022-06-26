package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex5_taboada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        while(true) {
            if(numero < 1 || numero > 10) {
                System.out.println("Digite um número entre 1 e 10: ");
                numero = scan.nextInt();
            } else {
                break;
            }
        }

        for(int i = 0; i <= 10; i++) {
            System.out.println(numero * i);
        }

    }
}
