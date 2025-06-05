package org.college.practise.task1.task9.task9_1;

public class WorkTimeProxy implements WorkTime {
    private RealWorkTime _realWorkTime;
    private String _authorizedUser;

    public WorkTimeProxy(String authorizedUser) {
        this._authorizedUser = authorizedUser;
        this._realWorkTime = new RealWorkTime();
    }

    @Override
    public void track(String employeeName) {
        if (employeeName.equals(_authorizedUser)) {
            _realWorkTime.track(employeeName);
        } else {
            System.out.println("Access denied for: " + employeeName);
        }
    }
}