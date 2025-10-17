// Find the difference between the sum of elements at even indices to the sum of elements at odd indices.

package PracticeQuestions.ArrayAssignment;

import java.util.Scanner;

public class EvenAndOddDefference {
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
           int SumEven = 0 ;
           int SumOdd = 0 ;

            for (int i = 0; i < arr.length; i++) {
                if(arr[i]%2 == 1){
                   SumEven+=arr[i];
                } else {
                    SumOdd+=arr[i];
                }
            }
            int deffirence = SumEven - SumOdd ;
            System.out.println( "the total sum in even position  " + SumEven  + "  the total sum in Odd position  " +  SumOdd + " the diffrence is "+ deffirence);
        }
    }
}
