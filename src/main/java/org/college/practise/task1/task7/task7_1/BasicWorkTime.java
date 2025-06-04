package org.college.practise.task1.task7.task7_1;

public class BasicWorkTime implements WorkTime {
    @Override
    public void track(String employeeName) {
        System.out.println("Запис робочого часу для: " + employeeName);
    }
}