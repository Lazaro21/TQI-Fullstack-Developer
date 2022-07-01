import java.util.Scanner;

// implemente sua solução aqui
class Dio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double[] values = new Double[i];

        for( int i = 0; i < 4; i++) {
            values[i] = scan.nextDouble();
        }

        Double result = Math.sqrt(Math.pow((values[3] - values[1]), 2) + Math.pow((values[4] - values[2]), 2));
    }
}