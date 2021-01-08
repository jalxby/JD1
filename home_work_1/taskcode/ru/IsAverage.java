package home_work_1.taskcode.ru;

public class IsAverage {

    public static int average(int a, int b, int c) {
        int aver = 0;
        if (a > b && a < c || a < b && a > c) {
            aver = a;
        } else if (b > a && b < c || b < a && b > c) {
            aver = b;
        } else {
            aver = c;
        }
        return aver;
    }


    public static void main(String[] args) {
        int a = IsOdd.randomNum();
        int b = IsOdd.randomNum();
        int c = IsOdd.randomNum();
        System.out.println(average(a, b, c));
    }
}


