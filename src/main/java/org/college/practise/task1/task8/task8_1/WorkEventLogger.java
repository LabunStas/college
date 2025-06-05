package org.college.practise.task1.task8.task8_1;

public class WorkEventLogger implements WorkEventVisitor {
    public void visit(StartShift event) {
        System.out.println(" Початок зміни для працівника: " + event.getEmployeeName());
    }
    public void visit(Break event) {
        System.out.println("Перерва на " + event.getMinutes() + " хвилин");
    }
    public void visit(EndShift event) {
        System.out.println(" Кінець зміни для працівника: " + event.getEmployeeName());
    }
}