package palg.Cviko12;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Uloha03
{
    public static void main(String[] args) throws IOException
    {
        Path path = Paths.get(System.getProperty("user.dir"),"input", "allWords.txt");
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        String[] words = lines.toArray(new String[0]);
        printAnagrams(words);
    }

    // Doplň metodu, která bude ze vstupu vybírat dvojice slov, které jsou přesmyčkami
    // (např. reklama <-> karamel)
    public static void printAnagrams(String[] words)
    {
        for(var w1 : words)
            for(var w2 : words){
                if(!w1.equals(w2) && sort(w1).equals(sort(w2))){
                    System.out.println(w1+" <-> "+w2);
                }
            }
        System.out.println(words[111893]+" <-> "+words[36006]);
    }
    private static String sort(String s){
        var pole = s.toCharArray();
        Arrays.sort(pole);
        return new String(pole);
    }
}
