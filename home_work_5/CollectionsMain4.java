package home_work_5;

import collections.text.DefaultTextSpliterator;
import collections.text.api.ITextSpliterator;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class CollectionsMain4 {
    public static void main(String[] args) throws IOException {
        String text = Files.readString(
                Path.of("C:\\Users\\WestDragon\\IdeaProjects\\Md-JC1-59-20\\Верн Жюль. Двадцать тысяч лье под водой - royallib.ru.txt"),
                Charset.forName("windows-1251")
        );

        ITextSpliterator spliterator = new DefaultTextSpliterator();

        String[] strings = spliterator.split(text);

        Set<String> uniqueString = new HashSet<>();

        for (String string : strings) {
            uniqueString.add(string);
        }

        System.out.println(uniqueString);
    }
}
