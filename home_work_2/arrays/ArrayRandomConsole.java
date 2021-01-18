package home_work_2.arrays;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandomConsole {
    public static int[] arrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int size = scanner.nextInt();
        System.out.println("Введите элементы массива разметности " + size + " через запятую");
        String[] numbers = scannerString.nextLine().split(",");
        int[] array = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }
        return array;
    }

    public static void doWhileCycle(int[] array) {
        int i = 0;
        System.out.println("Перебор через do while");
        do {
            System.out.print(array[i] + " ");
            i++;
        } while (i < array.length);
        System.out.println();

        i = 1;
        System.out.println("вывод каждого второго через do while");
        do {
            System.out.print(array[i] + " ");
            i += 2;
        } while (i < array.length);
        System.out.println();

        i = array.length - 1;
        System.out.println("Перебор через do while в обратном порядке");
        do {
            System.out.print(array[i] + " ");
            i--;
        } while (i >= 0);
    }

    public static void whileCycle(int[] array) {
        int i = 0;
        System.out.println();
        System.out.println("Перебор через while");
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }

        System.out.println();
        System.out.println("вывод каждого второго через while");
        i = 1;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i += 2;
        }

        System.out.println();
        System.out.println("Перебор через while в обратном порядке");
        i = array.length - 1;
        while (i >= 0) {
            System.out.print(array[i] + " ");
            i--;
        }
    }

    public static void forCycle(int[] array) {

        System.out.println();
        System.out.println("Перебор через for");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("вывод каждого второго через for");
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Перебор через for в обратном порядке");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }

    public static void foreachCycle(int[] array) {

        System.out.println();
        System.out.println("Перебор через foreach");
        for (int j : array) {
            System.out.print(j + " ");
        }

        System.out.println();
        System.out.println("вывод каждого второго через foreach");
        int newlength = 0;
        if (array.length % 2 == 0) {
            newlength = (array.length / 2);
        } else {
            newlength = (array.length - 1) / 2;
        }

        int[] everysecondarray = new int[newlength];
        for (int i = 0, j = 1; i < everysecondarray.length; i++, j += 2) {

            everysecondarray[i] = array[j];

        }
        for (int j : everysecondarray) {
            System.out.print(j + " ");
        }


        System.out.println();
        System.out.println("Перебор через foreach в обратном порядке");
        int[] reversearray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversearray[i] = array[array.length - i - 1];
        }
        for (int j : reversearray) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] arrRnd = new int[size];
        Random rnd = new Random();

        for (int data : arrRnd) {
            arrRnd[data] = rnd.nextInt(maxValueExclusion);
        }
        return arrRnd;
    }

    public static void main(String[] args) {
        int[] container = arrayFromConsole();
        doWhileCycle(container);
        whileCycle(container);
        forCycle(container);
        foreachCycle(container);

        Scanner rndScan = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int size = rndScan.nextInt();
        System.out.println("До какого числа генерировать рандомные числа");
        int maxValueExclusion = rndScan.nextInt();
        int[] container2 = arrayRandom(size, maxValueExclusion);
    }

}
