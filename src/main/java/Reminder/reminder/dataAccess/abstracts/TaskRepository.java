package Reminder.reminder.dataAccess.abstracts;

import Reminder.reminder.entites.concretes.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}