package home_work_1.taskcode.ru;

import java.util.Scanner;

public class IsLetter {
    public static void checkLetter(int a) {
        char n = (char) a;
        if (n >= 'A' && n <= 'Z' || n >= 'a' && n <= 'z') {
            System.out.println("Это буква " + n);
        } else {
            System.out.println("Это символ: " + n);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        checkLetter(scan.nextInt());
    }
}
