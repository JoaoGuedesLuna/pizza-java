package main.java.com.pizzajava.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import main.java.com.pizzajava.dao.OrderDAO;
import main.java.com.pizzajava.database.DataBaseException;
import main.java.com.pizzajava.model.Customer;
import main.java.com.pizzajava.model.Order;

/**
 * Classe que implementa os métodos da interface OrderDAO. Métodos para a manipulação de registros de orders (pedidos) no banco de dados.
 *
 * @author Antonio Marinho e João Guedes.
 */
public class OrderDAOImpl implements OrderDAO {
    
    private final Connection CONNECTION;
    
    public OrderDAOImpl(Connection connection) {
        this.CONNECTION = connection;
    }
    
    @Override
    public void save(Order order) throws DataBaseException {
        String sql = "INSERT INTO `orders` (`total_price`, `customer_id`) VALUES (?,?)";
        try {
            try (PreparedStatement stmt = CONNECTION.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
                stmt.setDouble(1,order.getTotalPrice());
                stmt.setLong(2,order.getCustomer().getId());
                if(stmt.executeUpdate() > 0) {
                    ResultSet rs = stmt.getGeneratedKeys();
                    if(rs.next()) {
                        order.setId(rs.getLong(1));
                    }
                }
            }
        }
        catch (SQLException e) {
            throw new DataBaseException("ERROR: Order not inserted!");
        }
    }
    
    @Override
    public List<Order> findAllByCustomerId(Long customerId) throws DataBaseException {
        List<Order> orders = new ArrayList<>();
        String sql = "SELECT * FROM `orders` INNER JOIN `customers` ON `customer_id` = customers.id WHERE `customer_id` = ?";
        try {
            try (PreparedStatement stmt = CONNECTION.prepareStatement(sql)) {
                stmt.setLong(1,customerId);
                ResultSet rs = stmt.executeQuery();
                Customer customer;
                Order order;
                while (rs.next()) {
                    customer = new Customer();
                    customer.setId(rs.getLong("customers.id"));
                    customer.setCpf(rs.getString("cpf"));
                    customer.setFirstName(rs.getString("first_name"));
                    customer.setLastName(rs.getString("last_name"));
                    order = new Order();
                    order.setId(rs.getLong("orders.id"));
                    order.setDate(rs.getDate("date"));
                    order.setTotalPrice(rs.getDouble("total_price"));
                    order.setCustomer(customer);
                    orders.add(order);
                }
            }
            return orders;
        }
        catch (SQLException e) {
            throw new DataBaseException("ERROR: Orders not found!");
        }
    }
    
}