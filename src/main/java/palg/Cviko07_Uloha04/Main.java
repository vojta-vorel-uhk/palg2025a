package palg.Cviko07_Uloha04;

public class Main {
    public static void main(String[] args)
    {
        printNumbers(5_000_000);
    }

    public static void printNumbers(long start)
    {
        if(start <= 1)
            return;

        if(start % 2 == 0)
            printNumbers(start /2);
        else
            printNumbers(start*3+1);
    }

    // Doplň druhou metodu tak, aby dělala totéž, ale bez rekurze
    public static long printNumbers2(long input)
    {
        throw new IndexOutOfBoundsException();
    }
}
