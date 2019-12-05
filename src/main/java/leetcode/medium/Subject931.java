package leetcode.medium;

public class Subject931 {

    // 动态规划：这个答案是抄的
    public int minFallingPathSum(int[][] A) {

        int length = A.length;

        for (int i=length - 2; i>=0; i--) {
            for (int j=0; j<length; j++) {
                int min = A[i+1][j];
                if (j > 0)
                    min = Math.min(min, A[i+1][j-1]);
                if (j < A[0].length-1)
                    min = Math.min(min, A[i+1][j+1]);

                A[i][j] += min;
            }
        }

        int result = Integer.MAX_VALUE;
        for (int a : A[0])
            result = Math.min(a, result);

        return result;
    }

}