package can.felix.learning.application.takeout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

//    private String getInsertStatement(Order order){
//        System.out.println("INSERT INTO orders VALUES(null,'" + order.getCustomerId() + "','" + order.getDateTime() +
//                "','" + (order.isPaidStatus()?1:0) + "','"+ (order.isPickupStatus()?1:0) +"');");
//        return ("INSERT INTO orders VALUES(null,'" + order.getCustomerId() + "','" + order.getDateTime() +
//                "','" + (order.isPaidStatus()?1:0) + "','"+ (order.isPickupStatus()?1:0) +"');");
//    }
//
//    private String getUpdateStatement(Order order){
//        return ("UPDATE orders SET " +
//                "customer_id = '" + order.getCustomerId() +
//                "', date_time = '" + order.getDateTime() +
//                "', paid_status = '" + (order.isPaidStatus()?1:0) +
//                "', pickup_status = '" + (order.isPickupStatus()?1:0) +
//                "' WHERE id = " + order.getId() + ";");
//    }
//
//    private String getDeleteStatement(int id){
//        return ("DELETE FROM orders WHERE id = " + id + ";");
//    }
//
//    private String getSelectOrdersQueryStatement(){
//        return ("SELECT * FROM orders;");
//    }
//
//    private String getOrderByIdQueryStatement( String id){
//        return ("SELECT * FROM orders WHERE id = " + id + ";");
//    }

    public List<Order> getAllOrders(){
        List<Order> fullList = new ArrayList<>();
        orderRepository.findAll().forEach(fullList::add);
        return fullList;

//        List<Order> fullList = new ArrayList<>();
//        MySQLAccess dao = new MySQLAccess();
//
//        try {
//            dao.connectToDatabase();
//
//            // Selects full table of customers
//            ResultSet resultSet = dao.querySQLStatement(this.getSelectOrdersQueryStatement());
//            while (resultSet.next()) {
//                fullList.add(new Order(
//                        resultSet.getInt("id"),
//                        resultSet.getInt("customer_id"),
//                        resultSet.getTimestamp("date_time"),
//                        resultSet.getBoolean("paid_status"),
//                        resultSet.getBoolean("pickup_status")
//                ));
//            }
//
//        }catch (Exception e) {
//            // do nothing
//        }finally {
//            try {
//                dao.closeConnectionToDatabase();
//            } catch (Exception e) {
//                // do nothing
//            }
//
//        }
//        return fullList;
    }

    public Order getOrderById(int id){
        Order order;
        order = orderRepository.findOne(id);
        return order;

//        Order order = null;
//        MySQLAccess dao = new MySQLAccess();
//
//        try {
//            dao.connectToDatabase();
//
//            // Selects full table of menu items
//            ResultSet resultSet = dao.querySQLStatement(this.getOrderByIdQueryStatement(id));
//            if (resultSet.next()) {
//                order = new Order(
//                        resultSet.getInt("id"),
//                        resultSet.getInt("customer_id"),
//                        resultSet.getTimestamp("date_time"),
//                        resultSet.getBoolean("paid_status"),
//                        resultSet.getBoolean("pickup_status")
//                );
//            }
//
//        }catch (Exception e) {
//            // do nothing
//        }finally {
//            try {
//                dao.closeConnectionToDatabase();
//            } catch (Exception e) {
//                // do nothing
//            }
//
//        }
//
//        return order;
    }

    public void insertOrder(Order order){
        orderRepository.save(order);

//        MySQLAccess dao = new MySQLAccess();
//
//        try {
//            dao.connectToDatabase();
//            dao.updateSQLStatement(this.getInsertStatement(order));
//
//        }catch (Exception e) {
//            // do nothing
//        }finally {
//            try {
//                dao.closeConnectionToDatabase();
//            } catch (Exception e) {
//                // do nothing
//            }
//
//        }
    }

    public void updateOrder(Order order){
        orderRepository.save(order);

//        MySQLAccess dao = new MySQLAccess();
//
//        try {
//            dao.connectToDatabase();
//            dao.updateSQLStatement(this.getUpdateStatement(order));
//
//        }catch (Exception e) {
//            // do nothing
//        }finally {
//            try {
//                dao.closeConnectionToDatabase();
//            } catch (Exception e) {
//                // do nothing
//            }
//
//        }
    }

    public void deleteOrder(int id){
        orderRepository.delete(id);

//        MySQLAccess dao = new MySQLAccess();
//
//        try {
//            dao.connectToDatabase();
//            dao.updateSQLStatement(this.getDeleteStatement(id));
//
//        }catch (Exception e) {
//            // do nothing
//        }finally {
//            try {
//                dao.closeConnectionToDatabase();
//            } catch (Exception e) {
//                // do nothing
//            }
//
//        }
    }
}
