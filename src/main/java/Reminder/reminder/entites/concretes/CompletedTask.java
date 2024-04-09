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
public class CompletedTask {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long completedTaskId;

    @OneToOne
    @JoinColumn(name = "taskId", nullable = false)
    private Task task;

    private LocalDateTime completionDateTime;
}
