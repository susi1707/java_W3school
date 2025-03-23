package Stream;

import java.util.Arrays;
import java.util.List;

public class basic {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,24,6,7,55);
        Long len = num.stream().count();
        System.out.println(len);
    }
}
