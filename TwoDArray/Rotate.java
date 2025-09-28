// Rotate the matrix by 90 degrees clockwise. leedcode 48

package TwoDArray;

public class Rotate {
    public static void print(int[][] arr) {
        int m = arr.length , n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               System.err.print( arr[i][j]+" "); 
            }
            System.err.println();
        }
        System.err.println();
    }
    public static void main(String[] args) {
        int [][] arr = {{1,2,3} , {4,6,7} ,{5,7,8}};
         int m = arr.length ;
        print(arr);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
              int temp = arr[i][j] ;
              arr[i][j] = arr[j][i] ;
              arr[j][i] = temp ;
            }
        }
         print(arr);
    }
}
