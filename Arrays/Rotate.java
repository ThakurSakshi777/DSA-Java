// Rotate the given array 'a' by k steps , where k is non-negative.

import java.util.Scanner;

public class Rotate {

    // Function to reverse part of the array
    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // length of array
            System.out.print("Enter the Array length: ");
            int n = sc.nextInt();

            int arr[] = new int[n];

            // input of array
            System.out.print("Enter the elements of array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the value of k (number of rotations): ");
            int k = sc.nextInt();
            k = k % n;  // to handle k > n

            // Right rotation by k steps using reversal algorithm
            reverse(arr, 0, n - k - 1);
            reverse(arr, n - k, n - 1);
            reverse(arr, 0, n - 1);

            // Print rotated array
            System.out.print("Rotated Array: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

