package palg;

import java.io.IOException;
import java.nio.file.Files;

public class Cviko02_Uloha03
{
    // Chytré hodinky zaznamenávají každý den počet hodin strávených sportem (smartSportData.txt).
    // Doplň metodu maxZeroIntervalLength, která zjistí, kolik nejvýše dní za sebou bylo zaznamenáno zcela beze sportu.

    public static void main(String[] args) throws IOException {
        int res= maxZeroIntervalLength(Cviko02_FileUtils.integersFromFile("smartSportData.txt"));
        System.out.println(res);
    }

    public static int maxZeroIntervalLength( int[] values )
    {
        int best = 0;
        int currentZerosCount = 0;
        for (int i=0;i<values.length;i++)
        {
            if(values[i] == 0)
                currentZerosCount++;
            else
                currentZerosCount=0;

            if(currentZerosCount > best)
                best = currentZerosCount;
        }
        return best;
    }
}
