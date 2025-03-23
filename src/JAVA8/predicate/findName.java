package JAVA8.predicate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class findName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter letter of Members");
        String inputLetter = in.next();
        List<String> Names = List.of("susin","razor","jimn");

        List<String> nameList =  Names.stream().filter(findName -> findName.contains(inputLetter)).collect(Collectors.toList());
        System.out.println(nameList.isEmpty()?"Name Not there": nameList);
        in.close();
    }
}
