
import java.util.Scanner;

public class DutchFlag {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

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
         
            //Two pass solutioin 

            // int NoOfZeros = 0 ;
            // int NoOfOnes = 0 ;
            // int NoOfTwos = 0;

            // for (int i = 0; i < n; i++) {
            //     if(arr[i] == 0) {
            //         NoOfZeros++;
            //     } 
            //      if(arr[i] == 1) {
            //         NoOfOnes++;
            //     } 

            // }

            // for (int i = 0; i < n; i++) {
            //     if(i<NoOfZeros) {
            //         arr[i] = 0;
            //     }
            //    else  if( i>= NoOfOnes && i<NoOfZeros+NoOfOnes) {
            //         arr[i] = 1;
            //     } else  arr[i] = 2;
            // }

             

             // Dutch Flag Algo 

             int mid = 0 , low = 0 , hi = n-1;
            
             while(mid<=hi) {
                  if(arr[mid] == 0){
                    int temp = arr[mid];
                    arr[mid] = arr[low] ;
                    arr[low] = temp ;
                    low++ ; mid++ ;
                 }
                 else if ( arr[mid] == 1) mid++;
                 else { // arr[mid] == 2 
                     int temp = arr[mid];
                     arr[mid] = arr[hi];
                     arr[hi] = temp;
                     hi--;
                 }
             }
             
                // print the ans
             for (int k = 0; k < n; k++) {
                 System.out.print(arr[k]);
             }
            
        }
    }
}
