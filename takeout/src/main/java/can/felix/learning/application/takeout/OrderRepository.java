package can.felix.learning.application.takeout;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface OrderRepository extends CrudRepository<Order, Integer> {

}
