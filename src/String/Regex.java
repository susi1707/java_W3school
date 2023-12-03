package String;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String res = scan.nextLine();

       String result = res.replaceAll("\\D+","");
        System.out.println(result);
    }
}
