package home_work_6;

import home_work_6.api.ITextSpliterator;
import java.util.HashMap;
import java.util.Map;


public class TextToMap {
    public static Map<String, Integer> createMap(ITextSpliterator spliterator, String text) {
        String[] strings = spliterator.split(text);
        System.out.println(strings.length);
        Map<String, Integer> stringsMap = new HashMap<>();
        for (String string : strings) {
            Integer i = stringsMap.get(string);
            if (i == null) {
                i = 0;
            }
            stringsMap.put(string, ++i);
        }
        return stringsMap;
    }
}
