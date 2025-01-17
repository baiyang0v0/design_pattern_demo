package org.example.example1.level1;

import org.example.example1.business.FoodRequest;
import org.example.example1.business.FoodService;

public class Food implements Strategy{
    private FoodService foodService;

    @Override
    public void issue(Object[] params) {
        FoodRequest foodRequest = new FoodRequest(params);

        foodService.getCoupon(foodRequest);
    }
}
