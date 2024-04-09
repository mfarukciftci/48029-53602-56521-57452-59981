package Reminder.reminder.dataAccess.abstracts;

import Reminder.reminder.entites.concretes.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    // Özel sorgularınızı buraya ekleyebilirsiniz.
}
