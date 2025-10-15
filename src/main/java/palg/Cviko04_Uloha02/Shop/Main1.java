package palg.Cviko04_Uloha02.Shop;

import palg.Cviko04_Uloha02.Shop.DeliveryServices.Ppl;
import palg.Cviko04_Uloha02.Shop.DeliveryServices.Zasilkovna;

public class Main1 {
    public static void main()
    {
        var deliveryService1 = new Zasilkovna();
        deliveryService1.PrepareRequest(new String[]{"Jan","Novák","Pod Vinicí 5"}, new String[]{"86ea30b6-4499-4395-8bae-ef6209f53393"});
        deliveryService1.SendRequest();

        var deliveryService2 = new Ppl();
        deliveryService2.PrepareRequest(new String[]{"Jakub","Novák","Pod Višňovkou 15"}, new String[]{"d491b6ca-bc75-45f8-ae96-ed64262f836d"});
        deliveryService2.SendRequest();
    }
}
