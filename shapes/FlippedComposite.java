
// ques 
// print n*n TriangleReverse

// if be print *
// outpur is -
// # # # 1
// # # 1 2
// # 1 2 3
// 1 2 3 4

package shapes;

import java.util.Scanner;

public class FlippedComposite {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

               // input for user
            System.out.println("enter the row number");
            int n = sc.nextInt();

                  // logic 
            for (int i = 1; i <= n; i++) { // row
                for (int j = 1; j <= (n-i); j++) { // col
                    System.out.print("#" + " "); // hash
                }
                 for (int j = 1; j <= i; j++) { // col
                    System.out.print(j + " "); // hash
                }
                System.out.println("");
            }
        }
    }
}
