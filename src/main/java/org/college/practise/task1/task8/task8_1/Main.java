package org.college.practise.task1.task8.task8_1;

public class Main {
    public static void main(String[] args) {
        WorkEvent[] events = {
                new StartShift("Іван"),
                new Break(15),
                new EndShift("Іван")
        };

        WorkEventLogger logger = new WorkEventLogger();

        for (WorkEvent event : events) {
            event.accept(logger);
        }
    }
}