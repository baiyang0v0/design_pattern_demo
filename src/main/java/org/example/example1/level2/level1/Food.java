package org.example.example1.level2.level1;

import org.example.example1.business.FoodRequest;
import org.example.example1.business.FoodService;

public class Food extends AbstractStrategy implements Strategy {
    private static final Food INSTANCE = new Food();
    private FoodService foodService;

    private Food() {
        register();
    }

    private Food getInstance() {
        return INSTANCE;
    }

    @Override
    public void issue(Object[] params) {
        FoodRequest foodRequest = new FoodRequest(params);

        foodService.getCoupon(foodRequest);
    }
}
