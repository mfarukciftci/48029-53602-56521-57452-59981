package Reminder.reminder.business.abstracts;

import Reminder.reminder.entites.concretes.User;

import java.util.List;

public interface IUserService {
    User registerUser(User user);
    List<User> findAllUsers();
    User findUserById(Long id);
    User updateUser(User user);
    void deleteUser(Long id);
}

