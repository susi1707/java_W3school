package JAVA8.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EvenNumber {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 33, 5, 6, 77, 8);
        List<Integer> evenNumbers = numbers.stream().filter(no -> no%2==0).collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);
    }
}
