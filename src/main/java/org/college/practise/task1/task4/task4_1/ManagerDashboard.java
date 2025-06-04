package org.college.practise.task1.task4.task4_1;

public class ManagerDashboard implements WorkObserver {
    @Override
    public void update(String state) {
        System.out.println("Менеджер бачить зміну: " + state);
    }
}
