package palg.Cviko07_Uloha03;

import java.io.File;

public class Main {
    public static void main(String[] args)
    {
        System.out.println(compute(5));
    }

    // Uhodni, co metoda měla dělat a uprav ji tak, aby fungovala.
    public static long compute(long input)
    {
        return input * compute(input -1);
    }
}
