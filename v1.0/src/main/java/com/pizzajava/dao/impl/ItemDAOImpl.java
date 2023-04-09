package main.java.com.pizzajava.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import main.java.com.pizzajava.dao.ItemDAO;
import main.java.com.pizzajava.database.DataBaseException;
import main.java.com.pizzajava.model.Customer;
import main.java.com.pizzajava.model.Item;
import main.java.com.pizzajava.model.Order;
import main.java.com.pizzajava.model.Product;

/**
 * Classe que implementa os métodos da interface ItemDAO. Métodos para a manipulação de registros de items (itens) no banco de dados.
 *
 * @author Antonio Marinho e João Guedes.
 */
public class ItemDAOImpl implements ItemDAO {
    
    private final Connection CONNECTION;
    
    public ItemDAOImpl(Connection connection) {
        this.CONNECTION = connection;
    }
    
    @Override
    public void save(Item item) throws DataBaseException {        
        String sql = "INSERT INTO `items` (`name`, `quantity`, `product_id`, `order_id`) VALUES (?,?,?,?)";
        try {
            try (PreparedStatement stmt = CONNECTION.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
                stmt.setString(1, item.getName());
                stmt.setInt(2,item.getQuantity());
                stmt.setLong(3,item.getProduct().getId());
                stmt.setLong(4,item.getOrder().getId());
                if(stmt.executeUpdate() > 0) {
                    ResultSet rs = stmt.getGeneratedKeys();
                    if(rs.next()) {
                        item.setId(rs.getLong(1));
                    }
                }
            }
        }
        catch (SQLException e) {
            throw new RuntimeException("ERROR: Item not inserted!");
        }
    }
    
    @Override
    public List<Item> findAllByOrderId(Long orderId) throws DataBaseException {
        List<Item> items = new ArrayList<>();
        //String sql = "SELECT * FROM `items` INNER JOIN `products` INNER JOIN `orders` INNER JOIN `customers` ON product_id = products.id AND `order_id` = orders.id AND `customer_id` = customers.id WHERE items.order_id = ?";
        String sql = "SELECT * FROM `items` INNER JOIN `products` ON product_id = products.id INNER JOIN `orders` ON `order_id` = orders.id INNER JOIN `customers` ON `customer_id` = customers.id WHERE items.order_id = ?";
        try {
            try (PreparedStatement stmt = CONNECTION.prepareStatement(sql)) {
                stmt.setLong(1,orderId);
                ResultSet rs = stmt.executeQuery();
                Customer customer;
                Product product;
                Order order;
                Item item;
                while (rs.next()) {
                    customer = new Customer();
                    customer.setId(rs.getLong("customers.id"));
                    customer.setCpf(rs.getString("cpf"));
                    customer.setFirstName(rs.getString("first_name"));
                    customer.setLastName(rs.getString("last_name"));
                    product = new Product();
                    product.setId(rs.getLong("products.id"));
                    product.setCode(rs.getString("code"));
                    product.setName(rs.getString("products.name"));
                    product.setDescription("description");
                    product.setSize(rs.getString("size"));
                    product.setUnitPrice(rs.getDouble("unit_price"));
                    order = new Order();
                    order.setId(rs.getLong("orders.id"));
                    order.setDate(rs.getDate("date"));
                    order.setTotalPrice(rs.getDouble("total_price"));
                    order.setCustomer(customer);
                    item = new Item();
                    item.setId(rs.getLong("items.id"));
                    item.setName(rs.getString("items.name"));
                    item.setQuantity(rs.getInt("quantity"));
                    item.setProduct(product);
                    item.setOrder(order);
                    items.add(item);
                }
            }
            return items;
        }
        catch (SQLException e) {
            e.printStackTrace();
            throw new DataBaseException("ERROR: Items not found!");
        }
    }
    
}