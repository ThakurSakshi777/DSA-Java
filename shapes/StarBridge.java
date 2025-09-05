
// ques 
// print n*n TriangleReverse

// if be print *
// outpur is -
//* * * * * * * * * 
// * * * * # * * * *
// * * * # # # * * *
// * * # # # # # * *
// * # # # # # # # *

// Ans

package shapes;

import java.util.Scanner;

public class StarBridge {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

              	 // input for user
            System.out.println("enter the row number");
            int n = sc.nextInt();

                  // logic 
                  for (int i = 1; i <= 2*n-1; i++) {
                      System.out.print("*" + " "); // first line of stars
                  }
                  System.out.println("");
                  n--; // decrese the value of n

            for (int i = 1; i <= n; i++) { // now printing the pattern
                for (int j = 1; j <= (n+1-i); j++) { 
                    System.out.print("*" + " "); 
                }// fisrt stars 

                 for (int j = 1; j <= (2*i - 1); j++) { 
                    System.out.print("#" + " "); 
                } // spaces

                for (int j = 1; j <= (n+1-i); j++) {
                    System.out.print("*"+ " ");
                }// second stars
                System.out.println("");
            }
        }
    }
}
