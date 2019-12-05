package exerSort;

import org.junit.Assert;
import org.junit.Test;

public class SortTest {
    @Test
    public void test() {
        int[] source = {4, 5, 6, 3, 2, 1};
        int[] dest = {1, 2, 3, 4, 5, 6};

//        Heap heap = new Heap(10);
//        heap.add(1);
//        heap.add(2);
//        heap.add(3);
//        heap.add(4);
//        heap.add(5);

//        Sort.bubbleSort(source);
//        Sort.insertSort(source);
        Sort.selectSort(source);
//        Sort.mergeSort(source);
//        Sort.quickSort(source);

//        heap.sort();

        Assert.assertArrayEquals(dest, source);
    }
}
