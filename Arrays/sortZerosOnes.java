
import java.util.Scanner;

public class sortZerosOnes {
    public static void main(String[] args) {
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

            // Two pass Solution

            // int NoOfZeros = 0 ;

            // for (int i = 0; i < n; i++) {
            //     if(arr[i] == 0){
            //         NoOfZeros++;
            //     }
            // }

            // for (int i = 0; i < n; i++) {
            //     if(i<NoOfZeros) {
            //         arr[i] = 0;
            //     } else arr[i] = 1;
            //  }


            

             // one pass Solution
              
             int i = 0 , j = n-1 ;
             while( i<j) {
                if(arr[i] == 0) i++;
                if(arr[j] == 1) j-- ;
                if(i>j) break;

                if( arr[i] == 1  && arr[j] == 0) {
                    arr[i] = 0 ;
                    arr[j] = 1 ;
                    i++;
                    j--;
                }
                 // print the ans
             for (int k = 0; k < n; k++) {
                 System.out.print(arr[k]);
             }
             }
        }
    }
}
