package home_work_6;

import home_work_5.utils.SortUtils;
import home_work_6.api.ITextSpliterator;
import home_work_6.comparators.MapComparator;

import java.util.*;


public class TextToMap {
    public static Map<String, Integer> createMap(ITextSpliterator spliterator, String text) {
        String[] strings = spliterator.split(text);
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

    public static List<Map.Entry<String, Integer>> sortedMap(Map<String, Integer> mapper) {
        List<Map.Entry<String, Integer>> listMap = new ArrayList<>(mapper.entrySet());
        SortUtils.shakerSort(listMap, new MapComparator());
        return listMap;

    }

    public static void getTopN(List<Map.Entry<String, Integer>> list, int n){
        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i));
        }
    }
}
