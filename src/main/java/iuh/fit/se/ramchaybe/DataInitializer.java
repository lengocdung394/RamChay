package iuh.fit.se.ramchaybe;

import iuh.fit.se.ramchaybe.entities.Permission;
import iuh.fit.se.ramchaybe.entities.Role;
import iuh.fit.se.ramchaybe.repositories.PermissionRepository;
import iuh.fit.se.ramchaybe.repositories.RoleRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
    private final RoleRepository roleRepository;
    private final PermissionRepository permissionRepository;

    @Override
    public void run(String... args) throws Exception {
        // khởi tạo manager trong đây
    }
}
