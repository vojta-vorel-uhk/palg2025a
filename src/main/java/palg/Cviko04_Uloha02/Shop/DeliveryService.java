package palg.Cviko04_Uloha02.Shop;

import palg.Cviko04_Uloha02.Corporation.OneClickDeliveryService;

public abstract class DeliveryService implements OneClickDeliveryService
{
    public abstract void PrepareRequest(String[] customerDetails, String[] orderDetails);

    public abstract void SendRequest();

    public void PrepareAndSendRequest(String[] customerDetails, String[] orderDetails){
        PrepareRequest(customerDetails,orderDetails);
        SendRequest();
    }
}

