package org.college.practise.task1.task8.task8_1;

public class EndShift implements WorkEvent {
    private String _employeeName;
    public EndShift(String employeeName) {
        this._employeeName = employeeName;
    }
    public String getEmployeeName() {
        return _employeeName;
    }
    public void accept(WorkEventVisitor visitor) {
        visitor.visit(this);
    }
}