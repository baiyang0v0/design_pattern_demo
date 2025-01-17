package org.example.example2.level3;

import org.example.example2.level1.ActionType;

public interface State {

    default void update(Task task, ActionType actionType) {

    }
}
