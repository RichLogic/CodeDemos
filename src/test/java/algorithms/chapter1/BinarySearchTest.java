package algorithms.chapter1;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void bsTest() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        Assert.assertEquals(BinarySearch.rank(3, array), 2);
        Assert.assertEquals(BinarySearch.rank(9, array), -1);
        Assert.assertEquals(BinarySearch.rank(4, array), 3);
        Assert.assertEquals(BinarySearch.rank(1, array), 0);


    }
}
