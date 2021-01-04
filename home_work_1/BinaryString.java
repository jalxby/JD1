package home_work_1;

public class BinaryString {
    public static String toBinaryString(byte number){
        String str = Integer.toBinaryString(number);
    return str;
    }
    private static String toBin(int i) {
        StringBuilder sb = new StringBuilder();
        while (i > 0) {
            sb.insert(0, i & 1);
            i >>= 1;
        }
        if (sb.length() == 0) sb.append("0");
        return sb.toString();
    }

    public static void main(String[] args) {
        //System.out.println(toBinaryString((byte)42));
        System.out.println(toBin((byte)-42));
    }
}
