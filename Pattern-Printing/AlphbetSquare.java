// ques 
// print n*n Alphabet Square

// if be print (char)(j+64)
// outpur is -
// A B C D 
// A B C D
// A B C D
// A B C D

// if be print (char)(j+96)
// output is -
// a b c d
// a b c d
// a b c d
// a b c d

// ans


import java.util.Scanner;
public class AlphbetSquare {
    public static void main(String[] args) {
        // input for use 
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the row number");
            int n = sc.nextInt();

            // logic

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print((char)(j+64) + " ");
                }
                System.out.println("");
            }
        }
    }

}
