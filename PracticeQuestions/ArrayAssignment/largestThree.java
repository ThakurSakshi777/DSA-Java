//WAP to find the largest three elements in the array

package PracticeQuestions.ArrayAssignment;

import java.util.Scanner;

public class largestThree {
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
            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;
            int three = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                if(arr[i] > first){
                    three = second ;
                    second = first ;
                    first = arr[i] ;

                } else if ( arr[i] < second && arr[i] != first){
                    three = second;
                    second = arr[i];
                } else if  ( arr[i] < three &&  arr[i] !=second){
                    three = arr[i];
                }
            }
            System.out.print("first no . "+ first +"seccond no ." + second + " three no ." + three);
        }
    }
}
