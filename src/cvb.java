import java.util.ArrayList;
import java.util.Arrays;

public class cvb {
    public static void main(String[] args) {

        ArrayList<Object[]> list = new ArrayList<>();

        // Create some arrays of objects
        Object[] array1 = { "John", 28, true };
        Object[] array2 = { "Doe", 32, false };
        Object[] array3 = { "Smith", 25, true };
        Object[][] a= {array1,array2,array3};
        System.out.println(a[0][0]);

        // Add these arrays to the list
        list.add(array1);
        list.add(array2);
        list.add(array3);

        // Display the contents of the list
        /*for (Object[] arr : list) {
            System.out.println(Arrays.Arrays.toString(arr));
        }*/
}}
