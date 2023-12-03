package lambda;
interface cases{
    String Casess(String a);
        }
public class Q3Cases {
    public static void main(String[] args) {
        cases res = UpperOrLower -> UpperOrLower.toUpperCase();


        String a = "java";
        System.out.println(res.Casess(a));
    }
}
// Main.java
/*
import java.util.Arrays.Arrays;
        import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of strings
        List stringList = Arrays.Arrays.asList("Red", "Green", "Blue", "PINK");

        // Print the original strings
        System.out.println("\nOriginal strings:");
        for (String str : stringList) {
            System.out.println(str);
        }

        // Convert strings to lowercase using lambda expression
        stringList.replaceAll(str -> str.toLowerCase());

        // Print the list of lowercase strings
        System.out.println("\nLowercase strings:");
        for (String str : stringList) {
            System.out.println(str);
        }

        // Convert strings to uppercase using lambda expression
        stringList.replaceAll(str -> str.toUpperCase());

        // Print the list of uppercase strings
        System.out.println("\nUppercase strings:");
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
*/

