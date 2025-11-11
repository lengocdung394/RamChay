package iuh.fit.se.ramchaybe.dtos;

public class ProductDTO {
    private int productId;
    private String name;
    private String description;
    private double price;
    private int stock;
    private CategoryDTO category;

    public ProductDTO(int productId, String name, String description, double price, int stock, CategoryDTO category) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }
}
