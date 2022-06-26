package br.com.dio.exercicios.arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-9, 8, 56, 80, -273, -85};

//        int count = 0;
//        while(count < vetor.length){
//            System.out.println(vetor[count]);
//            count++;
//        }

        for(int i =( vetor.length - 1); i >=0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
