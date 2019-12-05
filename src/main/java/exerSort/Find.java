package exerSort;

public class Find {
    // 二分查找
    public static int binaryFind(int[] array, int target) {
         int min = 0;
         int max = array.length - 1;
         while (min <= max) {
             int mid = min + (max - min)/2;
             if (target == array[mid]) {
                 return mid;
             } else if (target < array[mid]) {
                 max = mid - 1;
             } else {
                 min = mid + 1;
             }
         }
         return -1;
    }

    // 用递归的二分查找
    public static int binaryFind2(int[] array, int target) {
        return binaryFindRecursion(array, 0, array.length - 1, target);
    }

    private static int binaryFindRecursion(int[] array, int min, int max, int target) {
        if (min > max) return -1;

        int mid = min + (max - min)/2;
        if (target == array[mid]) {
            return mid;
        } else if (target < array[mid]) {
            return binaryFindRecursion(array, min, mid - 1, target);
        } else {
            return binaryFindRecursion(array, mid + 1, max, target);
        }
    }
}
