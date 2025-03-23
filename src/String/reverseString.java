package String;

public class reverseString {
    public String reverseString(String input){
        StringBuilder inu = new StringBuilder(input);
        return inu.reverse().toString();
    }

    public static void main(String[] arg){
       reverseString str = new reverseString();
        System.out.println(str.reverseString("Hello world"));
    }
}
