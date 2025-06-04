package org.college.practise.task1.task3.task3_1;

import java.util.ArrayList;

public class WorkTimeController {
    private ArrayList<AbstractCommand> _commandsToExecute = new ArrayList<>();
    private ArrayList<AbstractCommand> _commandsHistory = new ArrayList<>();

    public void addCommand(AbstractCommand command){
        _commandsToExecute.add(command);
    }

    public void executeAllPendingCommands(){
        for (AbstractCommand command : new ArrayList<>(_commandsToExecute)) {
            command.execute();
            _commandsHistory.add(command);
        }
        _commandsToExecute.clear();
    }

    public void undoChanges(int changesToUndo) {
        for (int i = 0; i < changesToUndo && !_commandsHistory.isEmpty(); i++) {
            AbstractCommand command = _commandsHistory.remove(_commandsHistory.size() - 1);
            command.undo();
        }
    }
}