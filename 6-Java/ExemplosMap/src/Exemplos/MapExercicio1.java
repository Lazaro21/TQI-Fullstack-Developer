package Exemplos;

import java.util.*;

public class MapExercicio1 {
    public static void main(String[] args) {
        Map<String, Integer> estadosNE = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println("Nova Populaçaro RN: ");
        estadosNE.put("RN", 3534165);
        System.out.println(estadosNE);

        if(!estadosNE.containsKey("PB")) {
            estadosNE.put("PB", 4039277);
        }

        System.out.println("Adicionando PB: ");
        System.out.println(estadosNE);

        System.out.println("População PE: " + estadosNE.get("PE"));

        Map<String, Integer> estadosNEOrdenados = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};

        System.out.println("Estados na ordem de inserção: ");
        System.out.println(estadosNEOrdenados);

        Map<String, Integer> estadosNEOrdemAlfabetica = new TreeMap<>(estadosNEOrdenados);
        System.out.println("Estados na ordem alfabética: ");
        System.out.println(estadosNEOrdemAlfabetica);

        int menorPop = Collections.min(estadosNEOrdemAlfabetica.values());
        Set<Map.Entry<String, Integer>> estadosEntrySet = estadosNEOrdemAlfabetica.entrySet();
        for (Map.Entry<String, Integer> estado: estadosEntrySet) {
            if(estado.getValue() == menorPop) {
                System.out.println(estado.getKey());
            }
        }

        int maiorPop = Collections.max(estadosNEOrdemAlfabetica.values());
        Set<Map.Entry<String, Integer>> estadosEntrySet2 = estadosNEOrdemAlfabetica.entrySet();
        for(Map.Entry<String, Integer> estado: estadosEntrySet2) {
            if(estado.getValue() == maiorPop) {
                System.out.println(estado.getKey());
            }
        }

        Iterator<Integer> iterator = estadosNEOrdemAlfabetica.values().iterator();
        Integer soma = 0;
        for(Map.Entry<String, Integer> estado: estadosNEOrdemAlfabetica.entrySet()) {
            soma += estado.getValue();
        }

        System.out.println("População dos estados: " + soma);
        System.out.println("População média dos estados do nordeste: " + soma / estadosNEOrdemAlfabetica.values().size());

        Iterator<Integer> iterator1 = estadosNEOrdemAlfabetica.values().iterator();
        while (iterator1.hasNext()) {
            if(iterator1.next() < 4000000) {
                iterator1.remove();
            }
        }

        System.out.println("Populações abaixo de 4kk removidas: " + estadosNEOrdemAlfabetica);

        estadosNEOrdemAlfabetica.clear();
        System.out.println(estadosNEOrdemAlfabetica);
    }
}
