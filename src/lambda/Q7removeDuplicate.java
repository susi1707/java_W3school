package lambda;

import java.util.List;
import java.util.stream.Collectors;

public class Q7removeDuplicate {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 3, 4, 3, 2, 5, 6, 1, 7, 7, 8, 10);
        System.out.println(
        nums.stream().distinct().collect(Collectors.toList()));

    }
}
