package Arrays;

public class Array2D {
    public static void main(String[] args) {
        int[][] two_d = new int[3][3];
        int value =1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                two_d[i][j]= value;
                value++;
            }
        }
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(two_d[row][col]+" ");
            }
            System.out.println();
        }

    }
}
