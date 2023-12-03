package lambda;

public class repittive_numbbbber {

        public static void main (String[]args) {
            int[] num = {1,1,2,2,2,2,3,4,5};
            int maxx=0;
            int value=0;
            for(int i=0;i<num.length;i++){
                int count=0;
                for(int j=0;j<num.length;j++){
                    if(num[i]==num[j]){
                        count++;
                    }
                }
                if (count > maxx) {
                    maxx=count;
                    value=num[i];

                }
            }
            System.out.println(value);
        }}

