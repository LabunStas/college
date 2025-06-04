package org.college.practise.task1.task6.task6_1;

public class Main {
    public static void main(String[] args) {
        Employee john = new Employee("John", new FullShiftStrategy());
        john.trackTime();

        john.setStrategy(new FlexibleHoursStrategy());
        john.trackTime();

        john.setStrategy(new RemouteWorkStrategy());
        john.trackTime();
    }
}