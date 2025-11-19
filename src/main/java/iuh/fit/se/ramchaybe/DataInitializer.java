package iuh.fit.se.ramchaybe;

import iuh.fit.se.ramchaybe.entities.Role;
import iuh.fit.se.ramchaybe.repositories.RoleRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializer {
    private final RoleRepository roleRepository;

    @PostConstruct
    public void init() {
        // Khởi tạo các role mặc định
        if(roleRepository.count() == 0) {
            Role customerRole = Role.builder()
                    .name("CUSTOMER")
                    .description("Customer role")
                    .build();

            roleRepository.save(customerRole);

            Role managerRole = Role.builder()
                    .name("MANAGER")
                    .description("Manager role")
                    .build();

            roleRepository.save(managerRole);
        }
    }
}
