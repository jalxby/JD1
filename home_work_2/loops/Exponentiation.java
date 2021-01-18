package home_work_2.loops;

import java.util.Locale;
import java.util.Scanner;


public class Exponentiation {
    public static float numToPower(float exp, int power) {
        if (power == 1) {
            return exp;
        } else {
            return exp * numToPower(exp, power - 1);
        }
    }

    public static void printExp(float exp, int power, float result) {
        System.out.println(exp + " ^ " + power + " = " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Введите число:");
        float exp = scanner.nextFloat();
        System.out.println("Введите степень числа:");
        int power = scanner.nextInt();
        printExp(exp, power, numToPower(exp, power));
    }
}
