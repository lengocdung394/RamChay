package iuh.fit.se.ramchaybe.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "cart_item")
public class CartItem {
    @Id
    private int cartItemId;
    private int quantity;
    private double unitPrice;
    private double subtotal;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;


    public CartItem(int cartItemId, int quantity, double unitPrice, double subtotal) {
        this.cartItemId = cartItemId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.subtotal = subtotal;
    }

    public CartItem() {}
}
