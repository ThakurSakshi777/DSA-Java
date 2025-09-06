// find the maximum value out of all elements in the array 
// find the second largest elemet

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
      
             // Array length
            System.out.print("Enter the length of array: ");
            int n = sc.nextInt();

            // Array
              int arr[] = new int [n];
             System.out.print("Enter array element  :  ");
            // input of array
            for (int i = 0; i < arr.length; i++) {
                arr[i]= sc.nextInt();
            }

            // Solution first largest
            int max = Integer.MIN_VALUE;
            for (int i =0; i <arr.length; i++) {
                // if(arr[i]> max) max = arr[i];
                max = Math.max(max, arr[i]);
            }
            System.out.println(max);

              // Solution second largest
            int smax = Integer.MIN_VALUE;
            for (int i =0; i <arr.length; i++) {
                // if(arr[i]> max) max = arr[i];
                if(arr[i] != max)
                smax = Math.max(smax, arr[i]);
            }
            System.out.println(smax);
            
        }
    }
}
