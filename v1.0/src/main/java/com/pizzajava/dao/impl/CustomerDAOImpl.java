package main.java.com.pizzajava.dao.impl;

import main.java.com.pizzajava.dao.CustomerDAO;
import main.java.com.pizzajava.database.DataBaseException;
import main.java.com.pizzajava.model.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Classe que implementa os métodos da interface CustomerDAO. Métodos para a manipulação de registros de customers (clientes) no banco de dados.
 *
 * @author Antonio Marinho e João Guedes.
 */
public class CustomerDAOImpl implements CustomerDAO {
    
    private final Connection CONNECTION;

    public CustomerDAOImpl(Connection connection) {
        this.CONNECTION = connection;
    }
    
    @Override
    public void save(Customer customer) throws DataBaseException {
        if (customer.getId() == null) {
            this.insert(customer);
        }
        else {
            this.update(customer);
        }
    }

    private void insert(Customer customer) throws DataBaseException {
        String sql = "INSERT INTO `customers` (`cpf`, `first_name`, `last_name`) VALUES (?,?,?)";
        try {
            try (PreparedStatement stmt = this.CONNECTION.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                stmt.setString(1,customer.getCpf());
                stmt.setString(2,customer.getFirstName());
                stmt.setString(3,customer.getLastName());
                if (stmt.executeUpdate() > 0) {
                    ResultSet rs = stmt.getGeneratedKeys();
                    if(rs.next()) {
                        customer.setId(rs.getLong(1));
                    }
                }
            }
        }
        catch (SQLException e) {
            throw new DataBaseException("ERROR: customer not inserted!");
        }
    }
    
    private void update(Customer customer) throws DataBaseException{
        String sql = "UPDATE `customers` SET `first_name`= ?, `last_name`= ? WHERE `id` = ?";
        try {
            try (PreparedStatement stmt = CONNECTION.prepareStatement(sql)) {
                stmt.setString(1,customer.getFirstName());
                stmt.setString(2,customer.getLastName());
                stmt.setLong(3, customer.getId());
                stmt.executeUpdate();
            }
        }
        catch (SQLException e){
            throw new DataBaseException("ERROR: customer not updated!");
        }
    }

    private Customer find(Object key, String sql) throws DataBaseException {
        try{
            Customer customer = null;
            try (PreparedStatement stmt = CONNECTION.prepareStatement(sql)) {
                if (key instanceof Long id) {
                    stmt.setLong(1, id);
                }
                else if (key instanceof String cpf) {
                    stmt.setString(1, cpf);
                }
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    customer = new Customer();
                    customer.setId(rs.getLong("id"));
                    customer.setCpf(rs.getString("cpf"));
                    customer.setFirstName(rs.getString("first_name"));
                    customer.setLastName(rs.getString("last_name"));
                }
            }
            return customer;
        }
        catch (SQLException e) {
            throw new DataBaseException("ERROR: Customer not found!");
        }
    }

    @Override
    public Customer findById(Long id) throws DataBaseException{
        String sql = "SELECT * FROM `customers` WHERE `id` = ?";
        return this.find(id,sql);
    }

    @Override
    public Customer findByCpf(String cpf) throws DataBaseException {
        String sql = "SELECT * FROM `customers` WHERE `cpf` = ?";
        return this.find(cpf,sql);
    }

    @Override
    public void delete(Customer customer) throws DataBaseException {
        String sql = "DELETE FROM `customers` WHERE `id` = ?";
        try {
            try (PreparedStatement stmt = CONNECTION.prepareStatement(sql)) {
                stmt.setLong(1,customer.getId());
                stmt.executeUpdate();
            }
        } 
        catch (SQLException e){
            throw new DataBaseException("ERROR: undeleted customer!");
        }
    }
    
}