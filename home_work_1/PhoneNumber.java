package home_work_1;

public class PhoneNumber {

    public static String createPhoneNumber(int[] arr) {

        String number = "(" + arr[0] + arr[1] + arr[2] + ") " + arr[3] + arr[4] + arr[5]
                + "-" + arr[6] + arr[7] + arr[8] + arr[9];
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        String testStr = "(123) 456-7890";
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String strPrint = createPhoneNumber(arr);
        System.out.println(strPrint);
        System.out.println(strPrint.equals(testStr));
    }
}
