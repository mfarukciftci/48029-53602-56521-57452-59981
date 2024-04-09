package Reminder.reminder.entites.concretes;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Settings {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long settingsId;

    @OneToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    private String theme;
    private LocalDateTime defaultReminderTime;
    private Long defaultCategory; // This could be a reference to a Category entity
}
