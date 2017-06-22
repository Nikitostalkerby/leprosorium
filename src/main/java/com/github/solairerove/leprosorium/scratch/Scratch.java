package com.github.solairerove.leprosorium.scratch;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Scratch {
    public static void main(String... args) throws IOException {
        final String[] array = new String[]{
                "lol word word1 word word",
                "lol word2 word2 word word",
                "lol word2 word2 word word",
        };

        final Map<String, Integer> map = new HashMap<>();

        for (String s : array) {
            final String[] sentence = s.split(" ");
            for (String s1 : sentence) {
                if(map.containsKey(s1)) {
                    Integer value = map.get(s1);
                    value += 1;
                    map.put(s1, value);
                } else {
                    map.put(s1, 1);
                }
            }
        }

        for (Map.Entry<String, Integer> iterator : map.entrySet()) {
            System.out.println("word: " + iterator.getKey() + "<->" + "count " + iterator.getValue());
        }

        final Integer[] values = new Integer[]{
                1, 2, 3, 4, 5
        };

        System.out.println(sum(values));
    }

    private static Integer sum(final Integer[] values) {
        Integer sum = 0;
        for (Integer value : values) {
            sum += value;
        }

        return sum;
    }
}
