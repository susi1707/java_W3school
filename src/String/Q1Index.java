package String;
/*Original String = Java Exercises!
        The character at position 0 is J
        The character at position 10 is i*/
public class Q1Index {
    public static void main(String[] args) {
        /*---------------------Q1-----------------------
        Original String = Java Exercises!
        The character at position 0 is J
        The character at position 10 is i
        ---------------------------------------------Answer------------------------
        String check =  "Java Exercises!";
        System.out.println(check.charAt(0));
        System.out.println(check.charAt(10));*/

        /*Write a Java program to get the character
        (Unicode code point) at the given index within the string.*/

        String check = "w3resource.com";
        System.out.println(check.codePointAt(1));
        System.out.println(check.codePointAt(10));

    }
}
