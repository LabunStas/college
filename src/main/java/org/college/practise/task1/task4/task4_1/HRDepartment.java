package org.college.practise.task1.task4.task4_1;

public class HRDepartment implements WorkObserver {
    @Override
    public void update(String state) {
        System.out.println("HR отримав оновлення: " + state);
    }
}
