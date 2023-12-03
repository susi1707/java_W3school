package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q32_Q40 {
    public static void main(String[] args) {
        /*34. Write a Java program to find the second most frequent character in a given string.
        Sample Output:
        The given string is: successes
        The second most frequent char in the string is: c*/

        String st = "successes";
        char[] st1 = st.toCharArray();
        int index =0;
        Map<Character,Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < st1.length; i++) {
            char c = st.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0)+1 );
             }
        for (Character value : charCountMap.keySet()) {
            if (index == 1) {  // 0-based index, so 1 refers to the second value
                System.out.println("Second value: " + value);
                break;
            }
            index++;
        }


    }   }

