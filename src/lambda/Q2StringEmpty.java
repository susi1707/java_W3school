package lambda;

import java.util.function.Predicate;

public class Q2StringEmpty {
    public static void main(String[] args) {
        Predicate<String> isEmptyString = str -> str.isEmpty();
        String str1="";
        String str2 ="Java is fun";

        System.out.println(isEmptyString.test(str1));
        System.out.println(isEmptyString.test(str2));

    }
}
