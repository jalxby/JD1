package home_work_5.utils;

import java.util.Comparator;
import java.util.List;

public class SortUtils {
    public static <T> void bubbleSort(List<T> container, Comparator<T> comparator) {
        int lengthContainer = container.size();
        for (int j = 1; j < lengthContainer - 1; j++) {
            boolean flagEnd = true;
            for (int i = 0; i < lengthContainer - j; i++) {
                T left = container.get(i);
                T right = container.get(i + 1);
                int compare = comparator.compare(left, right);
                if (compare > 0) {
                    container.set(i, right);
                    container.set(i + 1, left);
                    flagEnd = false;
                }
            }
            if (flagEnd) {
                break;
            }

        }
    }

    public static void shakerSort(int[] container) {

        for (int leftDirection = 0, rightDirection = container.length - 1;
             leftDirection < rightDirection; leftDirection++, rightDirection--) {

            int buffer;
            for (int i = leftDirection; i < rightDirection; i++) {
                if (container[i] > container[i + 1]) {
                    buffer = container[i];
                    container[i] = container[i + 1];
                    container[i + 1] = buffer;
                }
            }
            for (int i = rightDirection; i > leftDirection; i--) {
                if (container[i] < container[i - 1]) {
                    buffer = container[i];
                    container[i] = container[i - 1];
                    container[i - 1] = buffer;
                }
            }
        }
    }
}
