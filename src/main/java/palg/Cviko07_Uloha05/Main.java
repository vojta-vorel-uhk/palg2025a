package palg.Cviko07_Uloha05;

public class Main {
    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();
        System.out.println(fibonacci(42));
        System.out.print("Trvalo to " + (System.currentTimeMillis() - startTime) + " ms");

    }
    public static long fibonacci(long index)
    {
        if(index == 0 || index == 1)
            return 1;

        return fibonacci(index - 1) + fibonacci(index - 2);
    }
}
