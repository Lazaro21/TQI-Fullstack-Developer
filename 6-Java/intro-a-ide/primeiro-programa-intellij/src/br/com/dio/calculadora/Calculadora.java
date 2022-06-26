package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o Segundo valor: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtracao(a,b);
        int multiplicar = multiplicacao(a, b);
        int dividir = divisao(a, b);

        System.out.println("Somar: " + somar);
        System.out.println("Subtrair: " + subtrair);
        System.out.println("Multiplicar: " + multiplicar);
        System.out.println("Dividir: " + dividir);
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtracao(int a, int b) {
        return a - b;
    }

    public static int multiplicacao(int a, int b) {
        return a * b;
    }

    public static int divisao(int a, int b) {
        return a / b;
    }
}
