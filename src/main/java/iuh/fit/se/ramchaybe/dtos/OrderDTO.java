package iuh.fit.se.ramchaybe.dtos;

import java.time.LocalDateTime;

public class OrderDTO {
    private int orderId;
    private LocalDateTime orderDate;
    private double total;
    private OrderStatusDTO orderStatus;
    private PaymentMethodDTO paymentMethod;
    private String shippingAddress;

    public OrderDTO(int orderId, LocalDateTime orderDate, double total, OrderStatusDTO orderStatus, PaymentMethodDTO paymentMethod, String shippingAddress) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.total = total;
        this.orderStatus = orderStatus;
        this.paymentMethod = paymentMethod;
        this.shippingAddress = shippingAddress;
    }
}
