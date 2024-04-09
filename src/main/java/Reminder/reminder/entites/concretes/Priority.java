package Reminder.reminder.entites.concretes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Priority {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long priorityId;
    private String priorityLevel;
    private String description;
}
