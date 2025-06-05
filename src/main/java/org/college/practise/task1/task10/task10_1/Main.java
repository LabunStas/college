package org.college.practise.task1.task10.task10_1;

public class Main {
    public static void main(String[] args) {
        LegacyAttendanceSystem oldSystem = new LegacyAttendanceSystem();
        WorkTimeTracker tracker = new AttendanceAdapter(oldSystem);

        tracker.trackWork("Andriy"); // Працює через адаптер
    }
}
