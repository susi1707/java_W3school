package String;

import java.util.Random;

//count the first char of given string
public class countTheString {
    public static void main(String[] args) {
        String s = "educatn";
        char[] res = {'a','i','o','e','u'};
        int vowel= 0;
        for(int i=0; i<s.length();i++){
            for(int result : res){
                if(s.charAt(i) == result){
                    vowel++;
                }

            }

           }
        int consont = s.length()-vowel  ;
        System.out.println("Vowels "+vowel  +"\n"+"Remaining " +consont);
        }

    }

