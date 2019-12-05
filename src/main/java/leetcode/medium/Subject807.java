package leetcode.medium;

public class Subject807 {
    class Solution {
        public int maxIncreaseKeepingSkyline(int[][] grid) {
            int rlength = grid[0].length;
            int clength = grid.length;
            int[] row = new int[rlength];
            int[] column = new int[clength];

            for (int i=0; i<rlength; i++) {
                for(int j=0; j<clength; j++) {
                    int temp = grid[i][j];
                    if (row[i] < temp)
                        row[i] = temp;
                    if (column[j] < temp)
                        column[j] = temp;
                }
            }

            int sum = 0;
            for (int i=0; i<rlength; i++) {
                for(int j=0; j<clength; j++) {
                    sum += Math.min(row[i], column[j]) - grid[i][j];
                }
            }

            return sum;
        }
    }
}
