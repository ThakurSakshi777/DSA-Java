// Transpose of the matrix , and store it in a new matrix;

package TwoDArray;

public class Transpose {
    public static void main(String[] args) {
         int arr [][] = {{1,2},{4,5},{6,7}};

        int n= arr[0].length;
        int m = arr.length;

          int transpose [][] = new int[n][m];

         for (int i = 0; i <n; i++) {
                for (int j = 0; j < m; j++) {
                   transpose[i][j] = arr[j][i];  
                     System.out.print(transpose[i][j] + " " );
                }
                System.out.println();
            }
            

    } 
}
