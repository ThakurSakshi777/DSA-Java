// Find the second largest element in the given Array in one pass.
package PracticeQuestions.ArrayAssignment;

import java.util.Scanner;

public class largest {
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

            //solution
            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++) {
                if(arr[i]> first){
                    second = first;
                    first = arr[i];
                } else if ( arr[i] > second && arr[i] != first){
                    second = arr[i];
                }
            }
            System.out.println("Second latrgest number is"+ second);

        }
    }
}
