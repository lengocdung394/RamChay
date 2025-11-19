package iuh.fit.se.ramchaybe.controllers;

import iuh.fit.se.ramchaybe.dtos.request.CustomerRegistrationRequest;
import iuh.fit.se.ramchaybe.dtos.response.ApiResponse;
import iuh.fit.se.ramchaybe.dtos.response.CustomerRegistrationResponse;
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
}
