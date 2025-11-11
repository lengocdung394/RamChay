package iuh.fit.se.ramchaybe.dtos;

import java.time.LocalDate;

public class UserDTO {
    private int userId;
    private String name;
    private String password;
    private boolean isActive;
    private LocalDate date;

    public UserDTO(int userId, String name, String password, boolean isActive, LocalDate date) {
        this.userId =  userId;
        this.name = name;
        this.password = password;
        this.isActive = isActive;
        this.date = date;
    }
}
