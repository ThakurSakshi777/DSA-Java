//Check if the given array is sorted or not

package PracticeQuestions.ArrayAssignment;

import java.util.Scanner;

public class Sorted {
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

            //Solution

            boolean flag = false;
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[i]<arr[j]){
                     flag = true;
                    }
                }
            }
            if(flag == true) {
              System.out.println("array are sorted");
            } else {
                System.out.println("Array are not sorted");
            }
        }
    }
}
