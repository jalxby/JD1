package home_work_2.sorts;

import home_work_1.taskcode.ru.JaUtils;

public class Sorter {
    public static void main(String[] args) {
        int [] container2 = {1,2,3,4,5,6};
        JaUtils.printArray(Sorts.bubbleSort(container2));
        JaUtils.printArray(Sorts.shakerSort(container2));
        int [] container3 = {1,1,1,1};
        JaUtils.printArray(Sorts.bubbleSort(container3));
        JaUtils.printArray(Sorts.shakerSort(container3));
        int [] container4 = {9,1,5,99,9,9};
        JaUtils.printArray(Sorts.bubbleSort(container4));
        JaUtils.printArray(Sorts.shakerSort(container4));
        int [] container5 = {};
        JaUtils.printArray(Sorts.bubbleSort(container5));
        JaUtils.printArray(Sorts.shakerSort(container5));

        int[] container = JaUtils.genArray();
        System.out.println("Исходный массив:");
        JaUtils.printArray(container);
        System.out.println("Отсортированный массив:");
        JaUtils.printArray(Sorts.bubbleSort(container));
        JaUtils.printArray(Sorts.shakerSort(container));
    }
}
