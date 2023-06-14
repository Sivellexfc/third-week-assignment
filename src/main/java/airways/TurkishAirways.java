package airways;

import services.CateringService;

public class TurkishAirways extends Airway implements CateringService {

    public TurkishAirways(int capacity) {
        super(capacity);
    }

    @Override
    public void cateringService() {
        System.out.println("Yemek servisi yapılıyor");
    }
}
