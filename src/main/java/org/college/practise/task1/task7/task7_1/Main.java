package org.college.practise.task1.task7.task7_1;

public class Main {
    public static void main(String[] args) {
        WorkTime base = new BasicWorkTime();
        WorkTime logged = new LoggingDecorator(base);
        WorkTime full = new OvertimeDecorator(logged);

        full.track("Іван Петров");
    }
}