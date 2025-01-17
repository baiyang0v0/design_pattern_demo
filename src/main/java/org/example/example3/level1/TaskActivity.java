package org.example.example3.level1;

import org.example.example2.level1.ActionType;
import org.example.example2.level2.Task;

public class TaskActivity extends Activity {
    private Task task;

    public TaskActivity(String type, String name, Integer scene, String material, Task task) {
        super(type, name, scene, material);
        this.task = task;
    }

    @Override
    public void participate(Long userId) {
        task.getState().update(task, ActionType.START);
    }

}
