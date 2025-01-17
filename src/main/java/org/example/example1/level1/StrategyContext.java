package org.example.example1.level1;

public class StrategyContext {
    public static Strategy getStrategy(String rewardType) {
        switch (rewardType) {
            case "waimai":
                return new Waimai();
            case "hotel":
                return new Hotel();
            case "food":
                return new Food();
            default:
                throw new RuntimeException("invalid reward type");
        }
    }

}
