package palg.Cviko04_Uloha01;

import java.time.Instant;

public class TimeRandomSource implements RandomSource {
    @Override
    public int nextInt() {
        return Instant.now().getNano();
    }
}
