// WAP to find the duplicate elements from the given array of elements

package PracticeQuestions.ArrayAssignment;

import java.util.Scanner;

public class Duplicate {
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

            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    if( arr[i] == arr[j]){
                        System.out.println("Duplicat element is" + arr[i]);
                        break;
                    } 
                }
            }
        }
    }
}
