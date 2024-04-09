package Reminder.reminder.dataAccess.abstracts;

import Reminder.reminder.entites.concretes.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskStatusRepository extends JpaRepository<TaskStatus, Long> {
    // Özel sorgularınızı buraya ekleyebilirsiniz.
}