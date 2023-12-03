package lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Q10ConcTwoString {
    public static void main(String[] args) {
        BiFunction<String, String, String> con = (x, y) -> x + y;
        String str1 = "Hello";
        String str2 = " world";
        System.out.println(
                con.apply(str1, str2));

    }

}
