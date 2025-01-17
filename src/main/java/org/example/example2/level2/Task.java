package org.example.example2.level2;

import lombok.Data;
import org.example.example2.level1.ActionType;
@Data
public class Task {
    private Long taskId;

    private State state = new TaskInit();

    public void updateState(ActionType actionType) {
        state.update(this, actionType);
    }
}
