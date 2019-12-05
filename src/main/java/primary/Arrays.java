package primary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Arrays {

    public static int removeDuplicates(int[] nums) {
        int result = 0;
        if (nums == null) {
            return result;
        }

        for (int i=0; i<nums.length; i++) {
            boolean flag = true;

            int current = nums[i];
            for (int j=i+1; j<nums.length; j++) {
                if (current == nums[j]) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                continue;
            }
            nums[result] = current;
            result ++;
        }

        return result;
    }

    public static void rotate(int[] nums, int k) {
        if (k == 0) {
            return;
        }
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k , n-1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    // 递归
    public static int[] rotate_V2(int[] nums, int k) {
        if (nums == null) {
            return null;
        }
        k = k % nums.length;
        if (k == 0) {
            return nums;
        }

        move1Site(nums);
        return rotate_V2(nums, --k);
    }

    // 迭代
    public static void rotate_V1(int[] nums, int k) {
        if (k == 0) {
            return;
        }
        while (k > 0) {
            move1Site(nums);
            k --;
        }
    }

    public static void move1Site(int[] nums) {
        if (nums.length > 1) {
            int temp = nums[nums.length - 1];
            for (int i=nums.length-1; i>0; i--) {
                nums[i] = nums[i-1];
            }
            nums[0] = temp;
        }
    }

    // 解释：
    // 前提知识点：a^a = 0; 0^0 = 0;
    // 数组永远是奇数个，相当于 唯一的那个数 result ^ 0 ^ 0
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }

    public static int singleNumber_V1(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            boolean flag = true;
            int j = 0;
            while (j < nums.length) {
                if (j == i) {
                    j ++;
                    continue;
                }
                if (nums[i] == nums[j]) {
                    flag = false;
                    break;
                }
                j ++;
            }
            if (flag) {
                return nums[i];
            }
        }
        return nums[0];
    }

    public static int[] plusOne(int[] digits, int index) {
        int n = digits.length;

        if (index == 0 && digits[0] == 9) {
            int[] result = new int[n + 1];
            result[0] = 1;
            return result;
        }
        if (digits[index] < 9) {
            digits[index] += 1;
            return digits;
        } else {
            digits[index] = 0;
            return plusOne(digits, index-1);
        }
    }

    public static int[] plusOne_V1(int[] digits) {
        int n = digits.length;

        for (int index = n - 1; index>=0; index--) {
            digits[index] = digits[index] + 1;
            if (index == 0 && digits[0] == 10) {
                int[] result = new int[n + 1];
                result[0] = 1;
                return result;
            }
            if (digits[index] == 10) {
                digits[index] = 0;
            } else {
                return digits;
            }
        }

        return digits;
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i=0; i<nums.length; i++) {
            int rest = target - nums[i];
            if (map.containsKey(rest) && map.get(rest) != i) {
                return new int[] {i, map.get(rest)};
            }
        }
        throw new IllegalArgumentException("No two same solution");
    }

    public static int[] twoSum_V1(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two same solution");
    }

    public static void rotate_clockwise(int[][] matrix) {
        int circle = matrix.length / 2;
        int n = matrix.length-1;

        for (int c=0; c<circle; c++) {
            for (int i=c; i<n-c; i++) {
                int x = c;
                int y = i;
                int temp = matrix[x][y];
                for (int j=0; j<=3; j++) {
                    int oldx = x;
                    int oldy = y;
                    int param = x;
                    x = n - y;
                    y = param;

                    if (j == 3) {
                        matrix[oldx][oldy] = temp;
                    } else {
                        matrix[oldx][oldy] = matrix[x][y];
                    }
                }
            }
        }
    }

    public static int maxProfit(int[] prices) {
        return 0;
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() < nums.length;
    }

    public static boolean containsDuplicate_V1(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            int j = 0;
            while (j < nums.length) {
                if (j != i && nums[i] == nums[j]){
                    return true;
                }
                j ++;
            }
        }
        return false;
    }

    public static void moveZeroes(int[] nums) {
        int length = nums.length;
        int len = 0;
        for (int i=0; i<length; i++) {
            if (nums[i] != 0) {
                nums[len ++] = nums[i];
            }
        }
        while (len < length) {
            nums[len++] = 0;
        }
    }

    public static boolean isValidSudoku(char[][] board) {
        // 横行
        for (char[] target : board) {
            if (!checkNotRepeation(target, 9)) {
                return false;
            }
        }

        // 竖行
        for (int i=0; i<9; i++) {
            char[] target = new char[9];
            for (int j=0; j<9; j++) {
                target[j] = board[j][i];
            }
            if (!checkNotRepeation(target, 9)) {
                return false;
            }
        }

        // 九宫格
        for (int row=0; row<3; row++) {
            for (int column=0; column<3; column++) {
                char[] target = new char[9];
                for (int i=0; i<3; i++) {
                    for (int j=0; j<3; j++) {
                        target[j + i*3] = board[j + column*3][i + row*3];
                    }
                }
                if (!checkNotRepeation(target, 9)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean checkNotRepeation(char[] arrays, int length) {
        for (int i=0; i<length; i++) {
            if (arrays[i] != '.') {
                for (int j=i+1; j<length; j++) {
                    if (arrays[i] == arrays[j]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
