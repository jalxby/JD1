package home_work_5.core.random;



import home_work_5.core.random.api.IRandom;

import java.util.Random;

//https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
public class Java7Random implements IRandom {
    private final Random rand = new Random();

    public int randInt(int min, int max) {

        return rand.nextInt((max - min) + 1) + min;
    }

    @Override
    public double randDouble(double min, double max) {
        return rand.nextDouble() * (max - min) + min;
    }

    @Override
    public String randString(int min, int max) {
        String alphabet = "авбгдеёжзийклмнопрстуфхцшщчъыьэюя";
        StringBuilder sb = new StringBuilder();
        int size = randInt(min, max);
        for (int i = 0; i < size - 1; i++) {
            sb.append(alphabet.charAt((int) (Math.random() * 33)));
        }

        return sb.substring(0, 1).toUpperCase() + sb.substring(1);
    }

    @Override
    public boolean randBoolean() {
        return rand.nextBoolean();
    }
}
