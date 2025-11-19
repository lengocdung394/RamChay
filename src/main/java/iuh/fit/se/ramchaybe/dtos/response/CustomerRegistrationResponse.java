package iuh.fit.se.ramchaybe.dtos.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerRegistrationResponse {
    String id;
    String username;
    String fullName;
    String phone;
}
