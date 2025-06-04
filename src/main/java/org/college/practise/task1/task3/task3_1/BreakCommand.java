package org.college.practise.task1.task3.task3_1;

public class BreakCommand extends AbstractCommand {
    @Override
    public void execute() {
        System.out.println("Break started.");
    }

    @Override
    public void undo() {
        System.out.println("Break canceled.");
    }
}
