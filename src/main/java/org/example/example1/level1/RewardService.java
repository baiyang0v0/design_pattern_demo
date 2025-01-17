package org.example.example1.level1;

import java.awt.image.renderable.RenderContext;

public class RewardService {
    public void issueReward(String rewardType, Object[] params) {
        Strategy strategy = StrategyContext.getStrategy(rewardType);
        strategy.issue(params);
    }
}
