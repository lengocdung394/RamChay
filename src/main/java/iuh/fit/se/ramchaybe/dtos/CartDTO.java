package iuh.fit.se.ramchaybe.dtos;

import java.time.LocalDateTime;

public class CartDTO {
    private int cardId;
    private CustomerDTO customer;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public CartDTO(int cardId, CustomerDTO customer, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.cardId = cardId;
        this.customer = customer;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
