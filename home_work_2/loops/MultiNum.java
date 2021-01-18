package home_work_2.loops;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultiNum {

    public static void checkNum(String str) {
        String pattern = "[a-z,A-Z,А-Я,а-я]";
        Pattern ptrn = Pattern.compile(pattern);
        Matcher matcher = ptrn.matcher(str);
        if (matcher.find()) {
            System.out.println("Введено не число");
            System.exit(15);
        } else if (str.contains(".")) {
            System.out.println("Введено не целое число");
            System.exit(16);
        }
    }

    public static long[] getArray(int length, Long argum) {
        long[] multi = new long[length];

        for (int i = 0; i < length; i++) {
            multi[i] = argum % 10;
            argum /= 10;
            if (multi[i] == 0) {
                multi[i] = 1;
            }
        }
        return multi;
    }

    public static long multiplay(long[] array) {
        long result = 1;
        for (long l : array) {
            result = result * l;
        }
        return result;
    }

    public static void printreverse(long[] array, long multiplay) {
        for (int i = array.length - 1; i > 0; i--) {
            System.out.print(array[i] + " * ");
        }
        System.out.print(array[0] + " = " + multiplay);
    }

    public static void main(String[] args) {
        checkNum(args[0]);
        int l = args[0].length();
        long num = Long.parseLong(args[0]);
        long[] array = getArray(l, num);
        long result = multiplay(array);
        printreverse(array, result);


    }


}

