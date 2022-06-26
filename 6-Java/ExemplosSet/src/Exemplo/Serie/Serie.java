package Exemplo.Serie;

import java.util.Comparator;
import java.util.Objects;


public class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private int duracao;

    public Serie(String nome, String genero, int duracao) {
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return duracao == serie.duracao && nome.equals(serie.nome) && genero.equals(serie.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, duracao);
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", duracao=" + duracao +
                '}';
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getDuracao(), serie.getDuracao());
        if(tempoEpisodio != 0) return tempoEpisodio;

        return this.getGenero().compareToIgnoreCase(serie.getGenero());
    }
}


