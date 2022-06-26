package Exemplos.Set;

import java.util.*;

public class SetExercicio1 {
    public static void main(String[] args) {
        Set<String> cores = new LinkedHashSet<>(){{
           add("Vermelho");
           add("Laranja");
           add("Amarelo");
           add("Verde");
           add("Azul");
           add("Anil");
           add("Violeta");
        }};

        for (String cor:cores) {
            System.out.println(cor);
        }
        System.out.println(cores.size());
        Set<String> coresOrdenadas = new TreeSet<>();
        coresOrdenadas.addAll(cores);

        for (String cor:coresOrdenadas) {
            System.out.println(cor);
        }

        List<String> coresLista = new ArrayList<>();
        coresLista.addAll(cores);
        Collections.reverse(coresLista);
        System.out.println(coresLista);

        for (String cor: cores) {
            if(cor.startsWith("V")) {
                System.out.println(cor);
            }
        }

        Iterator<String> iterator = coresOrdenadas.iterator();
        while(iterator.hasNext()) {
            String color = iterator.next();
            if(!color.startsWith("V")) {
                iterator.remove();
            }
        }
        System.out.println(coresOrdenadas);

        coresOrdenadas.clear();
        System.out.println(coresOrdenadas);
    }
}
