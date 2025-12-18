package palg.Cviko12;

import java.nio.charset.StandardCharsets;
import java.text.Normalizer;

public class Uloha08
{
    public static void main(String[] args)
    {
        String prace1 = "práce";
        String prace2 = "práce";


        // Řešení: důležité porovnávání dělat

        for(var c : prace1.toCharArray())
            System.out.println(c);
        for(var c : prace2.toCharArray())
            System.out.println(c);
        // TODO: Co se vypíše?
        if(prace1.equals(prace2))
            System.out.println("OK");
        else
            System.out.println("NOT OK");

        if(Normalizer.normalize(prace1, Normalizer.Form.NFC).equals(
                Normalizer.normalize(prace2, Normalizer.Form.NFC)
        ))  System.out.println("OK");
        else
            System.out.println("NOT OK");
    }
}
