package pirmary;

import org.junit.Assert;
import org.junit.Test;
import primary.Strings;

import java.util.Arrays;
import java.util.List;

public class StringsTest {
    @Test
    public void reverseStringTest() {
        char[] arrays = {'h', 'e', 'l', 'l', 'o'};
        char[] result = {'o', 'l', 'l', 'e', 'h'};
        Strings.reverseString(arrays);
        Assert.assertArrayEquals(result, arrays);
    }

    @Test
    public void firstUniqCharTest() {
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "cc";

        Assert.assertEquals(0, Strings.firstUniqChar(s1));
        Assert.assertEquals(2, Strings.firstUniqChar(s2));
        Assert.assertEquals(-1, Strings.firstUniqChar(s3));
    }

    @Test
    public void isPalindromeTest() {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";

        Assert.assertTrue(Strings.isPalindrome(s1));
        Assert.assertFalse(Strings.isPalindrome(s2));
    }

    @Test
    public void strStrTest() {
        String s1 = "hello";
//        String s2 = "race a car";

        Assert.assertEquals(-1, Strings.strStr("mississippi", "issipi"));
        Assert.assertEquals(-1, "a".indexOf("a"));
//        Assert.assertFalse(Strings.isPalindrome(s2));
    }

    @Test
    public void longestCommonPrefixTest() {
        String[] s1 = {"flower","flow","flight"};
        String[] s2 = {"","b"};
        String[] s3 = {"b"};

//        Assert.assertEquals("fl", Strings.longestCommonPrefix(s1));
//        Assert.assertEquals("", Strings.longestCommonPrefix(s2));
        Assert.assertEquals("b", Strings.longestCommonPrefix(s3));
    }

    @Test
    public void reverseTest() {
        int s1 = 123;
        int s2 = -123;
        int s3 = 120;
        long s4 = 9646324351L;

        Assert.assertEquals(321, Strings.reverse(s1));
        Assert.assertEquals(-321, Strings.reverse(s2));
        Assert.assertEquals(21, Strings.reverse(s3));
        Assert.assertEquals(0, Strings.reverse(s4));

        System.out.println(Math.pow(2, 31));
    }

    @Test
    public void isAnagramTest() {

        Assert.assertTrue(Strings.isAnagram("anagram", "nagaram"));

    }
}
