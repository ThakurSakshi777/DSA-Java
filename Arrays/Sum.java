// Calculate the sume of Array element

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

               // length of array
             System.out.print("Enter the Array length" + " ");
             int n = sc.nextInt();

                    // init tha array
             System.out.print("enter the number of array" + " ");
             int arr[] = new int[n];

                // input of array 
              for (int i = 0; i < arr.length; i++) {
                  arr[i] = sc.nextInt();
            }

            // extra variable
            int sum = 0 ;
            // Calc  the sum 
            for (int i = 0; i < arr.length; i++) {
                sum+=arr[i];
            }
            System.out.println("total sum is " + sum);
        }
    }
}
