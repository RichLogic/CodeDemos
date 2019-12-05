package leetcode.easy;

public class Subject53 {

    public int maxSubArray(int[] nums) {

        int result = 0;
        int sum = 0;

        for (int num : nums) {
            if (sum > 0)
                sum += num;
            else
                sum = num;

            result = Math.max(result, sum);
        }

        return result;
    }

}
