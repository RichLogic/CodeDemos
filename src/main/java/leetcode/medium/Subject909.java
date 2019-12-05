package leetcode.medium;

public class Subject909 {

    public int[][] board;

    public int length;

    public int[] mem;

    public int snakesAndLadders(int[][] board) {
        this.board = board;
        this.length = board[0].length;
        mem = new int[length * length];
//        return memory(1);

        int n = length * length;
        mem[--n] = 0;
        while (n > 0) {
            int min = Integer.MAX_VALUE;
            for (int i=1; i<=6; i++) {
                if (n + i <= 36) {
                    int dest = board[this.getFirst(n+i-1)][this.getSecond(n+i-1)];
                    if (dest > 0)
                        min = Math.min(min, mem[dest - 1]);
                    else
                        min = Math.min(min, mem[n + i - 1]);
                }
            }
            mem[--n] = min + 1;
        }

        return mem[0];
    }

    int memory(int n) {

        if (n == 36)
            return 0;

        if (mem[n-1] != 0)
            return mem[n-1];

        int min = Integer.MAX_VALUE;
        for (int i=1; i<=6; i++) {
            if (n + i <= 36) {
                int dest = board[this.getFirst(n+i)][this.getSecond(n+i)];
                if (dest > 0)
                    min = Math.min(min, memory(dest));
                else
                    min = Math.min(min, memory(n+i));
            }
        }

        mem[n-1] = min + 1;
        return min + 1;
    }

    int getFirst(int n) {
        return length - 1 - (n-1) / length;
    }

    int getSecond(int n) {
        if ((n -1) / length % 2 == 1)
            return (n-1) % length;
        else
            return length - 1 - (n-1) % length;
    }
}