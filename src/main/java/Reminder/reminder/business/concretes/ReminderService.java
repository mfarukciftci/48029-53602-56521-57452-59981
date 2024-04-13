package Reminder.reminder.business.concretes;

import Reminder.reminder.business.abstracts.IReminderService;
import Reminder.reminder.dataAccess.abstracts.ReminderRepository;
import Reminder.reminder.entites.concretes.Reminder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReminderService implements IReminderService {

    private final ReminderRepository reminderRepository;

    @Autowired
    public ReminderService(ReminderRepository reminderRepository) {
        this.reminderRepository = reminderRepository;
    }

    @Override
    public Reminder saveReminder(Reminder reminder) {
        return reminderRepository.save(reminder);
    }

    @Override
    public void deleteReminder(Long reminderId) {
        reminderRepository.deleteById(reminderId);
    }

    @Override
    public List<Reminder> findAllReminders() {
        return reminderRepository.findAll();
    }

    @Override
    public Reminder findReminderById(Long id) {
        return reminderRepository.findById(id).orElse(null);
    }
}