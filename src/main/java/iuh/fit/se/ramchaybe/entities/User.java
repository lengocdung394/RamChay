package iuh.fit.se.ramchaybe.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
@Entity
public class User {
    @Id
    private int userId;
    private String name;
    private String password;
    private boolean isActive;
    private LocalDate date;
    @ManyToMany
    @JoinTable(
            name="user_role",  joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> roles;
    public User(int userId, String name, String password, boolean isActive, LocalDate date) {
        this.userId =  userId;
        this.name = name;
        this.password = password;
        this.isActive = isActive;
        this.date = date;
    }

    public User() {
    }
}
