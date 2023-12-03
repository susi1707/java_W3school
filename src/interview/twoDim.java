package interview;

import java.util.HashMap;
import java.util.Map;

public class twoDim {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6,4},
                {7, 1, 8}
        };
        //System.out.println(matrix.length);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                int value = matrix[i][j];

                if (map.containsKey(value)) {
                    map.put(value, map.get(value) + 1);
                } else {
                    map.put(value, 1);
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Number: " + entry.getKey() + ", Occurrences: " + entry.getValue());
            }
        }
    }
    }

