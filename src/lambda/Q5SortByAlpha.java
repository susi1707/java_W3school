package lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q5SortByAlpha {
    public static void main(String[] args) {
        List<String> alpha = Arrays.asList("red", "green", "blue", "black", "pink");

        Collections.sort(alpha);
        System.out.println(alpha);
    }
}
