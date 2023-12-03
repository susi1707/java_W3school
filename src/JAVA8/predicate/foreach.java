package JAVA8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class foreach {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,34,6657,87,45);
        //num.forEach(no -> System.out.println(no+1));
        Consumer<Integer> con = n1 -> System.out.println(n1*2);

        con.accept(50);
    }
}
