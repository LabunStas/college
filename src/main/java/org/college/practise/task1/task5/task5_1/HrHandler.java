package org.college.practise.task1.task5.task5_1;

public class HrHandler extends RequestHandler {
    @Override
    public void handleRequest(WorkRequest request) {
        if (request.getRequestType().equalsIgnoreCase("Зміна графіку")) {
            System.out.println("HR: Обробив запит від " + request.getEmployeeName());
        } else if (_next != null) {
            _next.handleRequest(request);
        }
    }
}