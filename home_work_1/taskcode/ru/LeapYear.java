package home_work_1.taskcode.ru;

import java.util.Scanner;

public class LeapYear {
    int year;

    public int getYear() {
        return year;
    }

    public void setYear() {
        Scanner scan = new Scanner(System.in);
        this.year = scan.nextInt();
        scan.close();
    }

    public boolean leapCheck() {
        boolean isyear;
        if (this.year % 4 != 0 || this.year % 100 == 0 && this.year % 400 != 0) {
            isyear = false;
        } else {
            isyear = true;
        }
        return isyear;
    }

    public static void printLeapOrNot(boolean b) {
        if (b) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

    public static void main(String[] args) {
        LeapYear y = new LeapYear();
        System.out.println("Введите год: ");
        y.setYear();
        System.out.println("Вы ввели " + y.getYear());
        printLeapOrNot(y.leapCheck());
    }
}
