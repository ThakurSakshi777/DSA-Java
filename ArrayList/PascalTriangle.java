// Given an integer "numRows",generate Pascal's triangle.

package ArrayList;
import java.util.*;


public class PascalTriangle {
    public List<List<Integer>> generate( int numRows) {
        List<List<Integer>> tri = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> l= new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if(j ==0 || j== i) {
                    l.add(1);
                } else {
                   int value = tri.get(i-1).get(j-1)+ tri.get(i-1).get(j);
                     l.add(value);
                }
            }
            tri.add(l);
        }
        return tri;
    }
    public static void main(String[] args) {
      
        PascalTriangle pt = new PascalTriangle(); 
        int numRows = 5;
        System.out.println(pt.generate(numRows));
        
    }
}
