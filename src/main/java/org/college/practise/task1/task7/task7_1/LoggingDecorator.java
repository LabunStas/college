package org.college.practise.task1.task7.task7_1;

public class LoggingDecorator extends WorkTimeDecorator {
    public LoggingDecorator(WorkTime wrapped) {
        super(wrapped);
    }

    @Override
    public void track(String employeeName) {
        System.out.println("[LOG] Початок відстеження для " + employeeName);
        super.track(employeeName);
        System.out.println("[LOG] Завершено відстеження для " + employeeName);
    }
}