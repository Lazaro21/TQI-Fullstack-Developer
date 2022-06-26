package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex2_Notas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        do {
            System.out.println("Digite a nota: ");
            nota = scan.nextInt();
        } while (nota < 0 || nota > 10);

        System.out.println("Sua nota: " + nota);
    }
}
