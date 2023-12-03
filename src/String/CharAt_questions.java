package String;

import java.util.ArrayList;
//Write a Java program that prints the last character of every word in the string.
// You are to use the charAt() method as part of your solution
public class CharAt_questions {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog.";
        String[] str = sentence.split("\\s");
        for(String word: str){
            System.out.print(word.charAt(word.length()-1));
        }
       }


    }

