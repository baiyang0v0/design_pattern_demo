package org.example.example1.level2.level1;

public class RewardService {
    public void issueReward(String rewardType, Object[] params) {
        Strategy strategy = StrategyContext.getStrategy(rewardType);
        strategy.issue(params);
    }
}
