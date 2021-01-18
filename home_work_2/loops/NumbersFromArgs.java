package home_work_2.loops;

public class NumbersFromArgs {

    public static void main(String[] args) {
        long multiplication = 1;
        Integer[] arr = new Integer[Integer.parseInt(args[0])];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            multiplication *= arr[i];
        }

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " * ");
        }
        System.out.println(arr[arr.length - 1] + " = " + multiplication);
    }
}


