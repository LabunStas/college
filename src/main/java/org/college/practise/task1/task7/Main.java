package org.college.practise.task1.task7;

public class Main {
    public static void main(String[] args) {
        NotificationWrapper wrapper = new EmailWrapper(null, "12345@gmail.com");

        if (System.getProperty("os.name").toLowerCase().contains("linux")) {
            wrapper = new SystemLogWrapper(wrapper, "LinuxJournal");
        }

        boolean hasTelegram = true;
        if (hasTelegram) {
            wrapper = new TelegrammWrapper(wrapper, "User12345", true);
        }

        String phoneNumber = "+123456789";
        if (phoneNumber != null) {
            wrapper = new PhoneWrapper(wrapper, phoneNumber);
        }
        SystemController sysController = new SystemController(wrapper);
        sysController.addAlert(new SystemAlert(AlertSeverity.CRITICAL, "System Overheat!", "ThermalSensor"));
        sysController.addAlert(new SystemAlert(AlertSeverity.WARNING, "Disk Space Low", "DiskMonitor"));
    }
}