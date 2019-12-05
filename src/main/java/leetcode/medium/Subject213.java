package leetcode.medium;

public class Subject213 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(rob(nums));
    }

    private static int rob(int[] nums) {

        int length = nums.length;
        if (length == 0)
            return 0;
        if (length == 1)
            return nums[0];

        int[] nums2 = new int[length - 1];
        System.arraycopy(nums, 1, nums2, 0, length - 1);

        for (int i=1; i<length-1; i++) {
            if (i == 1) {
                nums[1] = Math.max(nums[0], nums[1]);
                nums2[1] = Math.max(nums2[0], nums2[1]);
            }
            if (i > 1) {
                nums[i] = Math.max(nums[i - 2] + nums[i], nums[i - 1]);
                nums2[i] = Math.max(nums2[i - 2] + nums2[i], nums2[i - 1]);
            }
        }

        return Math.max(nums[length-2], nums2[length-2]);
    }

}
