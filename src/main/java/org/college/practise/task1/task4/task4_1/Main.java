package org.college.practise.task1.task4.task4_1;

public class Main {
    public static void main(String[] args) {
        WorkTimeTracker tracker = new WorkTimeTracker();

        HRDepartment hr = new HRDepartment();
        ManagerDashboard manager = new ManagerDashboard();

        tracker.addObserver(hr);
        tracker.addObserver(manager);

        tracker.setState("Працівник почав зміну.");
        tracker.setState("Працівник пішов на перерву.");
        tracker.setState("Працівник закінчив зміну.");
    }
}
