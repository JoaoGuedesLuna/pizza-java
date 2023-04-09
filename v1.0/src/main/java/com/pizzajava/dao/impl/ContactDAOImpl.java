package main.java.com.pizzajava.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import main.java.com.pizzajava.dao.ContactDAO;
import main.java.com.pizzajava.database.DataBaseException;
import main.java.com.pizzajava.model.Customer;
import main.java.com.pizzajava.model.Contact;

/**
 * Classe que implementa os métodos da interface ContactDAO. Métodos para a manipulação de registros de contacts (contatos) no banco de dados.
 *
 * @author Antonio Marinho e João Guedes.
 */
public class ContactDAOImpl implements ContactDAO {
    
    private final Connection CONNECTION;
    
    public ContactDAOImpl(Connection connection) {
        this.CONNECTION = connection;
    }
    
    @Override
    public void save(Contact contact) throws DataBaseException {
        if (contact.getId() == null) {
            this.insert(contact);
        }
        else {
            this.update(contact);
        }
    }

    private void insert(Contact contact) throws DataBaseException {
        String sql = "INSERT INTO `contacts` (`telephone`, `whatsapp`, `customer_id`) VALUES (?,?,?)";
        try {
            try (PreparedStatement stmt = CONNECTION.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
                stmt.setString(1, contact.getTelephone());
                stmt.setString(2, contact.getWhatsapp());
                stmt.setLong(3, contact.getCustomer().getId());
                if (stmt.executeUpdate() > 0) {
                    ResultSet rs = stmt.getGeneratedKeys();
                    if (rs.next()) {
                        contact.setId(rs.getLong(1));
                    }
                }
            }
        }
        catch (SQLException e) {
            throw new DataBaseException("ERROR: Contact not inserted!");
        }
    }
    
    private void update(Contact contact) throws DataBaseException{
        String sql = "UPDATE `contacts` SET `telephone`= ?, `whatsapp` = ? WHERE `id` = ?";
        try {
            try (PreparedStatement stmt = CONNECTION.prepareStatement(sql)) {
                stmt.setString(1, contact.getTelephone());
                stmt.setString(2, contact.getWhatsapp());
                stmt.setLong(3, contact.getId());
                stmt.executeUpdate();
            }
        }
        catch (SQLException e){
            throw new DataBaseException("ERROR: Contact not updated!");
        }
    }

    private Contact find(Object key, String sql) throws DataBaseException {
        try {
            Contact contact = null;
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
                    customer.setId(rs.getLong("customer_id"));
                    customer.setCpf(rs.getString("cpf"));
                    customer.setFirstName(rs.getString("first_name"));
                    customer.setLastName(rs.getString("last_name"));
                    contact = new Contact();
                    contact.setId(rs.getLong("contacts.id"));
                    contact.setTelephone(rs.getString("telephone"));
                    contact.setWhatsapp(rs.getString("whatsapp"));
                    contact.setCustomer(customer);
                            
                }
            }
            return contact;
        }
        catch (SQLException e){
            throw new DataBaseException("ERROR: Contact not found!");
        }
    }

    @Override
    public Contact findById(Long id) throws DataBaseException{
        String sql = "SELECT * FROM `contacts` INNER JOIN `customers` ON `customer_id` = customers.id WHERE contacts.id = ?";
        return this.find(id, sql);
    }

    @Override
    public Contact findByCustomerCpf(String customerCpf) throws DataBaseException{
        String sql = "SELECT * FROM `contacts` INNER JOIN `customers` ON `customer_id` = customers.id WHERE `cpf` = ?";
        return this.find(customerCpf, sql);
    }
    
}