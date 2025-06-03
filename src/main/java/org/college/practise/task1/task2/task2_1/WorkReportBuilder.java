package org.college.practise.task1.task2.task2_1;

import java.util.ArrayList;
import java.util.List;

public class WorkReportBuilder {
    private Employee _employee;
    private List<WorkRecord> _records = new ArrayList<>();
    private String _note = "";

    public WorkReportBuilder(Employee employee) {
        this._employee = employee;
    }

    public void addRecord(WorkRecord record) {
        _records.add(record);
    }

    public void setNote(String note) {
        this._note = note;
    }

    public WorkReport build() {
        return new WorkReport(_employee, _records, _note);
    }

    @Override
    public String toString() {
        return "WorkReportBuilder for " + _employee.getName();
    }
}
