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

public class StarDiamond {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

              	 // input for user
            System.out.println("enter the row number");
            int n = sc.nextInt();

            int noOfSpace = n-1;
            int noOfStare = 1;
           
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= noOfSpace; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= noOfStare; j++) {
                    System.out.print("* ");
                }
                System.out.println();
                noOfSpace--;
                noOfStare += 2;
            }

            noOfSpace = 1;
             noOfStare = noOfStare-4;
           
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= noOfSpace; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= noOfStare; j++) {
                    System.out.print("* ");
                }
                noOfSpace++;
                noOfStare -= 2;
                System.out.println("");
            }
 
        }
    }
}
