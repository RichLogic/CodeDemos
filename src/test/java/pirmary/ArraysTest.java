package pirmary;

import org.junit.Assert;
import org.junit.Test;
import primary.Arrays;

public class ArraysTest {
    @Test
    public void removeDuplicatesTest() {
        int[] arrays = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int[] result = {0, 1, 2, 3, 4, 2, 2, 3, 3, 4};

        Assert.assertEquals(5, Arrays.removeDuplicates(arrays));
        Assert.assertArrayEquals(result, arrays);
    }

    @Test
    public void rotateTest() {
        int[] arrays = {1, 2, 3, 4, 5, 6, 7};
        int[] result = {5, 6, 7, 1, 2, 3, 4};
        Arrays.rotate(arrays, 3);

//        int[] arrays = {1,2};
//        int[] result = {2,1};
//        Arrays.rotate(arrays, 1);

        Assert.assertArrayEquals(result, arrays);
    }

    @Test
    public void singleNumberTest() {
        int[] arrays = {2, 2, 1};
        int result = 1;
        System.out.println(2 ^ 3);
        Assert.assertEquals(result, Arrays.singleNumber(arrays));
    }

    @Test
    public void plusOneTest() {
//        int[] arrays = {2,2,1};
//        int[] result = {2,2,2};

        int[] arrays = {9};
        int[] result = {1, 0};

//        int[] arrays = {2,2,9};
//        int[] result = {2,3,0};

        Assert.assertArrayEquals(result, Arrays.plusOne(arrays, arrays.length-1));
        Assert.assertArrayEquals(result, Arrays.plusOne_V1(arrays));
    }

    @Test
    public void twoSumTest() {
        int[] arrays = {2, 7, 11, 15};
        int target = 9;
        int[] result = {0, 1};

        Assert.assertArrayEquals(result, Arrays.twoSum(arrays, target));
    }

    @Test
    public void rotate_clockwiseTest() {
//        int[][] arrays = {
//                {5, 1, 9, 11},
//                {2, 4, 8, 10},
//                {13, 3, 6, 7},
//                {15, 14, 12, 16}
//        };
//
//        int[][] result = {
//                {15, 13, 2, 5},
//                {14, 3, 4, 1},
//                {12, 6, 8, 9},
//                {16, 7,10,11}
//        };

//        int[][] arrays = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16}
//        };
//
//        int[][] result = {
//                {13, 9, 5, 1},
//                {14, 10, 6, 2},
//                {15, 11, 7, 3},
//                {16, 12, 8, 4}
//        };

        int[][] arrays = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] result = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };

        Arrays.rotate_clockwise(arrays);

        Assert.assertArrayEquals(result, arrays);
    }

    @Test
    public void maxProfitTest() {
        int[] arrays = {7,1,5,3,6,4};
        int result = 7;
        Assert.assertEquals(result, Arrays.singleNumber(arrays));
    }

    @Test
    public void containsDuplicateTest() {
        int[] arrays1 = {1,2,3,1};
        int[] arrays2 = {1,2,3,4};
        Assert.assertTrue(Arrays.containsDuplicate(arrays1));
        Assert.assertFalse(Arrays.containsDuplicate(arrays2));
    }

    @Test
    public void moveZeroesTest() {
        int[] arrays = {0,1,0,3,12};
        int[] result = {1,3,12,0,0};
        Arrays.moveZeroes(arrays);
        Assert.assertArrayEquals(result, arrays);
    }

    @Test
    public void isValidSudokuTest() {
        char[][] arrays1 = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        char[][] arrays2 = {
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        Assert.assertTrue(Arrays.isValidSudoku(arrays1));
        Assert.assertFalse(Arrays.isValidSudoku(arrays2));
    }

    @Test
    public void safd() {
        String[] addrs = "1.1.1.1".split(".");

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<addrs.length; i++) {
            sb.append(addrs[i]);
            if (i != addrs.length - 1)
                sb.append("[.]");
        }

        System.out.println(sb.toString());
    }

}
