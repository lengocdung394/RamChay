package iuh.fit.se.ramchaybe.services.impl;

import iuh.fit.se.ramchaybe.entities.Role;
import iuh.fit.se.ramchaybe.exception.AppException;
import iuh.fit.se.ramchaybe.exception.ErrorCode;
import iuh.fit.se.ramchaybe.repositories.RoleRepository;
import iuh.fit.se.ramchaybe.services.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    @Override
    public Role findByName(String name) {
        return roleRepository.findByName(name)
                .orElseThrow(() -> new AppException(ErrorCode.ROLE_NOT_FOUND));
    }
}
