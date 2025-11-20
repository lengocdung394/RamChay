package iuh.fit.se.ramchaybe.services.impl;

import iuh.fit.se.ramchaybe.entities.Customer;
import iuh.fit.se.ramchaybe.repositories.CustomerRepository;
import iuh.fit.se.ramchaybe.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Override
    @PreAuthorize("hasRole('CUSTOMER')")
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
}
