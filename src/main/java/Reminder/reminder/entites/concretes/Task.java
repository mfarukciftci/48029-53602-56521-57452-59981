package Reminder.reminder.entites.concretes;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(mappedBy = "task")
    private List<Reminder> reminders = new ArrayList<>();



    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false)
    private Category category;
}