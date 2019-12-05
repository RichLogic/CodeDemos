package algorithms.chapter1;

public class GcdDemo {

    public static int calc(int p, int q) {

        while (q != 0) {
            int r = p % q;
            p = q;
            q = r;
        }

        return p;
    }

}
