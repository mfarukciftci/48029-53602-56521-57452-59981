package Reminder.reminder.business.abstracts;

import Reminder.reminder.entites.concretes.Task;

import java.util.List;

public interface ITaskService {
    Task saveTask(Task task);
    void deleteTask(Long taskId);
    List<Task> findAllTasks();
    Task findTaskById(Long id);

}
