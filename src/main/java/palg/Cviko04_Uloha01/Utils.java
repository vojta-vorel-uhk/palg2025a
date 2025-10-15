package palg.Cviko04_Uloha01;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Utils
{
    public static String HttpGet(String url) throws IOException, InterruptedException
    {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
