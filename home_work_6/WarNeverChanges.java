package home_work_6;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class WarNeverChanges {

    public static String fileToString(String file) {
        String text = null;
        try {
            Path path = Path.of(file);
            text = Files.readString(path);
        } catch (IOException e) {
            System.out.println("File not found");
        }
        return text;
    }


}
