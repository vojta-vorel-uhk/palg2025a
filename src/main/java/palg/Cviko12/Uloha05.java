package palg.Cviko12;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Uloha05
{
    public static void main(String[] args)
    {
        // Převod z wall-clock času na UTC
        // (v čem je problém?)
        var utcTime1 = LocalDateTime
                .of(2025, 3, 30, 2, 30)
                .atZone(ZoneId.of("Europe/Prague"))
                .toInstant();

        System.out.println(utcTime1);

        var utcTime2 = LocalDateTime
                .of(2025, 10, 26, 2, 30)
                .atZone(ZoneId.of("Europe/Prague"))
                .toInstant();

        System.out.println(utcTime2);
    }


}
