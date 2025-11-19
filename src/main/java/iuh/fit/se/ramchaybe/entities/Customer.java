package iuh.fit.se.ramchaybe.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "customers")
@PrimaryKeyJoinColumn(name = "customer_id") //  tạo bảng riêng với tên key customer_id
public class Customer extends User { // Subclass
    @Column(name = "full_name")
    String fullName;
    String phone;
    String address;
}
