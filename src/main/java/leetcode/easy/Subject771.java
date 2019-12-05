package leetcode.easy;

public class Subject771 {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (char s : S.toCharArray()) {
            for (char j : J.toCharArray()) {
                if (j == s) {
                    count ++;
                    break;
                }
            }
        }
        return count;
    }
}
