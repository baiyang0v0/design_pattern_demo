package org.example.example1.level2.level1;

import java.util.HashMap;
import java.util.Map;

public class StrategyContext {
    public static final Map<String, Strategy> registry = new HashMap<String, Strategy>();

    public static void register(String name, Strategy strategy) {
        registry.putIfAbsent(name, strategy);
    }

    public static Strategy getStrategy(String rewardType) {
        return registry.get(rewardType);
    }

}
