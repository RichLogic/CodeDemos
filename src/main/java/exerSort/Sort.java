package exerSort;

// 由小往大排序
public class Sort {

    // 冒泡排序
    public static void bubbleSort(int[] array) {
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array.length-1-i; j++) {
                if (array[j] > array[j+1]) {
                    swap(array, j, j+1);
                }
            }
        }
    }
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // 插入排序：只有一次赋值操作，比冒泡推荐使用
    public static void insertSort(int[] array) {
        for (int i=1; i<array.length; i++) {
            int value = array[i];
            int j=i-1;
            for (; j>=0; j--) {
                if (array[j] > value) {
                    array[j+1] = array[j];
                } else {
                    break;
                }
            }
            array[j+1] = value;
        }
    }

    // 选择排序：不是稳定的排序算法，不推荐使用
    public static void selectSort(int[] array) {
        int n = array.length;
        if (n <= 1) return;
        for(int i=0; i<n-1; i++) {
            int value = array[i];
            int index = i;
            for(int j=i+1; j<n; j++) {
                if(array[j] < value) {
                    value = array[j];
                    index = j;
                }
            }
            if (index > i) swap(array, i, index);
        }
    }



    public static void mergeSort(int[] array) {
        mergeRecursion(array, 0, array.length-1);
    }

    private static void mergeRecursion(int[] array, int p, int r) {

        // 退出条件
        if (p >= r) return;

        int q = p + (r - p)/2;
        mergeRecursion(array, p, q);
        mergeRecursion(array, q+1, r);

        // 合并两个数组
        merge(array, p, q, r);
    }

    private static void merge(int[] array, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int k = 0;
        int[] temp = new int[r - p + 1];

        while (i <= q && j <= r) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        int start = i;
        int end = q;
        if (j <= r) {
            start = j;
            end = r;
        }

        while (start <= end) {
            temp[k++] = array[start++];
        }

        for (int x=0; x<r-p+1; x++) {
            array[x+p] = temp[x];
        }

    }

    public static void quickSort(int[] array) {
        quickRecursion(array, 0, array.length-1);
    }

    private static void quickRecursion(int[] array, int p, int r) {

        // 退出条件
        if (p >= r) return;

        int q = partition(array, p, r);
        quickRecursion(array, p, q-1);
        quickRecursion(array, q+1, r);

    }

    private static int partition(int[] array, int p, int r) {
        int pivot = array[r];
        int i = p;

        for (int j=p; j<r; j++) {
            if (array[j] < pivot) {
                if (i == j) {
                    i ++;
                } else {
                    int temp = array[i];
                    array[i++] = array[j];
                    array[j] = temp;
                }
            }
        }

        array[r] = array[i];
        array[i] = pivot;

        return i;
    }

}
