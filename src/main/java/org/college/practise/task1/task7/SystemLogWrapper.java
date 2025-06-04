package org.college.practise.task1.task7;

class SystemLogWrapper extends AbsWrapper {
    private String journalName;

    public SystemLogWrapper(NotificationWrapper wrapper, String journalName) {
        super(wrapper);
        this.journalName = journalName;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("Logging to SysLog [" + journalName + "]: " + alert.getMessage());
        super.notify(alert);
    }
}