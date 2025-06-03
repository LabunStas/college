package org.college.practise.task1.task1_1;

import java.util.HashMap;

public class WorkLog {
    private HashMap<Integer, Integer> hoursWorked; // ID -> hours
    private String _department;
    private static HashMap<String, WorkLog> _instances = new HashMap<>();

    public WorkLog(String department) {
        this._department = department;
        this.hoursWorked = new HashMap<>();
        _instances.put(department, this);
    }

    public static WorkLog getInstance(String department) {
        return _instances.get(department);
    }

    public boolean addHours(Employee employee, int hours) {
        if (!hoursWorked.containsKey(employee.getId())) {
            hoursWorked.put(employee.getId(), hours);
            return true;
        }
        return false;
    }

    public boolean updateHours(Employee employee, int hours) {
        if (hoursWorked.containsKey(employee.getId())) {
            hoursWorked.put(employee.getId(), hours);
            return true;
        }
        return false;
    }

    public boolean removeEmployee(Employee employee) {
        return hoursWorked.remove(employee.getId()) != null;
    }

    public String getEmployeeHours(Employee employee) {
        if (hoursWorked.containsKey(employee.getId())) {
            return "Працівник: " + employee.getName() + ", Годин: " + hoursWorked.get(employee.getId());
        }
        return "Працівника не знайдено.";
    }

    public int getEmployeeCount() {
        return hoursWorked.size();
    }

    public String getDepartment() {
        return _department;
    }

    @Override
    public String toString() {
        return "WorkLog{" +
                "department='" + _department + '\'' +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}