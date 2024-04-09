package Reminder.reminder.entites.concretes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long userId;
        private String username;
        private String password; // Not: Şifreleri güvenli bir şekilde saklamak için uygun bir strateji kullanın.
        private String email;
        private LocalDateTime registrationDate;
}
