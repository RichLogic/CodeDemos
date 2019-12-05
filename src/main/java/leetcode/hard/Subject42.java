package leetcode.hard;


public class Subject42 {

    public static void main(String[] args) {
        int[] array = {4,2,3};
        System.out.println(trap(array));
    }

    private static int[] arr;

    private static int trap(int[] height) {

        arr = height;

        int start = 0;
        int end = height.length - 1;
        int sum = 0;

        int max = maxIndex(start, end);
        int leftMax = max;
        int rightMax = max;

        while (leftMax >= start) {
            int left = maxIndex(start, leftMax-1);
            sum += calc(left, leftMax);
            leftMax = left;
        }

        while (rightMax <= end) {
            int right = rightMaxIndex(rightMax+1, end);
            sum += rightCalc(rightMax, right);
            rightMax = right;
        }

        return sum;
    }

    private static int calc(int low, int high) {

        if (low < 0)
            return 0;

        int sum = 0;
        int lowValue = arr[low];
        while (++low < high)
            sum += lowValue - arr[low];

        return sum;
    }

    private static int rightCalc(int low, int high) {

        if (high > arr.length-1)
            return 0;

        int sum = 0;
        int lowValue = arr[high];
        while (++low < high)
            sum += lowValue - arr[low];

        return sum;
    }

    private static int maxIndex(int start, int end) {

        if (start >= end)
            return -1;

        int max = start;
        while (start++ < end) {
            if (arr[start] > arr[max])
                max = start;
        }

        return max;
    }

    private static int rightMaxIndex(int start, int end) {

        if (start >= end)
            return end + 1;

        int max = start;
        while (start++ < end) {
            if (arr[start] > arr[max])
                max = start;
        }

        return max;
    }

}
