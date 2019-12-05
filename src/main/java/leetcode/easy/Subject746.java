package leetcode.easy;

// 动态规划
public class Subject746 {

    public static void main(String[] args) {
        int[] cost = {0,0,1,1};
        System.out.println(minCostClimbingStairs(cost));
    }

    public static int minCostClimbingStairs(int[] cost) {

        int x = 0;
        int y = 0;
        int N = 2;

        while (N++ <= cost.length) {
            int temp = y;
            y = Math.min(x + cost[N-3], y + cost[N-2]);
            x = temp;
        }

        return y;
    }

}
