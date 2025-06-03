package org.college.practise.task1.task2.task2_1;

public class WorkRecord {
    private String _date;
    private int _hours;

    public WorkRecord(String date, int hours) {
        this._date = date;
        this._hours = hours;
    }

    public String getDate() { return _date; }
    public int getHours() { return _hours; }

    @Override
    public String toString() {
        return _date + ": " + _hours + " годин";
    }
}
