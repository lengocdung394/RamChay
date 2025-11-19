package iuh.fit.se.ramchaybe.controllers;

import iuh.fit.se.ramchaybe.dtos.request.CustomerRegistrationRequest;
import iuh.fit.se.ramchaybe.dtos.response.ApiResponse;
import iuh.fit.se.ramchaybe.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin(origins = "*")
public class CustomerController {
}
