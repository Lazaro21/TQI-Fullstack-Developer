package Exemplos;

import java.util.*;

public class MapExercicio2 {
    public static void main(String[] args) {
        Random random = new Random();
        Map<Integer, Integer> diceRoll = new LinkedHashMap<>();

        for(int i = 0; i < 100; i++) {
            int key = random.nextInt(10);
            int countValue;
            if(diceRoll.get(key) == null) {
                diceRoll.put(key, 0);
            }
            countValue = diceRoll.get(key) + 1;
            diceRoll.put(key, countValue);
        }

        System.out.println(diceRoll);
    }
}
