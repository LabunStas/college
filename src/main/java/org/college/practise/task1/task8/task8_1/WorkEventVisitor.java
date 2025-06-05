package org.college.practise.task1.task8.task8_1;

public interface WorkEventVisitor {
    void visit(StartShift event);
    void visit(Break event);
    void visit(EndShift event);
}