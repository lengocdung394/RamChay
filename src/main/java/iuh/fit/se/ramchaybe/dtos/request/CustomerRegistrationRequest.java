package iuh.fit.se.ramchaybe.dtos.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerRegistrationRequest {
    String username;
    String password; // plain password
    String fullName;
    String phone;
}
