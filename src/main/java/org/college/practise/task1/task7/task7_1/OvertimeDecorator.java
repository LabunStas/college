package org.college.practise.task1.task7.task7_1;

public class OvertimeDecorator extends WorkTimeDecorator {
    public OvertimeDecorator(WorkTime wrapped) {
        super(wrapped);
    }

    @Override
    public void track(String employeeName) {
        super.track(employeeName);
        System.out.println("Розраховано овертайм для " + employeeName);
    }
}

