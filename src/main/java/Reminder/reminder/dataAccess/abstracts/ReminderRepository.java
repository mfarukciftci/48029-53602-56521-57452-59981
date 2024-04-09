package Reminder.reminder.dataAccess.abstracts;

import Reminder.reminder.entites.concretes.Reminder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReminderRepository extends JpaRepository<Reminder, Long> {

}
