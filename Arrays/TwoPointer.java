
import java.util.Scanner;

public class TwoPointer {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
           
            
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

             // Solution
            int i =0; 
            int j = n-1;
            while (i<=j) { 
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp ;

               i++;
               j--;
            }
            for(int ele:arr){
                System.out.print(ele);
            };
        }
    }
}
