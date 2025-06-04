package org.college.practise.task1.task7.task7_1;

public abstract class WorkTimeDecorator implements WorkTime {
    protected WorkTime _wrapped;

    public WorkTimeDecorator(WorkTime wrapped) {
        this._wrapped = wrapped;
    }

    @Override
    public void track(String employeeName) {
        _wrapped.track(employeeName);
    }
}
