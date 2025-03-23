package lambda;

import java.util.function.Predicate;

public class predicate {
    public static void main(String[] args) {

        Predicate<String> pre = (e) -> e.length() > 5 ;

        System.out.println(pre.test("gigaaa"));
    }
}
