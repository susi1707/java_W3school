package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Question:
Write a Java program to find the first non-repeating character in a given string. If all characters are repeated, return '_'.
Input: "swiss"
Output: 'w'
Input: "success"
Output: 'u'
Input: "aabbcc"
Output: '_'
 */
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        char[] c = input.toCharArray();

        HashMap<Character,Integer> hm = new HashMap<>();
        List<Character> l = new ArrayList<>();

        for (Character m : c){
            if(hm.containsKey(m)){
                hm.put(m,hm.getOrDefault(m, 0)+1);
            }else{
                hm.put(m,1);
            }
        }
        for (Map.Entry<Character, Integer> k:hm.entrySet()) {
            if(k.getValue()==1){
                l.add(k.getKey());
            }
        }
        if(l.size()==0){
            System.out.println("_");
        }else {
            System.out.println(l.get(0));
        }



    }
}
