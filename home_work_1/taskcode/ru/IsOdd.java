package home_work_1.taskcode.ru;

import java.util.Random;

public class IsOdd {
    public static int randomNum() {
        Random random = new Random();
        int i = random.nextInt();
        return i;
    }

    public static int findOdd(int a, int b) {
        int c = 0;
        if (a % 2 + b % 2 == 0 || a % 2 + b % 2 == 2) {
            a = a + 1;
        }
        if (a % 2 == 0) {
            c = a;
        } else {
            c = b;
        }
        return c;
    }

    public static void main(String[] args) {
        int a = randomNum();
        int b = randomNum();
        System.out.println(findOdd(a, b));
    }
}
