package palg.Cviko04_Uloha01;

import java.io.IOException;

public class WebRandomSource implements RandomSource {
    @Override
    public int nextInt() {
        String result = null;
        try {
            result = Utils.HttpGet("http://www.randomnumberapi.com/api/v1.0/random?min=0&max=10000&count=1");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        result = result.replace("[","").replace("]","").trim();
        // Vrací se pole ve formátu JSON,
        // Ideálně zpracovat např knihovnou Gson
        return Integer.parseInt(result);

    }
}
