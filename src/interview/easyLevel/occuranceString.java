package interview.easyLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class occuranceString {
    public static void main(String[] args) {
//        String myStr = "Split a string by spaces, and also punctuation.";
//        String regex = "[,\\.\\s]";
//        String[] myArray = myStr.split(regex);
//        for (String s : myArray) {
//            System.out.println(s);

        String words = "welcome to code decode and code decode welcome you";
        String regex = "[\\s]";

        Map<String,Long> count = Arrays.stream(words.split("\\s")).collect(Collectors.groupingBy(e->e, Collectors.counting()));
       // String[] myArray = words.split(regex) ;
        //Map<String,Long> count = Arrays.stream(myArray).collect(Collectors.groupingBy(e->e, Collectors.counting()));
        System.out.println(count);





    }
}
