// ques 
// print OddNumber Triangle

// if be print *
// outpur is -
// 1
// 2 3
// 4 5 6
// 7 8 9 10

// ans


import java.util.Scanner;

public class FloyasTriangle {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

             // input for user
            System.out.println("enter the row number");
            int n = sc.nextInt();

                 // logic 
                  int a = 1 ;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.err.print(a++  + " ");
                    
                }
                System.out.println("");
            }

        }
    }
}
