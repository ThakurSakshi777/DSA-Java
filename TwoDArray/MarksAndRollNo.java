// Write a program to store roll number and marks obained by 4 students side by side in a matrix.

package TwoDArray;

import java.util.Scanner;

public class MarksAndRollNo {
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in))  {
        
        int[][] arr = new int[4][2];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) { 
                for (int j = 0; j < 2; j++) {
                    System.out.print(arr[i][j]+ " ");
             }
             System.out.println("");
        }
       }
    }
}
