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
public class Reminder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reminderId;

    @ManyToOne
    @JoinColumn(name = "taskId", nullable = false)
    private Task task;

    private LocalDateTime reminderDateTime;
}
