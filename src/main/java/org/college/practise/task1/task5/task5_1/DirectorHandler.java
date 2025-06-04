package org.college.practise.task1.task5.task5_1;

public class DirectorHandler extends RequestHandler {
    @Override
    public void handleRequest(WorkRequest request) {
        System.out.println("Директор: Розглянув запит \"" + request.getRequestType() + "\" від " + request.getEmployeeName());
    }
}