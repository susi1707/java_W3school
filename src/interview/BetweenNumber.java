package interview;

public class BetweenNumber {
    public static void main(String[] args) {
        int[] num ={4,3,7,12,50,1};
        int x = 4;
        int y =51;
        int temp =0;
        for (int i = 0; i <num.length ; i++) {

            if(x<num[i] && y>num[i]){
                temp = num[i];
                System.out.println(temp);
            }

        }


    }
}
