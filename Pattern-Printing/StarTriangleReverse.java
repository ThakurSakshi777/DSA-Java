// ques 
// print n*n TriangleReverse

// if be print *
// outpur is -
// * * * *
// * * *
// * *
// *

// if be print J
// output is -
// 1 2 3 4
// 1 2 3
// 1 2 
// 1 

// ans


import java.util.Scanner;

public class StarTriangleReverse {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // input for user
            System.out.println("enter the row number");
            int n = sc.nextInt();

            // logic 
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= (n+1-i); j++) {
                    System.err.print("*");

                }
                System.out.println("");
            }

        }
    }
}
