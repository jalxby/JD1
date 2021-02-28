package home_work_6;

import home_work_6.api.ITextSpliterator;
import java.util.HashSet;
import java.util.Set;

public class SimpleSetWar {
    public static Set<String> createSet(ITextSpliterator spliterator, String text) {
        String[] strings = spliterator.split(text);
        Set<String> stringsSet = new HashSet<>();
        for (String string : strings) {
            stringsSet.add(string);

        }
        stringsSet.removeIf(s -> s.length() == 1);
        return stringsSet;
    }
}
