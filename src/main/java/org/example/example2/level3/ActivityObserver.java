package org.example.example2.level3;

import org.example.org.example.example2.business.ActivityService;

public class ActivityObserver implements Observer{
    private final ActivityService activityService = new ActivityService();

    @Override
    public void response(Long taskId) {
        activityService.notifyFinished(taskId);
    }
}
