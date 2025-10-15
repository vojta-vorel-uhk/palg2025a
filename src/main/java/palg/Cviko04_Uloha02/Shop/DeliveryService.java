package palg.Cviko04_Uloha02.Shop;

public interface DeliveryService
{
    void PrepareRequest(String[] customerDetails, String[] orderDetails);

    void SendRequest();
}

