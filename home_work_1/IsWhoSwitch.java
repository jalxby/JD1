package home_work_1;
import java.util.Scanner;

public class IsWhoSwitch {
    public static void main(String[] args) {
        String name;
        final String VA = "Вася";
        final String AN = "Анастасия";
        Scanner in = new Scanner(System.in);
        System.out.println("Как тебя зовут?");

        name = in.nextLine();
        switch (name) {
            case VA:
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал");
                break;
            case AN:
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}
