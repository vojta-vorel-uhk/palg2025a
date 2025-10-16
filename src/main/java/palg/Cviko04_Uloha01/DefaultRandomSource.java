package palg.Cviko04_Uloha01;

import java.util.Random;

public class DefaultRandomSource implements RandomSource
{
    Random random = new Random();
    public int nextInt() {
        return random.nextInt();
    }
}
