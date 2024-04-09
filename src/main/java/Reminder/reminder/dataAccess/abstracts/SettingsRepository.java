package Reminder.reminder.dataAccess.abstracts;

import Reminder.reminder.entites.concretes.Settings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettingsRepository extends JpaRepository<Settings, Long> {
    // Özel sorgularınızı buraya ekleyebilirsiniz.
}
