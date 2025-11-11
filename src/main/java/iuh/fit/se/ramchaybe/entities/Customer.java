package iuh.fit.se.ramchaybe.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    private int customerId;
    private String fullName;
    private String phone;
    private String address;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Customer(int customerId, String fullName, String phone, String address) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
    }

    public Customer() {
    }
}
