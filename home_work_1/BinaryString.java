package home_work_1;

public class BinaryString {
    public static String toBinaryString(byte number) {
        String str = " ";
        if (number >= 0) {
            str = String.format("%8s", Integer.toBinaryString(number)).replace(' ', '0');
        } else if (number < 0) {
            str = Integer.toBinaryString(number).substring(24, 32);
        }
        return str;
    }

    public static void main(String[] args) {
        byte s = -1;
        System.out.println(toBinaryString(s));

    }
}
