
// Give an array of marks of  Students , if the marks of any student is less than 5 print its roll number .[roll number] here refers to the index of the array

import java.util.Scanner;

public class RollNumber {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

             // length of array
             System.out.print("Enter the Array length" + " ");
             int n = sc.nextInt();

             // init tha array
             System.out.print("enter the number of array" + " ");
             int arr [] = new int[n];

             // input of array 
              for (int i = 0; i <= n-1; i++) {
                  arr[i] = sc.nextInt();
            }
             // logic  output
              for (int i = 0; i <= n-1; i++) {
                  if(arr[i]< 35) {
                    System.out.println("Student roll no: " + i + " is fail") ;
                  }
            }

          
             
        }
    }
}
