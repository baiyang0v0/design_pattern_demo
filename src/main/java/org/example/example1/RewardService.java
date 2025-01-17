package org.example.example1;

import org.example.example1.business.*;

public class RewardService {

    private WaimaiService waimaiService;
    private HotelService hotelService;
    private FoodService foodService;

    public void issueReward(String rewardType, Object[] params) {
        if ("waimai".equals(rewardType)) {
            WaimaiRequest waimaiRequest = new WaimaiRequest();
            waimaiRequest.setWaimaiRequest(params);

            waimaiService.issueWaimai(waimaiRequest);
        }
        else if ("hotel".equals(rewardType)) {
            HotelRequest hotelRequest = new HotelRequest();
            hotelRequest.addHotelRequest(params);

            hotelService.sendPrice(hotelRequest);
        }
        else if ("food".equals(rewardType)) {
            FoodRequest foodRequest = new FoodRequest(params);

            foodService.getCoupon(foodRequest);
        }
        else {
            throw new RuntimeException("Invalid reward type");
        }
    }
}
