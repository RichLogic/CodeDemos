package leetcode.easy;

public class Subject392 {


    public boolean isSubsequence(String s, String t) {

        if (s.length() == 0)
            return true;

        int index = 0;
        for (char c : t.toCharArray()) {

            if (c == s.charAt(index)) {
                index ++;
                if (index == s.length())
                    return true;
            }

        }

        return false;
    }

}
