import java.util.Scanner;

public class MargArray {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            
             int arr1 [] = { 2 , 5 , 7 ,9} ;
             int arr2 [] = { 3 , 8 , 12 ,14} ;
              
                // init tha array c
            
             int arr3[] = new int[arr1.length+ arr2.length];

            // Solution

             int i = 0 , j = 0 , k = 0 ;
             while(i<arr1.length && j<arr2.length) {
                if(arr1[i] <= arr2[j]) {
                    arr3[k] = arr1[i] ;
                    i++ ;
                    k++;
                } else  {
                    arr3[k] = arr2[j] ;
                 j++ ;
                 k++;
                }
                
             } 
            

             if(i == arr1.length)  { // arr2 ke element bache h bas 
                while (j < arr2.length) { 
                    arr3[k] = arr2[j];
                    j++ ;
                    k++;

                }
             }
              if ( j == arr2.length) { // arr1 ke element bache ha bas
                     while (i < arr1.length) { 
                    arr3[k] = arr2[i];
                    i++ ;
                    k++;

                }
                }

              for(int ele:arr3){
                System.out.print(ele + " ");
            }
           
        }
    }
}
