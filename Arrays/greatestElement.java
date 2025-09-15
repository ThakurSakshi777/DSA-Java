import java.util.Scanner;

public class greatestElement {
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

            int [] ans = new int [n];
            ans[n-1] = -1;
            // solution 
            int Max = arr[n-1];

            for (int i = n-2; i >= 0; i--) {
                ans[i] = Max ;
                Max = Math.max(Max, arr[i]);
            }

            //Printing the result array
            for(int ele : ans){
                System.out.print(ele + " ");
            }
        }
    }
}
