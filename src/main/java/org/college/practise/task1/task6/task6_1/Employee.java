package org.college.practise.task1.task6.task6_1;

class Employee {
    private String _name;
    private WorkTimeStrategy _strategy;

    public Employee(String name, WorkTimeStrategy strategy) {
        this._name = name;
        this._strategy = strategy;
    }

    public void setStrategy(WorkTimeStrategy strategy) {
        this._strategy = strategy;
    }

    public void trackTime() {
        _strategy.trackTime(_name);
    }
}