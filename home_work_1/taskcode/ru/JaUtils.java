package home_work_1.taskcode.ru;

import java.util.Scanner;

public class JaUtils {

    public static int scanNum() {
        Scanner scan = new Scanner(System.in);
        //scan.close();
        return scan.nextInt();
    }

    public static int scanNums() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        //scan.close();
        return scan.nextInt();
    }
}
