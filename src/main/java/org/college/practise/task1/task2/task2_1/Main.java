package org.college.practise.task1.task2.task2_1;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Іван", "Програміст", 101);
        WorkRecord record1 = new WorkRecord("2024-06-01", 8);
        WorkRecord record2 = new WorkRecord("2024-06-02", 7);

        WorkReportBuilder builder = new WorkReportBuilder(emp);
        builder.addRecord(record1);
        builder.addRecord(record2);
        builder.setNote("Виконував задачі з проєкту *");

        WorkReport report = builder.build();
        System.out.println(report);
    }
}
