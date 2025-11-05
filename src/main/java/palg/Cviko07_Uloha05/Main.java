package palg.Cviko07_Uloha05;

public class Main {
    public static void main(String[] args)
    {
        fibonacci(50);
    }
    public static long fibonacci(long index)
    {
        if(index == 0 || index == 1)
            return 1;

        return fibonacci(index - 1) + fibonacci(index - 2);
    }
}
