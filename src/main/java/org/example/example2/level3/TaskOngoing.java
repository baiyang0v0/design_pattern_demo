package org.example.example2.level3;

import org.example.example2.level1.ActionType;
import org.example.org.example.example2.business.ActivityService;
import org.example.org.example.example2.business.TaskManager;

public class TaskOngoing extends Subject implements State {
    private final ActivityService activityService = new ActivityService();
    private final TaskManager taskManager = new TaskManager();

    @Override
    public void update(Task task, ActionType actionType) {
        if (actionType == ActionType.ACHIEVE) {
            task.setState(new TaskFinished());

            notifyAll(task.getTaskId());
//            activityService.notifyFinished(task.getTaskId());
//            taskManager.release(task.getTaskId());
        }
        else if (actionType == ActionType.STOP) {
            task.setState(new TaskPaused());
        }
        else if (actionType == ActionType.EXPIRE) {
            task.setState(new TaskExpired());
        }
    }
}
