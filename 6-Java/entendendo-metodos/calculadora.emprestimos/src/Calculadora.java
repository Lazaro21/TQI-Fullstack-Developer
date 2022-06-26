import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class Calculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        saudacao();
        calc.soma(5, 3);
        calc.subtracao(9, 7);
        emprestimo(8, 2500);

    }

    static void saudacao() {
//        SimpleDateFormat dtf = new SimpleDateFormat("HH:MM");
        LocalDateTime now = LocalDateTime.now();
        String period;
        if( now.getHour() > 0 && now.getHour() < 12) {
            period = "Bom Dia";
        } else if (now.getHour() >= 12 && now.getHour() < 18) {
            period = "Boa Tarde";
        } else {
            period = "Boa Noite";
        }
        System.out.println(period);
    }

    static void soma(float a, float b) {
        System.out.println(a + b);
    }

    static void subtracao(float a, float b) {
        System.out.println(a - b);
    }

    static void multiplicacao(float a, float b) {
        System.out.println(a * b);
    }

    static void divisao(float a, float b) {
        System.out.println(a / b);
    }

    static void emprestimo(int parcelas, float valor) {
        float taxa = 0.08f;
        float sobreTaxaNroParcelas;
        if( parcelas < 6 ) {
            sobreTaxaNroParcelas = 0.01f;
        } else {
            sobreTaxaNroParcelas = 0.03f;
        }

        System.out.println(valor * (1 + taxa + sobreTaxaNroParcelas));

    }

}


