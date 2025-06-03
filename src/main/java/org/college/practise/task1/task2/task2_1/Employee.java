package org.college.practise.task1.task2.task2_1;

public class Employee {
    private String _name;
    private String _position;
    private int _id;

    public Employee(String name, String position, int id) {
        this._name = name;
        this._position = position;
        this._id = id;
    }

    public String getName() { return _name; }
    public String getPosition() { return _position; }
    public int getId() { return _id; }

    @Override
    public String toString() {
        return _name + " (" + _position + ", ID: " + _id + ")";
    }
}
