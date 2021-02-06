package home_work_4;

import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {
        Integer[] arr = new Integer[1];
        String[] arr2 = new String[1];
        DataContainer<Integer> dataContainer = new DataContainer<>(arr);
        DataContainer<String> dataContainer2 = new DataContainer<>(arr2);




        dataContainer.add(1);
        dataContainer.add(2);
        dataContainer.add(9);
        dataContainer.add(4);
        dataContainer.add(null);
        dataContainer.add(6);
       // dataContainer.sort();
       // dataContainer.delete(5);

        /*dataContainer2.add("111");
        dataContainer2.add("222");
        dataContainer2.add("333");
        dataContainer2.add("444");
        dataContainer2.add("555");
        dataContainer2.add("666");
        dataContainer2.delete(5);
        dataContainer2.delete("111");*/
        System.out.println(dataContainer.toString());

    }
}
