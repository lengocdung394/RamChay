package iuh.fit.se.ramchaybe.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Cart {
    @Id
    private int cardId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    private List<CartItem> cartItems;

    public Cart(int cardId, Customer customer, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.cardId = cardId;
        this.customer = customer;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Cart() {
    }
}
