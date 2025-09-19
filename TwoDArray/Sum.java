//Sum of 2D array

package TwoDArray;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            int a [][] = {{1,2,3},{4,5,6},{7,6,7}};
            int b [][] = {{1,2,3},{4,5,6},{7,6,7}};

            int n= a.length;
            int m = a[0].length;

             int [][] sum = new int [n][m];

            for (int i = 0; i <n; i++) {
                for (int j = 0; j < m; j++) {
                    sum[i][j] = a[i][j]+b[i][j];
                    System.out.print(sum[i][j]+" ");
                }
                System.out.println("");
            }
            

        }
    }
}
