package iuh.fit.se.ramchaybe.services.impl;

import iuh.fit.se.ramchaybe.entities.User;
import iuh.fit.se.ramchaybe.exception.AppException;
import iuh.fit.se.ramchaybe.exception.ErrorCode;
import iuh.fit.se.ramchaybe.repositories.UserRepository;
import iuh.fit.se.ramchaybe.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new AppException(ErrorCode.USERNAME_NOT_FOUND));
    }
}
