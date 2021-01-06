package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class IsWhoIfElseIf {
    public static void main(String[] args) {

        String name;
        final String VA = "Вася";
        final String AN = "Анастасия";
        Scanner in = new Scanner(System.in);
        System.out.println("Как тебя зовут?");

        name = in.nextLine();
        if (Objects.equals(name, VA)) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        } else if (Objects.equals(name, AN)) {
            System.out.println("Я тебя так долго ждал");
        } else if (!Objects.equals(name, VA) && !(Objects.equals(name, AN))) {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
