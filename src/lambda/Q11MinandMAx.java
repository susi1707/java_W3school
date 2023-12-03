package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q11MinandMAx {
    public static void main(String[] args) {
        int[] nums = {12, 15, 0, 8, 7, 9, -6};
        System.out.println(Arrays.stream(nums).min());
        /*System.out.println(nums.stream().min(Comparator.naturalOrder()));
        System.out.println(nums.stream().max(Comparator.naturalOrder()));*/

    }
}
