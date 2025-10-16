package palg.Cviko04_Uloha02.Corporation;

public class CorporationUtils {
    public static void Order(
            OneClickDeliveryService delivery,
            String[] customerDetails,
            String[] orderDetails)
    {
        delivery.PrepareAndSendRequest(customerDetails, orderDetails);
    }
}
