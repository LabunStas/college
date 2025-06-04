package org.college.practise.task1.task3;

public class InsertCommand extends  AbstractCommand{
    private String _text;
    private WindowController _windowToInsert;

    @Override
    public void execute() {
        System.out.println("Insert executed");
    }

    @Override
    public void undo() {
        System.out.println("Insert undone");
    }
}