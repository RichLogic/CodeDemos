package exerSort;

public class Heap {
    private int[] array;
    private int capacity;
    private int size;

    public Heap(int capacity) {
        this.array = new int[capacity + 1];
        this.capacity = capacity;
        size = 0;
    }

    public void add(int data) {
        if (size >= capacity) return;
        array[++size] = data;

        int i = size;
        while (i/2 > 0 && array[i] > array[i/2]) {
            swap(array, i, i/2);
//            int temp = array[i];
//            array[i] = array[i/2];
//            array[i/2] = temp;

            i = i/2;
        }
    }

    public void remove(int target) {
        if (size == 0) return;

        int position = 1;
        for (int i=1; i<=size; i++) {
            if (array[i] == target) {
                position = i;
                break;
            }
        }
        // 将最后一位填补到要删除的位置，并且总数量 -1
        array[position] = array[size--];

        heapify(array, size, position);
    }



    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void sort() {
//        bulidHeap(array, size);
        int k = size;
        while (k > 1) {
            swap(array, 1, k--);
            heapify(array, k, 1);
        }
    }

    private void bulidHeap(int[] array, int size) {
        for (int i=size/2; i>=1; i--) {
            heapify(array, size, i);
        }
    }

    private void heapify(int[] array, int size, int position) {
        while (true) {
            int maxPos = position;
            // 子节点比当前节点大就交换
            if (position*2 <= size && array[position] < array[position*2]) {
                maxPos = position * 2;
            }

            // 如果右子节点比左节点大就和右子节点换
            if (position*2+1 <= size && array[position*2+1] > array[maxPos]) {
                maxPos = position * 2 + 1;
            }

            if (maxPos == position) break;

            // 交换
            swap(array, position, maxPos);
            position = maxPos;
        }
    }

}
