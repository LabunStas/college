package org.college.practise.task1.task9.task9_1;

public class RealWorkTime implements WorkTime {
    @Override
    public void track(String employeeName) {
        System.out.println("Tracking work time for: " + employeeName);
    }
}