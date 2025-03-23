package interview;

import java.util.*;
import java.util.stream.Collectors;

/*
Input:  [1, 5, 3, 4, 3, 5, 6]
Output: 3  (because 3 is the first element that repeats)
Input:  [10, 20, 30, 40, 50]
Output: -1  (no repeating elements)
 */
public class FirstRepeatingElement {
    public static void main(String[] args) {
//        List<Integer> num = Arrays.asList(1, 5, 3, 4, 3, 5, 6) ;
//
//       Map<Integer, Long> lis = num.stream()
//               .collect(Collectors.groupingBy(
//                       e->e,Collectors.counting()));
//               Integer l =   lis.entrySet().stream().filter(e->e.getValue()>1)
//                        .mapToInt(e-> e.getKey())
//                        .findFirst()
//                        .orElse(-1);
//
//        System.out.println(l);

//----------------------------------------chatgpt---------------------------------
//        List<Integer> numList = Arrays.asList(1, 5, 3, 4, 3, 5, 6); // Example input
//
//        Set<Integer> seen = new HashSet<>();
//
//        int result = numList.stream()
//                .filter(n -> !seen.add(n))  // Filter numbers that have already been seen
//                .findFirst()                // Get the first repeating number
//                .orElse(-1);                // Default value if no repeating element
//
//        System.out.println("First Repeating Element: " + result);

//----------------------------------------normal Collection---------------------------------
        List<Integer> numList = Arrays.asList(1, 5, 3, 4, 3, 5, 6); // Example input

        Set<Integer> seen = new HashSet<>();
        int result = -1;  // Default value if no repeating element is found

        for (int num : numList) {
            if (seen.contains(num)) {
                result = num;
                break;  // Exit loop when first repeating element is found
            }
            seen.add(num);
        }

        System.out.println("First Repeating Element: " + result);
    }
}
