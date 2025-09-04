// ques 
// print n*n TriangleReverse

// if be print *
// outpur is -
// # # # * * * *
// # # * * * *
// # * * * *
// * * * *

package shapes;

import java.util.Scanner;

public class Rhombus {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){

			     // input for user
            System.out.println("enter the row number");
            int n = sc.nextInt();

			
                  // logic 
            for (int i = 1; i <= n; i++) { // row
                for (int j = 1; j <= (n-i); j++) { // col
                    System.out.print(" " + " "); // space
                }
                 for (int j = 1; j <= n; j++) { // col
                    System.out.print("*" + " "); // hash
                }
                System.out.println("");
            }
		}
	}
}
