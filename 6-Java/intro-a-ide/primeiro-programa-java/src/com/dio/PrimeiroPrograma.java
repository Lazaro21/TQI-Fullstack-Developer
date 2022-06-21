package com.dio;

import com.dio.model.Gato;

/**
 * @author olsf2
 *
 */
public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato("Jimi", "Branco", 1);
		Livros livros = new Livros();
		
		System.out.println(gato);
		
//		int a = 2;
//		int b = 3;
//		System.out.println("Hello World! 2 " + (a+b) );

	}

}

class Livros {
	private String nome;
	private String npag;
}