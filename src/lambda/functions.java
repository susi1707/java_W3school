package lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class functions {
    public static void main(String[] args) {
        Function<Integer,Integer> sum = (e) -> e+e;
        System.out.println(sum.apply(5));

        BiFunction<Integer,Integer,Integer> multi = (e,i) -> e*i;
        System.out.println(multi.apply(5,5));
    }
}
