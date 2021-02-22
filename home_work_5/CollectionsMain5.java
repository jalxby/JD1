package home_work_5;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CollectionsMain5 {
    public static void main(String[] args) throws IOException {
        Map<String, String> data = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Введите номер");
            String number = scanner.nextLine();
            System.out.println("Введите текст");
            String text = scanner.nextLine();
            data.put(number, text);
        }

        System.out.println("Введите номер:");
        String name = scanner.next();

        System.out.println("Вы ввели: " + name);

        System.out.println(data.containsKey(name));
        System.out.println(data.get(name));


    }
}
