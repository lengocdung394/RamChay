package iuh.fit.se.ramchaybe.dtos;

public class OrderDetailDTO {
    private int quantity;
    private double unitPrice;

    public OrderDetailDTO(int quantity, double unitPrice) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
}
