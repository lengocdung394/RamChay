package iuh.fit.se.ramchaybe.controllers;

import com.nimbusds.jose.JOSEException;
import iuh.fit.se.ramchaybe.dtos.request.CustomerRegistrationRequest;
import iuh.fit.se.ramchaybe.dtos.request.LoginRequest;
import iuh.fit.se.ramchaybe.dtos.response.ApiResponse;
import iuh.fit.se.ramchaybe.dtos.response.CustomerRegistrationResponse;
import iuh.fit.se.ramchaybe.dtos.response.LoginResponse;
import iuh.fit.se.ramchaybe.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/register")
    public ApiResponse<CustomerRegistrationResponse> register(@RequestBody CustomerRegistrationRequest request) {
        return ApiResponse.<CustomerRegistrationResponse>builder()
                .result(authService.register(request))
                .build();
    }

    @PostMapping("/login")
    public ApiResponse<LoginResponse> login(@RequestBody LoginRequest request) throws JOSEException {
        return ApiResponse.<LoginResponse>builder()
                .result(authService.login(request))
                .build();
    }
}
