package org.college.practise.task1.task5.task5_1;

public class Main {
    public static void main(String[] args) {
        RequestHandler hr = new HrHandler();
        RequestHandler manager = new ManagerHandler();
        RequestHandler director = new DirectorHandler();

        hr.setNext(manager);
        manager.setNext(director);

        WorkRequest request1 = new WorkRequest("Олексій", "Зміна графіку");
        WorkRequest request2 = new WorkRequest("Ірина", "Відпустка");
        WorkRequest request3 = new WorkRequest("Тарас", "Переведення у відділ продажу");

        hr.handleRequest(request1);
        hr.handleRequest(request2);
        hr.handleRequest(request3);
    }
}