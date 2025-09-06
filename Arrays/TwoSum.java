// find the double in the array whose sum is equal to the given value x (Two Sum).

import java.util.Scanner;

public class TwoSum {
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
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[i]+arr[j] == x) {
                        System.err.print(arr[i]+ " " + arr[j]);
                        
                    }
                }
            }

        }
    }
}
