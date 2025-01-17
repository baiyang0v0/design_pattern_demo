package org.example.example2.level3;

import org.example.org.example.example2.business.TaskManager;

public class TaskMangerObserver implements Observer{
    private final TaskManager taskManager = new TaskManager();

    @Override
    public void response(Long taskId) {
        taskManager.release(taskId);
    }
}
