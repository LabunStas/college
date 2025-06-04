package org.college.practise.task1.task3.task3_1;

public class Main {
    public static void main(String[] args){
        WorkTimeController controller = new WorkTimeController();
        AbstractCommand startShift = new StartShiftCommand();
        AbstractCommand endShift = new EndShiftCommand();
        AbstractCommand breakCommand = new BreakCommand();

        controller.addCommand(startShift);
        controller.addCommand(breakCommand);
        controller.executeAllPendingCommands();

        controller.addCommand(endShift);
        controller.executeAllPendingCommands();

        controller.undoChanges(2);
    }
}