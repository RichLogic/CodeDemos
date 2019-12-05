package hangzhouACM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lineNum = sc.nextInt();

        while (lineNum-- > 0) {

            int num = sc.nextInt();

            int sum = 0;
            while (num-- > 0)
                sum += sc.nextInt();
            System.out.println(sum);

            if (lineNum > 0)
                System.out.println();
        }
    }
}