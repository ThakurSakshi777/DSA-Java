//  Given an array of integers, change the value of all odd indexed elements to its second multiple and increment all even indexed values by 10.




package PracticeQuestions.ArrayAssignment;

import java.util.Scanner;

public class ChangeValue {
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
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]%2 == 1){
                   arr[i] = arr[i]*2;
                }else{
                    arr[i] = arr[i]+10;
                }
            }
             // print updated array
              System.out.print("Modified Array: ");
                for (int num : arr) {
            System.out.print(num + " ");
            }
        }
    }
}
