package lambda;

import java.util.List;
import java.util.stream.IntStream;

public class Q12MultipleAndSum {
    public static void main(String[] args) {
        List<Integer> num  = List.of(4, 2, 3, 6, 5, 1);
        System.out.println("product  of list " + num.stream().reduce(1,(x,y) -> x*y));
        System.out.println("Sum of list " + num.stream().reduce(0,(x,y) -> x+y));
    }
}
