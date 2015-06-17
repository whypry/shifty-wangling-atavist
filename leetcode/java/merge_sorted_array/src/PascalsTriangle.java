import java.util.ArrayList;
import java.util.List;

/**
 * Created by simonzhang on 6/16/15.
 *
 * Solution:
 *
 *
 *
 */
public class PascalsTriangle {
    public static void main(String args[]) {
        PascalsTriangle pt = new PascalsTriangle();
        pt.generate(Integer.parseInt(args[0]));
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascals = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return pascals;
        }
        List<Integer> lastRow = new ArrayList<Integer>();
        for (int n = 0; n < numRows; n++) {
            int chooseVal = 1;
            List<Integer> row = new ArrayList<Integer>();
            for (int k = 0; k <= n; k++) {
                row.add(chooseVal);
                chooseVal = chooseVal * (n - k) / (k + 1);
            }
            pascals.add(row);
        }
        return pascals;
    }
}

// O(n^2) solution
//public class Solution {
//    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> pascals = new ArrayList<List<Integer>>();
//        if (numRows == 0) {
//            return pascals;
//        }
//        List<Integer> lastRow = new ArrayList<Integer>();
//        lastRow.add(1);
//        pascals.add(lastRow);
//        for(int r = 2; r < numRows; r++) {
//            List<Integer> row = new ArrayList<Integer>();
//            row.add(1);
//            for (int i = 1; i <= r - 2; i++){
//                row.add(lastRow.get(i - 1) + lastRow.get(i));
//            }
//            row.add(1);
//            lastRow = row;
//            pascals.add(lastRow);
//        }
//        return pascals;
//    }
//}