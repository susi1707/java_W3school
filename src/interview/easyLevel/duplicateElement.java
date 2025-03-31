package interview.easyLevel;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class duplicateElement {
    public static void main(String[] args) {
       String counts = Stream.of(10,28,87,10,20,76,28,80)
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue() > 1)
               .map(e->String.valueOf(e.getKey())).collect(Collectors.joining(","));

        System.out.println(counts);

        HashSet<Integer> hs = new HashSet<>();
         Stream.of(10,28,87,10,20,76,28,80).filter(e->!hs.add(e)).forEach(System.out::println);






    }
}
