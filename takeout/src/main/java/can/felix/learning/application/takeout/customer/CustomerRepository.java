package can.felix.learning.application.takeout.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Optional<Customer> findById(final int id);
    List<Customer> findByFirstNameStartsWith(final String firstName);

}
