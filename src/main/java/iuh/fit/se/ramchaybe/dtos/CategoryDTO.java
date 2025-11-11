package iuh.fit.se.ramchaybe.dtos;

public class CategoryDTO {
    private int categoryId;
    private String categoryName;
    private String description;

    public CategoryDTO(int categoryId, String categoryName, String description) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.description = description;
    }
}
