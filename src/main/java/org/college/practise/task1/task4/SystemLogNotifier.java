package org.college.practise.task1.task4;

public class SystemLogNotifier implements Observer{
    private String journalName;

    public SystemLogNotifier(String journalName) {
        this.journalName = journalName;
    }

    @Override
    public void noti_fy(SystemAlert systemAlert) {
        System.out.println("Create a new journal with name: " + journalName);

    }
}
