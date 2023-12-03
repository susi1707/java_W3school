package interview;

import java.util.Arrays;

public class isgreater {
    public static void main(String[] args) {
        int[] a = {8, 4, 1, 9, 6, 2};

        for (int i = 0; i < a.length; i++) {
            int big = Integer.MIN_VALUE;  // Initialized to the smallest integer value

            for (int j = 0; j < a.length; j++) {
                if (a[i] >= a[j] && big < a[j]) {
                    big = a[j];
                }
            }

            if (big == Integer.MIN_VALUE) { // If no number is less than or equal to a[i]
                System.out.println(a[i] + " -> None");
            } else {
                System.out.println(a[i] + " -> " + big);
            }
        }}
}
