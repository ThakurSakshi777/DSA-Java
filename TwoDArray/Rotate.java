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
        int [][] arr = {{1,2,3} , {4,6,7} ,{8,9,10}};
         int m = arr.length ;
        print(arr);

     // Transposing 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
              int temp = arr[i][j] ;
              arr[i][j] = arr[j][i] ;
              arr[j][i] = temp ;
            }
        }
         print(arr);

         // Rotate 90% , After trasnsposing Revers arch row 
          for (int i = 0; i < m; i++) {
            int low = 0 , hi = m-1 ;
              while (low< hi) { 
              int temp = arr[i][low] ;
              arr[i][low] = arr[i][hi] ;
              arr[i][hi] = temp ;
              low++ ;
              hi-- ;

              }
            }
        
         print(arr);
    }
}
