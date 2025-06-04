package org.college.practise.task1.task4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        SystemAlert alert = new SystemAlert(AlertSeverity.ERROR, "CPU Overload", 1001, LocalDate.now(), "CPU");
        SystemController controller = new SystemController();

        EmailNotifier emailNotifier = new EmailNotifier("21234124werqD@example.com");
        SystemLogNotifier sysLogNotifier = new SystemLogNotifier("system log");
        PhoneNotifier phoneNotifier = new PhoneNotifier("+3801234567");
        TelegramNotifier telegramNotifier = new TelegramNotifier("user1", true);

        controller.subscribe(emailNotifier);
        controller.subscribe(sysLogNotifier);
        controller.subscribe(phoneNotifier);
        controller.subscribe(telegramNotifier);

        controller.informAlert();
        controller.addAlert(alert);
        controller.informAlert();

    }
}