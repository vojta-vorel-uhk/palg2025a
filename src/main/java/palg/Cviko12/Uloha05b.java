package palg.Cviko12;

import java.time.*;

public class Uloha05b
{
    public static void main(String[] args)
    {
        ZoneId newYorkZone = ZoneId.of("America/New_York");
        var wallclock = LocalDateTime.of(2025,12,18,19,20,0);
        var zoned = ZonedDateTime.of(wallclock,newYorkZone);
        var instant = zoned.toInstant();

        // TODO: Hodiny na zdi v New Yorku ukazovaly 18.12.2025, 19:20
        //  Vypiš, jaký datum a čas byl v Praze
    }
}
