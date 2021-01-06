package home_work_1;

public class Sleepy {

    public static boolean sleepIn(boolean weekday, boolean vacation) {

        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        boolean sleep = sleepIn(false, false);

        if (sleep) {
            System.out.println("Можем спать дальше");
        } else if (!sleep) {
            System.out.println("Пора идти на работу");
        }
    }
}
