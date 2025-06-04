package org.college.practise.task1.task3.task3_1;

class EndShiftCommand extends AbstractCommand {
    @Override
    public void execute() {
        System.out.println("End of shift recorded.");
    }

    @Override
    public void undo() {
        System.out.println("End of shift canceled.");
    }
}