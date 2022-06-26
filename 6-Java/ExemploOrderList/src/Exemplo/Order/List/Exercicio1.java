package Exemplo.Order.List;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {
        List<Mes> meses = new ArrayList<>(){{
            add(new Mes("Janeiro", 32.3f));
            add(new Mes("Fevereiro", 33.4f));
            add(new Mes("Março", 30.9f));
            add(new Mes("Abril", 28.1f));
            add(new Mes("Maio", 27.8f));
            add(new Mes("Junho", 24.3f));
        }};

        float acumulador = 0;
        float temperaturaMediaSemestral;

        for(int i = 0; i < meses.size(); i++) {
            acumulador += meses.get(i).getTemperaturaMedia();
        }
        temperaturaMediaSemestral = acumulador / meses.size();

        System.out.println("Temperatura Média: " + temperaturaMediaSemestral + "ªC");
        for(int i= 0; i < meses.size(); i++) {
            if(meses.get(i).getTemperaturaMedia() > temperaturaMediaSemestral) {
                System.out.println(meses.get(i));
            }
        }

    }
}

class Mes implements Comparable<Mes> {
    private String nome;
    private float temperaturaMedia;

    public Mes(String nome, float temperaturaMedia) {
        this.nome = nome;
        this.temperaturaMedia = temperaturaMedia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setTemperaturaMedia(float temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    @Override
    public String toString() {
        return "Mes{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public int compareTo(Mes mes) {
        return this.getNome().compareToIgnoreCase(mes.getNome());
    }
}
