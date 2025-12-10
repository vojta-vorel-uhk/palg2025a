package palg.Cviko12;

import java.nio.charset.StandardCharsets;

public class Utils
{
    public static void printUtf16Bytes(String string)
    {
        byte[] bytes = string.getBytes(StandardCharsets.UTF_16);
        boolean sep = false;
        for (var b :bytes)
        {
            System.out.print(String.format("%02x", b) + (sep?",":""));
            sep ^= true;
        }
        System.out.println();
    }
}