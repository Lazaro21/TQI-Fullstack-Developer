package Exemplo.Order.List;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> respostas = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int resposta;
        int qtdeSim = 0;

        System.out.println("Telefonou para a vítima? 1 = Sim | 0 = Não");
        resposta = scan.nextInt();
        respostas.add(resposta);

        System.out.println("Esteve no local do crime? 1 = Sim | 0 = Não\"");
        resposta = scan.nextInt();
        respostas.add(resposta);

        System.out.println("Mora perto da vítima? 1 = Sim | 0 = Não\"");
        resposta = scan.nextInt();
        respostas.add(resposta);

        System.out.println("Devia para a vítima? 1 = Sim | 0 = Não\"");
        resposta = scan.nextInt();
        respostas.add(resposta);

        System.out.println("Já trabalhou com a vítima? 1 = Sim | 0 = Não\"");
        resposta = scan.nextInt();
        respostas.add(resposta);

        for (int valor: respostas) {
            qtdeSim += valor;
        }

        switch (qtdeSim) {
            case 0, 1:
                System.out.println("Inocente");
                break;
            case 2:
                System.out.println("Suspeita");
                break;
            case 3, 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassina");
                break;

        }



    }
}
