package main.java.com.pizzajava.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import main.java.com.pizzajava.dao.AddressDAO;
import main.java.com.pizzajava.database.DataBaseException;
import main.java.com.pizzajava.model.Address;
import main.java.com.pizzajava.model.Customer;

/**
 * Classe que implementa os métodos da interface AddressDAO. Métodos para a manipulação de registros de addresses (endereços) no banco de dados.
 *
 * @author Antonio Marinho e João Guedes.
 */
public class AddressDAOImpl implements AddressDAO {
    
    private final Connection CONNECTION;
    
    public AddressDAOImpl(Connection connection) {
        this.CONNECTION = connection;
    }

    @Override
    public void save(Address address) throws DataBaseException {
        if (address.getId() == null) {
            this.insert(address);
        }
        else {
            this.update(address);
        }
    }
    
    private void insert(Address address) throws DataBaseException {
        String sql = "INSERT INTO `addresses`(`street`, `number`, `complement`, `neighborhood`, `city`, `state`, `zip_code`, `country`, `customer_id`) "
                   + "VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            try (PreparedStatement stmt = CONNECTION.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                stmt.setString(1,address.getStreet());
                stmt.setInt(2,address.getNumber());
                stmt.setString(3,address.getComplement());
                stmt.setString(4,address.getNeighborhood());
                stmt.setString(5,address.getCity());
                stmt.setString(6,address.getState());
                stmt.setString(7,address.getZipCode());
                stmt.setString(8,address.getCountry());
                stmt.setLong(9,address.getCustomer().getId());
                if(stmt.executeUpdate() > 0) {
                    ResultSet rs = stmt.getGeneratedKeys();
                    if(rs.next()) {
                        address.setId(rs.getLong(1));
                    }
                }
            }
        }
        catch (SQLException e) {
            throw new DataBaseException("ERROR: Address not inserted!");
        }
    }
    
    private void update(Address address) throws DataBaseException {
        String sql = "UPDATE `addresses` SET `street`= ?, `number`= ?, `complement`= ?, `neighborhood`= ?,  `city`= ?, `state`= ?, `zip_code`= ?, `country`= ? WHERE `id` = ?";
        try {
            try (PreparedStatement stmt = CONNECTION.prepareStatement(sql)) {
                stmt.setString(1,address.getStreet());
                stmt.setInt(2,address.getNumber());
                stmt.setString(3,address.getComplement());
                stmt.setString(4,address.getNeighborhood());
                stmt.setString(5,address.getCity());
                stmt.setString(6,address.getState());
                stmt.setString(7,address.getZipCode());
                stmt.setString(8,address.getCountry());
                stmt.setLong(9,address.getId());
                stmt.executeUpdate();
            }
        }
        catch (SQLException e) {
            throw new DataBaseException("ERROR: Address not updated!");
        }
    }

    private Address find(Object key, String sql) throws DataBaseException {
        try {
            Address address = null;
            try (PreparedStatement stmt = CONNECTION.prepareStatement(sql)) {
                if (key instanceof Long id) {
                    stmt.setLong(1, id);
                }
                else if (key instanceof String cpf) {
                    stmt.setString(1, cpf);
                }
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    Customer customer = new Customer();
                    customer.setId(rs.getLong("customers.id"));
                    customer.setCpf(rs.getString("cpf"));
                    customer.setFirstName(rs.getString("first_name"));
                    customer.setLastName(rs.getString("last_name"));
                    address = new Address();
                    address.setId(rs.getLong("addresses.id"));
                    address.setStreet(rs.getString("street"));
                    address.setNumber(rs.getInt("number"));
                    address.setComplement(rs.getString("complement"));
                    address.setNeighborhood(rs.getString("neighborhood"));
                    address.setCity(rs.getString("city"));
                    address.setState(rs.getString("state"));
                    address.setZipCode(rs.getString("zip_code"));
                    address.setCountry(rs.getString("country"));
                    address.setCustomer(customer);
                }
            }
            return address;
        }
        catch (SQLException e) {
            throw new DataBaseException("ERROR: Address not found!");
        }
    }

    @Override
    public Address findById(Long id) throws DataBaseException {
        String sql = "SELECT * FROM `addresses` INNER JOIN `customers` ON `customer_id` = customers.id WHERE addresses.id = ?";
        return this.find(id, sql);
    }

    @Override
    public Address findByCustomerCpf(String customerCpf) throws DataBaseException {
        String sql = "SELECT * FROM `addresses` INNER JOIN `customers` ON `customer_id` = customers.id WHERE `cpf` = ?";
        return this.find(customerCpf, sql);
    }

    @Override
    public void delete(Address address) throws DataBaseException {
        String sql = "DELETE FROM `addresses` WHERE `id` = ?";
        try {
            try (PreparedStatement stmt = CONNECTION.prepareStatement(sql)) {
                stmt.setLong(1,address.getId());
                stmt.executeUpdate();
            }
        }
        catch (SQLException e){
            throw new DataBaseException("ERROR: Address not deleted!");
        }
    }

}