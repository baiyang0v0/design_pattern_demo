package org.example.example1.level2.level1;

import org.example.example1.business.HotelRequest;
import org.example.example1.business.HotelService;

public class Hotel extends AbstractStrategy implements Strategy {
    private static final Hotel INSTANCE = new Hotel();
    private HotelService hotelService;

    private Hotel() {
        register();
    }

    public static Hotel getInstance() {
        return INSTANCE;
    }

    @Override
    public void issue(Object[] params) {
        HotelRequest hotelRequest = new HotelRequest();
        hotelRequest.addHotelRequest(params);

        hotelService.sendPrice(hotelRequest);
    }
}
