package String;

public class Q10 {
    public static void main(String[] args) {
        String string1 = "example.com";
        String string2 = "example.com";
        StringBuffer strbuf = new StringBuffer(string1);
        System.out.println(string1.contentEquals(strbuf));


    }
}
