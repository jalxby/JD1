package home_work_4;


import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<Integer> dataContainer = new DataContainer<>(new Integer[5]);


        dataContainer.add(1);
        dataContainer.add(2);
        dataContainer.add(9);
        dataContainer.add(4);
        dataContainer.add(6);
        dataContainer.delete(4);
        System.out.println(dataContainer.toString());

        dataContainer.sort(Comparator.reverseOrder());
        System.out.println(dataContainer.toString());

        dataContainer.delete((Integer) 2);
        System.out.println(dataContainer.toString());

        dataContainer.delete(0);
        System.out.println(dataContainer.toString());

    }
}
