
import java.util.Scanner;

public class OddNumTriangle {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

             // input for user
            System.out.println("enter the row number");
            int n = sc.nextInt();

                  // logic 
            for (int i = 1; i <= n; i++) {
                int a = 1 ;
                for (int j = 1; j <= i; j++) {
                    System.err.print(a + " ");
                    a+= 2;
                }
                System.out.println("");
            }

        }
        }
    }

