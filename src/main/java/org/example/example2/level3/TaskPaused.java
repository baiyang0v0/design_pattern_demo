package org.example.example2.level3;

import org.example.example2.level1.ActionType;

public class TaskPaused implements State {
    @Override
    public void update(Task task, ActionType actionType) {
        if (actionType == ActionType.START) {
            task.setState(new TaskOngoing());
        }
        else if (actionType == ActionType.EXPIRE) {
            task.setState(new TaskExpired());
        }
    }
}
