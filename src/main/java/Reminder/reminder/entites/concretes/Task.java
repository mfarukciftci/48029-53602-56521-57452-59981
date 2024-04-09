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
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long taskId;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    private String taskName;
    private String description;
    private LocalDateTime deadline;

    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false)
    private Category category;
}