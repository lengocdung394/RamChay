package iuh.fit.se.ramchaybe.services;

import iuh.fit.se.ramchaybe.entities.Role;

public interface RoleService {
    Role findByName(String name);
}
