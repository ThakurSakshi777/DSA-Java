//You are given a sorted 2D matrix, and you need to find if a target value exists in it.



package ArrayList;

public class Target {
    public static void main(String[] args) {
         int[][] arr = {{ 1,2,3 },{ 4,5,6},{ 7,8,9}};
        
           int m = arr.length;  
        int n = arr[0].length;
        int i = 0;          // start from top row
        int j = n - 1; 
        int target = 6;
        boolean flag = false;

         while (i < m && j >= 0) {
            if (arr[i][j] == target) {
               flag = true;
                break; 
                
            } else if (arr[i][j] > target) {
                j--;  // move left
            } else { 
                i++;  // move down ✅ (this was the mistake)
            }
        }
      
         if (flag) {
            System.out.println("Target found!");
        } else {
            System.out.println("Target not found!");
        }

    }
}
