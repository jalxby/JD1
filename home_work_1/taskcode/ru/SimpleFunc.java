package home_work_1.taskcode.ru;

public class SimpleFunc {
    public static int yfx(int x) {
        int y;
        if (x > 0) {
            y = 2 * x - 10;
        } else if (x == 0) {
            y = 0;
        } else {
            y = 2 * Math.abs(x) - 1;
        }
        return y;
    }

    public static void main(String[] args) {
        int x = JaUtils.scanNums();
        System.out.println("x = " + x + "\n" + "y = " + yfx(x));
    }
}
