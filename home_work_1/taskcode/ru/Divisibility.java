package home_work_1.taskcode.ru;

import java.util.Scanner;

public class Divisibility {
    public static void div(int a, int b) {
        float f = (float) a / b;
        if (a % b == 0) {
            System.out.println(a + " делится на " + b);
        } else {
            System.out.println(a + " не делится на " + b);
            System.out.println("остаток: " + a % b);
        }
        System.out.println("частное: " + f);
    }

    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два числа:");
        a = scan.nextInt();
        b = scan.nextInt();
        div(a, b);
    }
}
