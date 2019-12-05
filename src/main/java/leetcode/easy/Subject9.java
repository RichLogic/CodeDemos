package leetcode.easy;

import java.util.Arrays;

public class Subject9 {

    public boolean isPalindrome(int x) {

        char[] num = (x + "").toCharArray();
        int start = 0;
        int end = num.length - 1;

        while (start < end)
            if (num[start++] != num[end--])
                return false;

        return true;
    }

}
