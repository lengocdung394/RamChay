package iuh.fit.se.ramchaybe.services;

import iuh.fit.se.ramchaybe.entities.User;

public interface UserService {
    User findByUsername(String username);
}
