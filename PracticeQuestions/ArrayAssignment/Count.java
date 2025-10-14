// Count the number of elements strictly greater than x

package PracticeQuestions.ArrayAssignment;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
             // Take a length of the array
            System.out.print("Array length");
            int n = sc. nextInt();

            // create a array 
            int [] arr = new int[n];

             //Take a input for the array
             System.out.print("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // solution
            int x = 7 ;
            int count = 0 ;
            for (int i = 0; i < n; i++) {
                if(arr[i]> x){
                    count++;
                }
            }
            System.out.println("total count is  " + count);
        }
    }
}
