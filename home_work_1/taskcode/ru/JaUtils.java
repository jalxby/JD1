package home_work_1.taskcode.ru;

import java.util.Random;
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
    public static void printArray(int [] arr){
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(" ]" + "\n");
    }

    public static int maxElementArray(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(max <= arr[i]){
                max = arr[i];

            }
        }
        return max;
    }

    public static int minElementArray(int[] arr){
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if(min >= arr[i]){
                min = arr[i];

            }
        }
        return min;
    }
    public static void arrayBorders(int [] arr){
        int minArr = JaUtils.minElementArray(arr);
        int maxArr = JaUtils.maxElementArray(arr);
        System.out.println("Границы массива: [" + minArr + ", " + maxArr+ "]");
    }

    public static int[] genArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int size = scanner.nextInt();
        System.out.println("До какого числа генерировать рандомные числа, будут так же сгенерированы отрицательные числа");
        int maxValueExclusion = scanner.nextInt();
        Random rnd = new Random();
        int[] container = new int[size];
        for (int i = 0; i < container.length; i++) {
            container[i] = (rnd.nextInt(maxValueExclusion) - maxValueExclusion / 2) * 2; //получаем массив с отрицательными числами
        }
        return container;

    }

}
