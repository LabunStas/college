package org.college.practise.task1.task9.task9_1;

public class Main {
    public static void main(String[] args) {
        WorkTime workTime = new WorkTimeProxy("Olena");

        workTime.track("Olena");  // OK
        workTime.track("Petro");  // Access denied
    }
}
