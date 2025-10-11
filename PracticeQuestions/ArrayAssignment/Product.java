//Calculate the product of all the elements in the given array.

package PracticeQuestions.ArrayAssignment;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
      try ( Scanner sc = new Scanner(System.in)){
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
            int sum = 1; // Start with 1 because multiplication identity = 1

            for (int i = 0; i < n; i++) {
                sum*=arr[i]; // multiply each element
            }
         System.out.println("Product of all elements = " + sum);

        }
    }
}
