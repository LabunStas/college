package org.college.practise.task1.task2.task2_1;

import java.util.List;

public class WorkReport {
    private Employee _employee;
    private List<WorkRecord> _records;
    private String _note;

    public WorkReport(Employee employee, List<WorkRecord> records, String note) {
        this._employee = employee;
        this._records = records;
        this._note = note;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Звіт для ").append(_employee.toString()).append("\n");
        for (WorkRecord r : _records) {
            sb.append(" - ").append(r.toString()).append("\n");
        }
        sb.append("Примітка: ").append(_note);
        return sb.toString();
    }
}
