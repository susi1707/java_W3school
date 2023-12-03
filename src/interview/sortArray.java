package interview;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        for (int i = 1; i <a.length ; i+=2) {
            int temp = a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);

        }
    }
}
