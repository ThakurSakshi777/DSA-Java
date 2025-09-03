// Ques : Print the given pattern

// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *


// Ans

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input 
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Pattern printing
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}


