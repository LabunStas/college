package org.college.practise.task1.task8.task8_1;

public class StartShift implements WorkEvent {
    private String _employeeName;
    public StartShift(String employeeName) {
        this._employeeName = employeeName;
    }
    public String getEmployeeName() {
        return _employeeName;
    }
    public void accept(WorkEventVisitor visitor) {
        visitor.visit(this);
    }
}