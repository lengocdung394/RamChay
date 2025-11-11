package iuh.fit.se.ramchaybe.dtos;

public class CustomerDTO {
    private int customerId;
    private String fullName;
    private String phone;
    private String address;


    public CustomerDTO(int customerId, String fullName, String phone, String address) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
    }
}
