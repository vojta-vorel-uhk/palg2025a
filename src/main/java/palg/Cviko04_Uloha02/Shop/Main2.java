package palg.Cviko04_Uloha02.Shop;

import palg.Cviko04_Uloha02.Corporation.CorporationUtils;
import palg.Cviko04_Uloha02.Shop.DeliveryServices.Ppl;
import palg.Cviko04_Uloha02.Shop.DeliveryServices.Zasilkovna;

public class Main2 {
    public static void main()
    {
        var deliveryService1 = new Zasilkovna();
        CorporationUtils.Order(
                deliveryService1,
                new String[]{"Jan","Novák","Pod Vinicí 5"},
                new String[]{"86ea30b6-4499-4395-8bae-ef6209f53393"});

        var deliveryService2 = new Ppl();
        CorporationUtils.Order(
                deliveryService2,
                new String[]{"Jakub","Novák","Pod Višňovkou 15"},
                new String[]{"d491b6ca-bc75-45f8-ae96-ed64262f836d"});
    }
}
