package String;

public class Q14 {
    public static void main(String[] args) {
        /*Q14
        String st1 = "Stephen Edwin King";
        String st2 = "stephen edwin king";
        System.out.println("Stephen Edwin King\" equals \"stephen edwin king " + st1.equalsIgnoreCase(st2));*/
      /*  Q25
        String st1 = "The quick brown fox jumps over the lazy dog.";

        System.out.println(st1.replaceAll("fox","cat"));*/

        /*Q26.Write a Java program to check whether a given string starts with another string.
        *
        * Red is favorite color. starts with Red?true
        *
        ==================================================ANS=============================

        String st1 = "Red is favorite color";
        System.out.println(st1.startsWith("Red"));*/

        /*27. Write a Java program to get a substring of a given string at two specified positions.

        Sample Output:

        old = The quick brown fox jumps over the lazy dog.
        new = brown fox jumps
        ===========================================================ANS=========================

        String st1 = "The quick brown fox jumps over the lazy dog";
        System.out.println(st1.substring(10,26));*/

        /*28. Write a Java program to create a character array containing a string.

        Sample Output:

        Java Exercises
        ==================================ANS===========================================

        String st1 = "Java Exercises.";
        char[] arr = st1.toCharArray();
        System.out.println(arr);
        */
        /*31. Write a Java program to trim leading or trailing whitespace from a given string.

        Sample Output:

        Original String:  Java Exercises
        New String: Java Exercises
        ===================================ANS=================================================
        String st1 = "                     Java Exercises                              ";
        System.out.println("before "+ st1);
        System.out.println(st1.trim());
        */
    }
}
