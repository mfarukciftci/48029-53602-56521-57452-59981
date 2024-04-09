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
public class User {


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long userId;
        private String username;
        private String password;
        private String email;
        private LocalDateTime registrationDate;

        @OneToMany(mappedBy = "user")
        private List<Task> tasks = new ArrayList<>();
}
