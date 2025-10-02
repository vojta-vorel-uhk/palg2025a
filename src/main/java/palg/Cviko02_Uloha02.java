package palg;

import java.io.IOException;
import java.util.Arrays;

public class Cviko02_Uloha02
{
    // Doplň metodu sumOfSmall (se dvěma vstupy), která vrátí součet čísel v daném poli,
    // která jsou nižší než daný limit.
    // Ze souboru southMoravia.txt zjisti, kolik lidí žije v obcích s méně než 1000 obyvatel.

    public static void main(String[] args) throws IOException {
        var ints
                = Cviko02_FileUtils.integersFromFile("southMoravia.txt");
        System.out.println(sumOfSmall(ints,1000));
    }

    public static int sumOfSmall( int[] pole , int limit )
    {
        //return Arrays.stream(pole).filter(p->p<limit).sum();
        int sum=0;
        for(int i=0;i<pole.length;i++)
        {
            if(pole[i]<limit)
            {
                sum = sum+pole[i];
            }
        }
        return sum;
    }
}
