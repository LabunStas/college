package org.college.practise.task1.task5.task5_1;

public class WorkRequest {
    private String _employeeName;
    private String _requestType;

    public WorkRequest(String employeeName, String requestType) {
        this._employeeName = employeeName;
        this._requestType = requestType;
    }

    public String getEmployeeName() {
        return _employeeName;
    }

    public String getRequestType() {
        return _requestType;
    }
}