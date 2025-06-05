package org.college.practise.task1.task8.task8_1;

public class Break implements WorkEvent {
    private int _minutes;
    public Break(int minutes) {
        this._minutes = minutes;
    }
    public int getMinutes() {
        return _minutes;
    }
    public void accept(WorkEventVisitor visitor) {
        visitor.visit(this);
    }
}
