// ques 
// print n*n TriangleReverse

// if be print *
// outpur is -
//       * 
//     * * *
//   * * * * *
// * * * * * * *
//   * * * * *
//     * * *
//       *

// Ans

package shapes;

import java.util.Scanner;

public class NumberSpiral {
  public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            	 // input for user
            System.out.println("enter the row number");
            int n = sc.nextInt();

            //logic 

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <=n; j++) {
                    System.out.print(Math.min(i,j) +"");
                }
                System.out.println();
            }
    }
  }
}
