package iuh.fit.se.ramchaybe.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    Long id;

    @Column(name = "full_name")
    String fullName;

    String phone;

    String address;

    @OneToOne
    @JoinColumn(name = "user_id")
    User user;
}
