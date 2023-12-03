package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Largestnumber {
    public static void main(String[] args) {
        int[] num ={0,5,6,0,9,0,1,4};

        List list = new ArrayList<>();
        int temp =0;

        for (int i = 0; i <num.length ; i++) {
                int arr=    num[i]+temp;
                list.add(arr);
            for (int j = 0; j <num.length ; j++) {
                if(num[i]==num[j])
                    temp = num[j];
            }
        }
        int maxxx = (int) Collections.max(list);
        System.out.println(maxxx);
    }
}
