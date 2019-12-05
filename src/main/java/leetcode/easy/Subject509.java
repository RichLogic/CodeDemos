package leetcode.easy;

public class Subject509 {
    public int fib(int N) {

        if (N == 0)
            return 0;
        if (N == 1)
            return 1;
        if (N == 2)
            return 1;

        return fib(N - 1) + fib(N - 2);
    }

    public int fib2(int N) {

        if (N == 0)
            return 0;

        int x = 0;
        int y = 1;
        int i = 0;
        while (i < N) {
            int temp = x + y;
            x = y;
            y = temp;
            i ++;
        }

        return y;
    }
}
