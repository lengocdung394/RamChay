package iuh.fit.se.ramchaybe.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;
@Entity
@Table(name = "categories")
public class Category {
    @Id
    private int categoryId;
    private String categoryName;
    private String description;

    @OneToMany(mappedBy = "category")
    private List<Product> products;

    public Category(int categoryId, String categoryName, String description) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.description = description;
    }

    public Category() {
    }
}
