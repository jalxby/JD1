package home_work_4;

import java.util.Comparator;

public class DataContainerSorter implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return Integer.compare(0, s1.compareTo(s2));
    }
}
