package iuh.fit.se.ramchaybe.repositories;

import iuh.fit.se.ramchaybe.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> { // repository của sub class
}
