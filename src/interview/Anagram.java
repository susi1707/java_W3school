package interview;

public class Anagram {
    public static void main(String[] args) {
        String s1 ="anagram";
        String s2 = "nagarae";

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if(s1.charAt(i)==s2.charAt(j)){
                   s2= s2.replaceFirst(String.valueOf(s2.charAt(j)),"");
                    break;
                }
            }
        }

        System.out.println(s2.isEmpty());
    }
}
