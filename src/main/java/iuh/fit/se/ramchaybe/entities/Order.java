package iuh.fit.se.ramchaybe.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    private int orderId;
    private LocalDateTime orderDate;
    private double total;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
    private String shippingAddress;


    // Một khách hàng có thể có nhiều đơn hàng
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    // Một đơn hàng có nhiều chi tiết
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderDetail> orderDetails;


    public Order(int orderId, LocalDateTime orderDate, double total, OrderStatus orderStatus, PaymentMethod paymentMethod, String shippingAddress) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.total = total;
        this.orderStatus = orderStatus;
        this.paymentMethod = paymentMethod;
        this.shippingAddress = shippingAddress;
    }

    public Order() {
    }
}
