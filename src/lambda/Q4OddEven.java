package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q4OddEven {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);
        nums.stream().forEach(System.out::println);
        System.out.println("even Number");
        System.out.println(nums.stream(). filter(o -> o%2 == 0).
                collect(Collectors.toList()));
        System.out.println("Odd Number");
        System.out.println(nums.stream(). filter(o -> o%2 != 0).
                collect(Collectors.toList()));
    }
    
}
