package Reminder.reminder.business.abstracts;

import Reminder.reminder.entites.concretes.Reminder;

import java.util.List;

public interface IReminderService {
    Reminder saveReminder(Reminder reminder);
    void deleteReminder(Long reminderId);
    List<Reminder> findAllReminders();
    Reminder findReminderById(Long id);
}
