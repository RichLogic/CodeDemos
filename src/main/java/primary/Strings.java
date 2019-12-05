package primary;

import java.util.HashMap;
import java.util.Map;

public class Strings {
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start ++;
            end --;
        }
    }

    public static int firstUniqChar(String s) {
        int n = s.length();
        char[] chars = s.toCharArray();

        for (int i=0; i<n; i++) {
            boolean flag = true;
            for (int j=0; j<n; j++) {
                if (j == i) {
                    continue;
                }
                if (chars[i] == chars[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }

        return -1;
    }

    public static boolean isPalindrome(String s) {
        if ("".equals(s)) {
            return true;
        }
        char[] chars = s.toCharArray();
        char[] opChars = new char[s.length()];
        int n = 0;
        for (char c : chars) {
            if ((c>=48 && c <=57) || (c>=65 && c<= 90) || (c>=97&&c<=122)) {
                opChars[n++] = c;
            }
        }

        int start = 0;
        int end = n - 1;
        while (start < end) {
            char sChar = opChars[start++];
            char eChar = opChars[end--];
            if (sChar >= 97) sChar -= 32;
            if (eChar >= 97) eChar -= 32;
            if (sChar != eChar) return false;
        }
        return true;
    }

    public static int strStr(String haystack, String needle) {

        if ("".equals(needle)) {
            return 0;
        }

        char[] target = haystack.toCharArray();
        char[] standard = needle.toCharArray();

        int t = target.length;
        int n = standard.length;

        if (t < n) {
            return -1;
        }

        for (int i=0; i<t; i++) {
            if (target[i] == standard[0]) {
                boolean flag = true;
                for (int k=1; k<n; k++) {
                    if (i+k >= t) {
                        flag = false;
                        break;
                    } else {
                        if (target[i+k] != standard[k]) {
                            flag = false;
                            break;
                        }
                    }
                }

                if (flag) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder buffer = new StringBuilder();

        int min = -1;
        for (String str : strs) {
            if (min < 0 || str.length() < min) {
                min = str.length();
            }
        }

        for (int i=0; i<min; i++) {
            char current = '\0';
            for (String str : strs) {
                if (current == '\0') {
                    current = (str.toCharArray())[i];
                } else {
                    if (current != (str.toCharArray())[i]) {
                        return buffer.toString();
                    }
                }
            }
            buffer.append(current);
        }

        return buffer.toString();
    }

    public static int reverse(long x) {
        if (x > Math.pow(2, 31) || x < -Math.pow(2, 31)) {
            return 0;
        }
        char[] a = String.valueOf(x).toCharArray();

        int start = 0;
        int end = a.length - 1;
        if (x < 0) {
            start = 1;
        }

        while (start < end) {
            char temp = a[start];
            a[start ++] = a[end];
            a[end --] = temp;
        }

        int result;
        try {
            result = Integer.parseInt(String.copyValueOf(a));
        } catch (Exception e){
            return 0;
        }

        return result;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] as = s.toCharArray();
        char[] ts = t.toCharArray();
        java.util.Arrays.sort(as);
        java.util.Arrays.sort(ts);
        return java.util.Arrays.equals(as, ts);
    }

    public static boolean isAnagram_V1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        Map<Character, Integer> smap = new HashMap<>();

        for (char c : sc) {
            if (smap.containsKey(c)) {
                smap.put(c, (smap.get(c) + 1));
            } else {
                smap.put(c, 1);
            }
        }

        for (char c : tc) {
            if (smap.containsKey(c) && smap.get(c) > 0) {
                smap.put(c, (smap.get(c) - 1));
            } else {
                return false;
            }
        }

        for (Integer i : smap.values()) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
