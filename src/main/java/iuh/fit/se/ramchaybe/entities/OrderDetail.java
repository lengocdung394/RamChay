package iuh.fit.se.ramchaybe.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "order_detail")
public class OrderDetail {
    @Id
    private int oderDetailId;
    private int quantity;
    private double unitPrice;
    // Mỗi chi tiết đơn hàng thuộc về 1 đơn hàng
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    // Mỗi chi tiết đơn hàng chứa 1 sản phẩm
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    public OrderDetail(int quantity, double unitPrice) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public OrderDetail() {}
}
