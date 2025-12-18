package palg.Cviko12;

import java.util.regex.Pattern;

public class Uloha07
{
    public static void main(String[] args)
    {
        // TODO: Co se vypíše?
        String ip = "127.0.0.1";
        //for(var part : ip.split("\\."))
        for(var part : ip.split(Pattern.quote(".")))
        {
            System.out.println(part);
        }

    }
}
