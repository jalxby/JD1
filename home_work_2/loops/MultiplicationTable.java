package home_work_2.loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 2; i <= 6; i += 4) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j) + "\t" + (i + 1) + " x " + j + " = " + ((i + 1) * j) + "\t"
                        + (i + 2) + " x " + j + " = " + ((i + 2) * j) + "\t" + (i + 3) + " x " + j + " = " + ((i + 3) * j) + "\t");
            }
            System.out.println();
        }
    }
}