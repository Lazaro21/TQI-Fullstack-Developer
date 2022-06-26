package Exemplos.Set;

import Exemplo.Linguagens.LinguagemFavorita;

import java.util.Comparator;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExercicio2 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> lingagensFavoritas = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Python", "Pycharm", 1980));
            add(new LinguagemFavorita("Javascript", "VisualCode", 1996));
            add(new LinguagemFavorita("Java", "Intellij", 1980));
        }};

        System.out.println(lingagensFavoritas.toString());

        System.out.println("Por Nome: ");
        Set<LinguagemFavorita> linguagemFavoritaSet = new TreeSet<>(new ComparatorNome());
        linguagemFavoritaSet.addAll(lingagensFavoritas);
        System.out.println(linguagemFavoritaSet);


        System.out.println("Por IDE: ");
        Set<LinguagemFavorita> linguagemFavoritasTreeSet2 = new TreeSet<>();
        linguagemFavoritasTreeSet2.addAll(lingagensFavoritas);
        System.out.println(linguagemFavoritasTreeSet2.toString());

        System.out.println("Por Ano/Nome: ");
        Set<LinguagemFavorita> linguagemFavoritasTreeSet3 = new TreeSet<>(new ComparatorNomeAno());
        linguagemFavoritasTreeSet3.addAll(lingagensFavoritas);
        System.out.println(linguagemFavoritasTreeSet3.toString());

        System.out.println("Por Nome/Data/IDE: ");
        Set<LinguagemFavorita> linguagemFavoritasTreeSet4 = new TreeSet<>(new ComparatorNomeAnoIde());
        linguagemFavoritasTreeSet4.addAll(lingagensFavoritas);
        System.out.println(linguagemFavoritasTreeSet4.toString());
    }
}

class ComparatorNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getNome().compareToIgnoreCase(l2.getNome());
    }
}

class ComparatorNomeAno implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ano = Integer.compare(l1.getAnoDeCriaca(), l2.getAnoDeCriaca());
        if(ano != 0) return ano;

        return l1.getNome().compareToIgnoreCase(l2.getNome());
    }
}

class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        if(nome != 0) return nome;

        int ano = Integer.compare(l1.getAnoDeCriaca(), l2.getAnoDeCriaca());
        if(ano != 0) return ano;

        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}