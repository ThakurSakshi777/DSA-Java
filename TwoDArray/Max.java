// Find the largest element in 2D array

package TwoDArray;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){


            // length of array
             System.out.print("Enter the Array length" + " ");
             int n = sc.nextInt();
              // length of array
             System.out.print("Enter the Array length" + " ");
             int m = sc.nextInt();

                    // init tha array
             System.out.print("enter the number of array" + " ");
             int arr[][] = new int[n][m];

                // input of array 
              for (int i = 0; i < n; i++) {
                  for (int j = 0; j < m; j++) {
                      arr[i][j] = sc.nextInt();
                  }
            }

            // Solution
             int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(arr[i][j] > max) {
                        max = arr[i][j];
                    }
                }
            }

            System.err.println(max);

      
        }
    }
}
