package home_work_2.sorts;

import home_work_1.taskcode.ru.JaUtils;

public class Sorts {
    public static int[] bubbleSort(int[] arr) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    sorted = false;

                }
            }
        }
        return arr;
    }

    public static int[] shakerSort(int[] arr) {
            int temp;
            int left = 0;
            int right = arr.length - 1;
            do {
                for (int i = left; i < right; i++) {
                    if (arr[i] > arr[i + 1]) {
                       temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
                right--;
                for (int i = right; i > left; i--) {
                    if (arr[i] < arr[i - 1]) {
                        temp = arr[i];
                        arr[i] = arr[i - 1];
                        arr[i - 1] = temp;
                    }
                }
                left++;
            } while (left < right);
            return arr;
        }
    }

