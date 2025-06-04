package org.college.practise.task1.task4.task4_1;

import java.util.ArrayList;
import java.util.List;

public class WorkTimeTracker {
    private List<WorkObserver> _observers = new ArrayList<>();
    private String _state;

    public void addObserver(WorkObserver observer) {
        _observers.add(observer);
    }

    public void removeObserver(WorkObserver observer) {
        _observers.remove(observer);
    }

    public void setState(String state) {
        this._state = state;
        notifyObservers();
    }

    public String getState() {
        return _state;
    }

    private void notifyObservers() {
        for (WorkObserver observer : _observers) {
            observer.update(_state);
        }
    }
}
