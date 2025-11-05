package palg.Cviko07_Uloha01;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Utils {

    public static int[] getQueries() {
        Path path = Paths.get(System.getProperty("user.dir"),"input","queries.txt");
        try {
            return Arrays
                    .stream(Files.readString(path, StandardCharsets.UTF_8).split(","))
                    .map(String::trim)
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static Item[] getDatabase() {
        Path path = Paths.get(System.getProperty("user.dir"),"input","database.csv");
        try {
            return
                    Files.readAllLines(path, StandardCharsets.UTF_8)
                    .stream()
                    .skip(1)
                    .map(s->s.split(","))
                    .map(p->new Item(Integer.parseInt(p[0]), p[1]))
                    .toArray(Item[]::new);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}