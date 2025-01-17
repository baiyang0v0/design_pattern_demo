package org.example.example1.level2.level1;

public abstract class AbstractStrategy implements Strategy {

    public void register() {
        StrategyContext.register(getClass().getSimpleName(), this);
    }
}
