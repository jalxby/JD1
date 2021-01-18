package home_work_2.loops;

public class Recursion {
    public static long factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static void printF(int n, long result) {
        if (n >= 40) {
            System.out.println("Введите целое число от 1 до 39");

        } else {
            for (int i = 1; i < n; i++) {
                System.out.print(i + " * ");
            }
            System.out.println(n + " = " + result);
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long f = factorial(Integer.parseInt(args[0]));
        printF(n, f);

    }
}
