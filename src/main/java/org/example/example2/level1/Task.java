package org.example.example2.level1;


import org.example.org.example.example2.business.ActivityService;
import org.example.org.example.example2.business.TaskManager;

public class Task {
    private Long taskId;

    private TaskState state = TaskState.INIT;

    private final ActivityService activityService = new ActivityService();

    private final TaskManager taskManager = new TaskManager();

    public void updateState(ActionType actionType) {
        if (state == TaskState.INIT) {
            if (actionType == ActionType.START) {
                state = TaskState.ONGOING;
            }
        }
        else if (state == TaskState.ONGOING) {
            if (actionType == ActionType.ACHIEVE) {
                state = TaskState.FINISHED;

                activityService.notifyFinished(taskId);
                taskManager.release(taskId);
            }
            else if (actionType == ActionType.STOP) {
                state = TaskState.PAUSED;
            }
            else if (actionType == ActionType.EXPIRE) {
                state = TaskState.EXPIRED;
            }
        }
        else if (state == TaskState.PAUSED) {
            if (actionType == ActionType.START) {
                state = TaskState.ONGOING;
            }
            else if (actionType == ActionType.EXPIRE) {
                state = TaskState.EXPIRED;
            }
        }
    }
}
