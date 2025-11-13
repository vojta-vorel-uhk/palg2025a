package palg.Cviko07_Uloha05;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();
        System.out.println(fibonacci2(4));
        System.out.print("Trvalo to " + (System.currentTimeMillis() - startTime) + " ms");

    }
    public static long fibonacci(long index)
    {
        if(index == 0 || index == 1)
            return 1;
        return fibonacci(index - 1) + fibonacci(index - 2);
    }

    public static long fibonacci2(long index)
    {
        List<Long> f = new ArrayList<>();
        f.add(1L);
        f.add(1L);
        for (int i=0;i<index-1;i++) {
            long n = f.getLast() + f.get(f.size()-2);
            f.add(n);
        }
        return f.getLast();
        // Možnost zlepšení: nepoužít seznam,
        // ale jenom dvě proměnné na poslední
        // dva prvky posloupnosti
    }
}
