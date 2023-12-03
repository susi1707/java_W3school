package String;
//Write a Java program to print the first and last
// character of the string using the charAt() method.
public class firstlast {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length()-1));
    }
}
