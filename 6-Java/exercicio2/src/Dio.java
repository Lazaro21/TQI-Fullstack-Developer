import java.util.Scanner;

// implemente sua solução aqui
public class Dio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double[] values = new Double[4];

        for( int i = 0; i < 4; i++) {
            values[i] = scan.nextDouble();
        }

        Double result = Math.sqrt(Math.pow((values[2] - values[0]), 2) + Math.pow((values[3] - values[1]), 2));
        System.out.println(String.format("%.4f", result));
    }
}