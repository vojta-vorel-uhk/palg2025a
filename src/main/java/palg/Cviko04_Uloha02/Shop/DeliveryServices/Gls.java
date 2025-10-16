package palg.Cviko04_Uloha02.Shop.DeliveryServices;

import palg.Cviko04_Uloha02.Shop.DeliveryService;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Gls extends DeliveryService {

    private HttpRequest request;
    @Override
    public void PrepareRequest(String[] customerDetails, String[] orderDetails) {
        request = HttpRequest.newBuilder().uri(URI.create("gls.cz/"+orderDetails[0])).POST(HttpRequest.BodyPublishers.ofString(customerDetails.toString())).build();
    }

    @Override
    public void SendRequest()  {
        var client =HttpClient.newBuilder().build();
        try {
            client.send(request,  HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
        }
    }
}
