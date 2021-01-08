package home_work_1.taskcode.ru;

import java.util.Scanner;

public class BitsOrBytes {

    public static int convertNum(int a, String b) {
        int c = 0;
        switch (b) {
            case "b":
                c = a * 1024;
                break;
            case "k":
                c = a / 1024;
                break;
            default:
                System.out.println("Нужно ввести b или k");
                break;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner bkb = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = scan.nextInt();
        System.out.println("Введите направление перевода:");
        String str = bkb.nextLine();
        System.out.println(convertNum(num, str));
    }
}
