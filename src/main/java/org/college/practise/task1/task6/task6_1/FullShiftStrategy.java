package org.college.practise.task1.task6.task6_1;

public class FullShiftStrategy implements WorkTimeStrategy {
    public void trackTime(String employeeName) {
        System.out.println(employeeName + " відпрацював повну зміну.");
    }
}
