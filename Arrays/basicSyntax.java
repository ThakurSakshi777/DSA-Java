
import java.util.Scanner;

public class basicSyntax {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = new int[5];
            System.out.println(arr.length); // find the length of arre
            // initialising individual element
            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30;
            arr[3] = 40;
            arr[4] = 50;

            // // oputput of array elements
            System.out.println(arr[0]);

            // modify the array element
            arr[0] = 99;
            System.out.println(arr[0]);


           // input for array size
            System.out.println("Enter Array Size : ");
           int n = sc.nextInt();
            // input -> loop
             System.out.println("Enter Array number : ");
            int[] Arrloop = new int[n];
           
            for (int i = 0; i <= n-1; i++) {
                Arrloop[i] = sc.nextInt();
            }
            // output -> loop
            for (int i = 0; i <=n-1; i++) {
                System.out.print(Arrloop[i] + " ");
            }
        }
    }
}
