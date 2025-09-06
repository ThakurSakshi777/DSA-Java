
// Find the element 'X' in the array. Take array and X as input.

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
       
            // Array length
            System.out.print("Enter the length of array: ");
            int n = sc.nextInt();

            // Enter the number X
            System.out.print("Enter the number X :  ");
            int x = sc.nextInt();

            // Array
             System.out.print("Enter array element  :  ");
            int arr[] = new int [n];
            // input of array
            for (int i = 0; i < arr.length; i++) {
                arr[i]= sc.nextInt();
            }

           // Solution
           boolean found = false;
           for (int i = 0; i < arr.length; i++) {
               if(arr[i] == x) {
                   System.out.print("Element found");
                   found = true;
                   break;
               }
           }
           if (!found) {
               System.out.print("Element is not found");
           }
        }
     }
 }

