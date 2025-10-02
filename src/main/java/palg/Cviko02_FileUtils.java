package palg;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cviko02_FileUtils
{
    public static int[] integersFromFile(String fileName) throws IOException
    {
        Path path = Paths.get(System.getProperty("user.dir"),"input",fileName);
        return Files.readAllLines(path, StandardCharsets.UTF_8).stream().mapToInt(Integer::parseInt).toArray();
    }

    public static float[] floatsFromFile(String fileName) throws IOException
    {
        Path path = Paths.get(System.getProperty("user.dir"),"input",fileName);
        ArrayList<Float> result = new ArrayList<>();

        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        for(String line: lines) {
            result.add(Float.parseFloat(line));
        }

        float[] res = new float[result.size()];
        for (int i=0;i<res.length;i++)
            res[i]=result.get(i);
        return res;
    }
}
