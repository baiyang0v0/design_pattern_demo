package org.example.example2.level3;

import org.example.example2.level1.ActionType;

public class TaskInit implements State {
    @Override
    public void update(Task task, ActionType actionType) {
        if (actionType == ActionType.START) {
//            task.setState(new TaskOngoing());
            TaskOngoing taskOngoing = new TaskOngoing();
            taskOngoing.add(new ActivityObserver());
            taskOngoing.add(new TaskMangerObserver());
            task.setState(taskOngoing);
        }
    }
}
