// You are given an m x n binary matrix grid. * *leedcode 861*

// A move consists of choosing any row or column and toggling each value in that row or column (i.e., changing all 0's to 1's, and all 1's to 0's).

// Every row of the matrix is interpreted as a binary number, and the score of the matrix is the sum of these numbers.

package ArrayList;

public class ScoreFlipping {
    public static void main(String[] args) {
        int [][] arr = {{ 0,0,1,1},{1,0,1,0},{1,1,0,0}};

        int m = arr.length;
        int n = arr[0].length;

      
        // Step 1: Make sure every row starts with 1

        for (int i = 0; i < m; i++) {
            if(arr[i][0] ==0 ){
                for (int j = 0; j < n; j++) { // rotated the row
                    if(arr[i][j] == 0) {
                        arr[i][j] = 1;
                    } else arr[i][j] = 0 ;
                }
            }
        }

       
           // Step 2: Flip columns where zeros are more than ones

        for (int j = 1; j < n; j++) {
            int NoOfZeros = 0 , NoOfOnes = 0 ;
            for (int i = 0; i < m; i++) {
                if(arr[i][j] == 0){ // cult the no of ones and zeros
                    NoOfZeros++;
                } else NoOfOnes++;
            }
           if(NoOfZeros > NoOfOnes){  // flip the cols
            for (int i = 0; i < m; i++) {
                    if(arr[i][j] == 0) {
                        arr[i][j] = 1;
                    } else arr[i][j] = 0 ;
            }
           }
            
        }

         int score = 0;
        for (int i = 0; i < m; i++) {
            int rowValue = 0;
            for (int j = 0; j < n; j++) {
                rowValue = (rowValue * 2) + arr[i][j];
            }
            score += rowValue;
        }
   
        System.out.println(score);

    }
}
