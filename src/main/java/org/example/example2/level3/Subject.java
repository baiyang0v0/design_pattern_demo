package org.example.example2.level3;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAll(Long taskId) {
        observers.forEach(
                observer -> observer.response(taskId)
        );
    }
}
