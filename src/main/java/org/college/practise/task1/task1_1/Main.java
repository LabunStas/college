package org.college.practise.task1.task1_1;

public class Main {
    public static void main(String[] args) {
        WorkLog log = new WorkLog("IT Відділ");

        Employee emp1 = new Employee("Іван Петренко", 1, "Програміст");
        Employee emp2 = new Employee("Марія Іванова", 2, "Тестувальник");
        Employee emp3 = new Employee("Олег Смирнов", 03, "Адмін");

        log.addHours(emp1, 40);
        log.addHours(emp2, 38);
        log.addHours(emp3, 45);
        System.out.println(log.getEmployeeHours(emp1));
        System.out.println();
        System.out.println(log.getEmployeeHours(emp2));
        System.out.println();
        System.out.println(log.getEmployeeHours(emp3));
        System.out.println();
        log.updateHours(emp2, 42);
        log.removeEmployee(emp3);
        System.out.println("Олег Смирнов звільнився");
        System.out.println();

        System.out.println(emp1);
        System.out.println();
        System.out.println(log.getEmployeeHours(emp2));
        System.out.println();
        System.out.println("Кількість працівників у логах: " + log.getEmployeeCount());
        System.out.println();

        System.out.println("Відділ: " + log.getDepartment());
        System.out.println();
        System.out.println(log.toString());
    }
}
