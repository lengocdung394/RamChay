package iuh.fit.se.ramchaybe.mappers;

import iuh.fit.se.ramchaybe.dtos.response.CustomerRegistrationResponse;
import iuh.fit.se.ramchaybe.entities.Customer;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface CustomerMapper {
    CustomerRegistrationResponse toCustomerRegistrationResponse(Customer customer);
}
