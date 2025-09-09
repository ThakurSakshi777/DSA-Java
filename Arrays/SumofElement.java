
import java.util.Scanner;

public class SumofElement {
  
    public static int calculetSum(int[] arr){
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        return sum;
    }
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

            // caling the method
            int totalSum = calculetSum(arr);
            
            System.out.print(totalSum);
       }
    }
}
