package org.college.practise.task1.task6;

public class AndroidOutputStrategy implements OutputStrategy {
    @Override
    public void printReport(Document document) {
        System.out.println("Printing report on Android: " + document.getDocumentName());
    }

    @Override
    public void sendReportViaMail(Document document) {
        System.out.println("Sending report via mail on Android: " + document.getDocumentName());
    }

    @Override
    public void sendReportViaTelegram(Document document) {
        System.out.println("Sending report via Telegram on Android: " + document.getDocumentName());
    }
}