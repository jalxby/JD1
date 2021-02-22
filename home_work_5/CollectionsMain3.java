package home_work_5;

import collections.comparators.StringComparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsMain3 {
    public static void main(String[] args) {
        Comparator<String> cmp = new StringComparator();
        Set<String> data = new TreeSet<>(cmp.reversed());
        data.add("I");
        data.add("B");
        data.add("A");
        data.add("Z");
        data.add("G");

        System.out.println(data);
    }
}
