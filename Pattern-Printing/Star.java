// ques 
// print n*n stars

// * * * *
// * * * *
// * * * *
// * * * *

// ans

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // User se input lena
            System.out.print("Enter number of rows: ");
            int n = sc.nextInt();

            // Pattern printing
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}


