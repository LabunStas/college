package org.college.practise.task1.task5.task5_1;

public abstract class RequestHandler {
    protected RequestHandler _next;

    public void setNext(RequestHandler next) {
        this._next = next;
    }

    public abstract void handleRequest(WorkRequest request);
}