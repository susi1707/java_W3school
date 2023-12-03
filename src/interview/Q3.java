package interview;

public class Q3 {
    public static void main(String[] args) {
        int[] num ={1,2,3,4,5,6,7,8,9,10,11,12,13};
            int ap=3;
        for (int j = 0; j < ap; j++) {
            int temp =0;
        for (int i = j; i <num.length ; i=i+ap) {
            temp=num[i]+temp;

        }
        System.out.println(temp);
    }}

}
