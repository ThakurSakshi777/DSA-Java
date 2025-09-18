
// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

import java.util.Scanner;
public class DublicatArray {
   public static int main(String[] args) {
       try(Scanner sc = new Scanner(System.in)) {

          // length of array
             System.out.print("Enter the Array length" + " ");
             int n = sc.nextInt();

                    // init tha array
             System.out.print("enter the number of array" + " ");
             int arr[] = new int[n];

                // input of array 
              for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextInt();
            }

            // solution 
             if( arr.length == 0) {
              return 0;
             }
             

             int i = 0 ;
             for (int j = 0; j < arr.length; j++) {
                 if ( arr[i] != arr[j]) {
                    i++ ;
                    arr[i] = arr[j] ;
                 }
             }
             return i+1;
       }
   }
}
