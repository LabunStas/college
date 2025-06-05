package org.college.practise.task1.task10.task10_1;

public class AttendanceAdapter implements WorkTimeTracker {
    private LegacyAttendanceSystem _legacySystem;

    public AttendanceAdapter(LegacyAttendanceSystem legacySystem) {
        this._legacySystem = legacySystem;
    }

    @Override
    public void trackWork(String employeeName) {
        _legacySystem.logEntry(employeeName);
    }
}
