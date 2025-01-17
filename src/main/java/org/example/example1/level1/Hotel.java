package org.example.example1.level1;

import org.example.example1.business.HotelRequest;
import org.example.example1.business.HotelService;

public class Hotel implements Strategy{
    private HotelService hotelService;

    @Override
    public void issue(Object[] params) {
        HotelRequest hotelRequest = new HotelRequest();
        hotelRequest.addHotelRequest(params);

        hotelService.sendPrice(hotelRequest);
    }
}
