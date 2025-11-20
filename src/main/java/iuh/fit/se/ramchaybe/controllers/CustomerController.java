package iuh.fit.se.ramchaybe.controllers;

import iuh.fit.se.ramchaybe.dtos.request.CustomerRegistrationRequest;
import iuh.fit.se.ramchaybe.dtos.response.ApiResponse;
import iuh.fit.se.ramchaybe.dtos.response.CustomerRegistrationResponse;
import iuh.fit.se.ramchaybe.entities.Customer;
import iuh.fit.se.ramchaybe.services.AuthService;
import iuh.fit.se.ramchaybe.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    public ApiResponse<List<Customer>> register() {
        return ApiResponse.<List<Customer>>builder()
                .result(customerService.getAll())
                .build();
    }
}
