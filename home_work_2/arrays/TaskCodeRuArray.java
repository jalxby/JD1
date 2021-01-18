package home_work_2.arrays;

import home_work_1.taskcode.ru.JaUtils;

import java.util.Random;
import java.util.Scanner;

public class TaskCodeRuArray {

    public static int[] rndArray(int size, int maxValueExclusion) {
        Random rnd = new Random();
        int[] container = new int[size];
        for (int i = 0; i < container.length; i++) {
            container[i] = (rnd.nextInt(maxValueExclusion) - maxValueExclusion / 2) * 2; //получаем массив с отрицательными числами
        }
        return container;
    }

    public static int sumEven(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int maxEvenIndex(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void moreThanAverage(int[] arr) {
        float sum = 0, avrg;
        for (int data : arr) {
            sum += data;
        }
        avrg = sum / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avrg) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void twoMin(int[] arr) {
        int min1, min2, temp;
        if (arr[0] < arr[1]) {
            min1 = 0;
            min2 = 1;
        } else {
            min1 = 1;
            min2 = 0;
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < arr[min1]) {
                temp = min1;
                min1 = i;
                if (arr[temp] < arr[min2]) min2 = temp;
            } else {
                if (arr[i] < arr[min2]) {
                    min2 = i;
                }
            }
        }
        System.out.println(min1 + 1 + " : " + arr[min1]);
        System.out.println(min2 + 1 + " : " + arr[min2]);
    }

    public static int sumNumArray(int[] arr) {
        int sum = 0, num;
        for (int j : arr) {
            num = j;
            while (Math.abs(num) > 0) {
                sum += num % 10;
                num /= 10;
            }
        }
        return sum;
    }

    public static int[] squeezeArray(int[] arr, int min, int max) {
        int i = 0;
        int m = arr.length;
        JaUtils.printArray(arr);
        while (i < m) {
            if (arr[i] <= max && arr[i] >= min) {
                m -= 1;
                for (int j = i; j < m; j++)
                    arr[j] = arr[j + 1];
            } else
                i += 1;
        }
        for (i = m; i < arr.length; i++) {
            arr[i] = 0;
        }
        JaUtils.printArray(arr);
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int size = scanner.nextInt();
        System.out.println("До какого числа генерировать рандомные числа, будут так же сгенерированы отрицательные числа");
        int maxValueExclusion = scanner.nextInt();
        int[] container = rndArray(size, maxValueExclusion);
        JaUtils.printArray(container);
        System.out.println("сумма четных положительных элементов массива: " + sumEven(container));
        System.out.println("Максимальный из элементов с четными индексами: " + maxEvenIndex(container) + " : " + container[maxEvenIndex(container)]);
        System.out.println("Элементы массива, которые меньше среднего арифметического: ");
        moreThanAverage(container);
        System.out.println("\nдва наименьших элемента массива: ");
        twoMin(container);
        System.out.println("Сумма всех чисел массива: " + sumNumArray(container));
        JaUtils.arrayBorders(container);
        System.out.println("Задайте удаляемый диапазон: ");
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        squeezeArray(container, min, max);

    }
}
