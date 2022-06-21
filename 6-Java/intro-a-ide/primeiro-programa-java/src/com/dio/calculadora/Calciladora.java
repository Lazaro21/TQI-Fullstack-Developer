package com.dio.calculadora;

import java.util.Scanner;

public class Calciladora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Double a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextDouble();
		System.out.println("Digite o Segundo valor: ");
		b = scan.nextDouble();
		
		Double soma = soma(a, b);
		Double subtracao = subtracao(a, b);
		Double divisao = divisao(a, b);
		Double multiplicacao = multiplicacao(a, b);
		
		System.out.println(soma);
		System.out.println(divisao);
		System.out.println(subtracao);
		System.out.println(multiplicacao);

	}

	public static Double soma(Double a, Double b) {
		return a + b;
	}

	public static Double subtracao(Double a, Double b) {
		return a - b;
	}

	public static Double divisao(Double a, Double b) {
		return a / b;
	}

	public static Double multiplicacao(Double a, Double b) {
		return a * b;
	}

}
