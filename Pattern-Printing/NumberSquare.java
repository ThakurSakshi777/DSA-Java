// ques 
// print n*n number

// if be print j 
// outpur is -
// 1 2 3 4 
// 1 2 3 4
// 1 2 3 4
// 1 2 3 4

// if be print i
// output is -
// 1 1 1 1
// 2 2 2 2
// 3 3 3 3
// 4 4 4 4

// ans


import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {

        // input for use 
       System.out.println("Enter the row number");
         int n = sc.nextInt();

         // logic

         for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= n; j++) {
                System.err.print(j);
              
             }
             System.out.println("");
         }
      }
       
    }
}
