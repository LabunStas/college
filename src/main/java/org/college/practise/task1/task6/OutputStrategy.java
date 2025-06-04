package org.college.practise.task1.task6;

public interface OutputStrategy {
    void printReport(Document document);
    void sendReportViaMail(Document document);
    void sendReportViaTelegram(Document document);
}