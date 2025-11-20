package iuh.fit.se.ramchaybe.dtos.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerRegistrationResponse {
    String id;
    String username;
    String fullName;
    Set<String> phones;
}
