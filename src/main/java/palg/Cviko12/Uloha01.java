package palg.Cviko12;

import java.io.IOException;

public class Uloha01
{
    public static void main(String[] args) throws IOException
    {
        // TODO
        //  Najdi jiný string, bude mít stejný hash jako heslo 123ABC

        String heslo1 = "123ABC";
        int hash1 = heslo1.hashCode();
        System.out.println(heslo1 + " > "+ hash1);
    }

}
