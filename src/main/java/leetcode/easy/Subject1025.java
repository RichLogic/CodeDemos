package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Subject1025 {

    public static void main(String[] args) {
        System.out.println(divisorGame(10));
    }

    // 过于简单的方法
    public boolean divisorGame2(int N) {
        return N % 2 == 0;
    }

    public static Boolean[] memory = null;

    // 正常思路 : 动态规划
    public static boolean divisorGame1(int N) {

        memory = new Boolean[N];
        memory[0] = false;

        for (int i=2; i<=N; i++) {
            boolean flag = false;
            for (Integer x : divisorNum(i))
                flag |= !memory[i-x-1];
            memory[i-1] = flag;
        }

        return memory[N-1];
    }

    // 正常思路 : 记忆化搜索
    public static boolean divisorGame(int N) {

        if (N == 1)
            return false;

        if (memory == null)
            memory = new Boolean[N];

        if (memory[N-1] != null)
            return memory[N-1];

        boolean flag = false;
        for (Integer x : divisorNum(N))
            flag |= !divisorGame(N - x);
        memory[N-1] = flag;

        return flag;
    }

    private static List<Integer> divisorNum(int n) {

        List<Integer> numList = new ArrayList<>();
        numList.add(1);

        double length = Math.sqrt(n);

        for (int i = 2; i <= length; i++)
            if (n % i == 0) {
                numList.add(i);
                int j = n / i;
                if (j != i)
                    numList.add(j);
            }

        return numList;
    }

}
