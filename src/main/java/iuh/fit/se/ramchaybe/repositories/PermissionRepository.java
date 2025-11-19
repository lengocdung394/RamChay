package iuh.fit.se.ramchaybe.repositories;

import iuh.fit.se.ramchaybe.entities.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {
}
