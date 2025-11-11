package iuh.fit.se.ramchaybe.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.List;
@Entity
@Table(name = "roles")
public class Role {
    @Id
    private  int roleId;
    private String name;
    private String description;
    @ManyToMany(mappedBy = "users")
    private List<User> users;
    public Role(int roleId, String name, String description) {
        this.roleId = roleId;
        this.name = name;
        this.description = description;
    }

    public Role() {
    }
}
