package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Q13Specific_Word {
    public static void main(String[] args) {
        List<String > colors = Arrays.asList("Red", "Green", "Blue", "Orange", "Black");

        // Specify the word to search for
        String searchColor = "Orange";

        // Check if the list contains the specified color using a lambda expression
        Predicate< String > containsWord = word -> word.equals(searchColor);
        boolean flag = colors.stream().anyMatch(containsWord);
        System.out.println("Is the word " + searchColor + " present in the list? " + flag);

    }
}
