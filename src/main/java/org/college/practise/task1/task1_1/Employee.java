package org.college.practise.task1.task1_1;

public class Employee {
    private String _name;
    private String _position;
    private int _id;

    public Employee(String name, int id, String position) {
        this._name = name;
        this._id = id;
        this._position = position;
    }

    public String getName() {
        return _name;
    }

    public int getId() {
        return _id;
    }

    public String getPosition() {
        return _position;
    }

    @Override
    public String toString() {
        return "Employee: name='" + _name + "', id=" + _id + ", position='" + _position + "'";
    }
}