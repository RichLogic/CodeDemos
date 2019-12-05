package leetcode.easy;

public class Subject198 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(rob(nums));
    }

    private static int rob(int[] nums) {

        if (nums.length == 0)
            return 0;

        for (int i=1; i<nums.length; i++) {
            if (i == 1)
                nums[1] = Math.max(nums[0], nums[1]);
            if (i > 1)
                nums[i] = Math.max(nums[i-2] + nums[i], nums[i-1]);
        }

        return nums[nums.length - 1];
    }

}
