

// ques 
// print n*n TriangleReverse

// if be print *
// outpur is -
// 1 2 3 4 5 6 7 
// 1 2 3 # 5 6 7 
// 1 2 # # # 4 5 
// 1 # # # # # 3 

// Ans 

package shapes; 
import java.util.Scanner;

public class NumberBrige {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

                 	 // input for user
            System.out.println("enter the row number");
            int n = sc.nextInt();

            // logic 

             // logic 
                  for (int i = 1; i <= 2*n-1; i++) {
                      System.out.print(i + " "); // first line of number
                  }
                  System.out.println("");
                  n--; // decrese the value of n

            for (int i = 1; i <= n; i++) { // now printing the pattern
                 int a=1; // inisilaing the varialble a
                for (int j = 1; j <= (n+1-i); j++) { 
                    System.out.print(a++ + " "); 
                }// fisrt stars 

                 for (int j = 1; j <= (2*i - 1); j++) { 
                    System.out.print("#" + " "); 
                }   a++; // spaces

                for (int j = 1; j <= (n+1-i); j++) {
                    System.out.print(a++ + " ");
                }// second stars
                System.out.println("");
            }
                
        }
    }
}
