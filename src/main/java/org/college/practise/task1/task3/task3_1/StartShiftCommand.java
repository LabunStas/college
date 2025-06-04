package org.college.practise.task1.task3.task3_1;

class StartShiftCommand extends AbstractCommand {
    @Override
    public void execute() {
        System.out.println("Start of shift recorded.");
    }

    @Override
    public void undo() {
        System.out.println("Start of shift canceled.");
    }
}