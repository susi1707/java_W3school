package lambda;

import java.util.Arrays;
import java.util.List;

public class Q6AverageOfList {
    public static void main(String[] args) {
        List<Double> nums = Arrays.asList(3.5, 7.5, 4.3, 4.7, 5.1);

        System.out.println(nums.stream().reduce(0.0,(x,y) ->x+y)/ nums.size());

        System.out.println(nums.stream().mapToDouble(value -> value).average());

    }
}
