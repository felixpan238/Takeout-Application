package can.felix.learning.application.takeout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

//    private String getInsertStatement(OrderDetail orderDetail){
//        return ("INSERT INTO ordered_details VALUES(null,'" + orderDetail.getOrderId() + "','" +
//                orderDetail.getMenuItemId() + "');");
//    }
//
//    private String getUpdateStatement(OrderDetail orderDetail){
//        return ("UPDATE ordered_details SET " +
//                "order_id = '" + orderDetail.getOrderId() +
//                "', menu_item_id = '" + orderDetail.getMenuItemId() +
//                "' WHERE id = " + orderDetail.getId() + ";");
//    }
//
//    private String getDeleteStatement(int id){
//        return ("DELETE FROM ordered_details WHERE id = " + id + ";");
//    }
//
//    private String getSelectOrderDetailsQueryStatement(){
//        return ("SELECT * FROM ordered_details;");
//    }
//
//    private String getOrderDetailByIdQueryStatement( String id){
//        return ("SELECT * FROM ordered_details WHERE id = " + id + ";");
//    }

    public List<OrderDetail> getAllOrderDetails(){
        List<OrderDetail> fullList = new ArrayList<>();
        orderDetailRepository.findAll().forEach(fullList::add);
        return fullList;


//        List<OrderDetail> fullList = new ArrayList<>();
//        MySQLAccess dao = new MySQLAccess();
//
//        try {
//            dao.connectToDatabase();
//
//            // Selects full table of customers
//            ResultSet resultSet = dao.querySQLStatement(this.getSelectOrderDetailsQueryStatement());
//            while (resultSet.next()) {
//                fullList.add(new OrderDetail(
//                        resultSet.getInt("id"),
//                        resultSet.getInt("order_id"),
//                        resultSet.getInt("menu_item_id")
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

    public OrderDetail getOrderDetailById(int id){
        OrderDetail orderDetail;
        orderDetail = orderDetailRepository.findOne(id);
        return orderDetail;

//        OrderDetail orderDetail = null;
//        MySQLAccess dao = new MySQLAccess();
//
//        try {
//            dao.connectToDatabase();
//
//            // Selects full table of menu items
//            ResultSet resultSet = dao.querySQLStatement(this.getOrderDetailByIdQueryStatement(id));
//            if (resultSet.next()) {
//                orderDetail = (new OrderDetail(
//                        resultSet.getInt("id"),
//                        resultSet.getInt("order_id"),
//                        resultSet.getInt("menu_item_id")
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
//        return orderDetail;
    }

    public void insertOrderDetail(OrderDetail orderDetail){
        orderDetailRepository.save(orderDetail);

//        MySQLAccess dao = new MySQLAccess();
//
//        try {
//            dao.connectToDatabase();
//            dao.updateSQLStatement(this.getInsertStatement(orderDetail));
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

    public void updateOrderDetail(OrderDetail orderDetail){
        orderDetailRepository.save(orderDetail);

//        MySQLAccess dao = new MySQLAccess();
//
//        try {
//            dao.connectToDatabase();
//            dao.updateSQLStatement(this.getUpdateStatement(orderDetail));
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

    public void deleteOrderDetail(int id){
        orderDetailRepository.delete(id);
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
