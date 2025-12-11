package palg.Cviko12;

import java.io.IOException;

public class Uloha01
{
    public static void main(String[] args) throws IOException
    {
        // TODO
        //  Najdi jiný string, bude mít stejný hash jako heslo 123ABC

        String heslo1 = "123ABC";
        String heslo2 = "123AAb";
        int hash1 = heslo1.hashCode();
        int hash2 = heslo2.hashCode();
        System.out.println(heslo1 + " > "+ hash1);
        System.out.println(heslo2 + " > "+ hash2);
    }

}
