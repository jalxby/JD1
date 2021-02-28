package home_work_6;

import home_work_6.api.ITextSpliterator;

public class WarRunner {
    public static void main(String[] args) {
        String file = "C:\\Projects\\JD1\\HomeWork\\src\\home_work_6\\Война и мир_книга.txt";
        String war = WarNeverChanges.fileToString(file);
        ITextSpliterator spliterator = new DefaultTextSpliterator();
        System.out.println(TextToSet.createSet(spliterator, war).size());
        System.out.println("----------------------------------------------------");
        TextToMap.getTopN(TextToMap.sortedMap(TextToMap.createMap(spliterator, war)),20);


    }
}
