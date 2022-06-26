package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int i = 0;
        float media;



        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            if(numero > maior) maior = numero;
            soma += numero;
            i++;

        } while (i < 5);

        media = soma / i;
        System.out.println("Maior número: " + maior);
        System.out.println("Média: " + media);
    }
}
