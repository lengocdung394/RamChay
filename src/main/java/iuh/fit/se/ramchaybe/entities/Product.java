package iuh.fit.se.ramchaybe.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    private int productId;
    private String name;
    private String description;
    private double price;
    private int stock;


    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Product(int productId, String name, String description, double price, int stock, Category category) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    public Product() {
    }
}
