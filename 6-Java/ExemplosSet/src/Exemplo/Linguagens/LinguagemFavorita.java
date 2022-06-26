package Exemplo.Linguagens;

import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    private String nome;
    private String ide;
    private int anoDeCriaca;

    public LinguagemFavorita(String nome, String ide, int anoDeCriaca) {
        this.nome = nome;
        this.ide = ide;
        this.anoDeCriaca = anoDeCriaca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public int getAnoDeCriaca() {
        return anoDeCriaca;
    }

    public void setAnoDeCriaca(int anoDeCriaca) {
        this.anoDeCriaca = anoDeCriaca;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", ide='" + ide + '\'' +
                ", anoDeCriaca=" + anoDeCriaca +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return anoDeCriaca == that.anoDeCriaca && nome.equals(that.nome) && ide.equals(that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ide, anoDeCriaca);
    }


    @Override
    public int compareTo(LinguagemFavorita l) {
        return getIde().compareToIgnoreCase(l.getIde());
    }
}
