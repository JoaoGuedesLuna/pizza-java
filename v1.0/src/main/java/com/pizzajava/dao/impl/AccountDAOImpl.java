package main.java.com.pizzajava.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import main.java.com.pizzajava.dao.AccountDAO;
import main.java.com.pizzajava.database.DataBaseException;
import main.java.com.pizzajava.model.Account;
import main.java.com.pizzajava.model.Customer;

/**
 * Classe que implementa os métodos da interface AccountDAO. Métodos para a manipulação de registros de accounts (contas) no banco de dados.
 *
 * @author Antonio Marinho e João Guedes.
 */
public class AccountDAOImpl implements AccountDAO {
    
    private final Connection CONNECTION;
    
    public AccountDAOImpl(Connection connection) {
        this.CONNECTION = connection;
    }
    
    @Override
    public void save(Account account) throws DataBaseException {
        if (account.getId() == null) {
            this.insert(account);
        }
        else {
            this.update(account);
        }
    }

    private void insert(Account account) throws DataBaseException {
        String sql = "INSERT INTO `accounts` (`email`, `password`, `customer_id`) VALUES (?,?,?)";
        try {
            try (PreparedStatement stmt = this.CONNECTION.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                stmt.setString(1,account.getEmail());
                stmt.setString(2,account.getPassword());
                stmt.setLong(3, account.getCustomer().getId());
                if(stmt.executeUpdate() > 0) {
                    ResultSet rs = stmt.getGeneratedKeys();
                    if(rs.next()) {
                        account.setId(rs.getLong(1));
                    }
                }
            }
        }
        catch (SQLException e) {
            throw new DataBaseException("ERROR: Account not inserted!");
        }
    }
    
    private void update(Account account) throws DataBaseException{
        String sql = "UPDATE `accounts` SET `password`= ? WHERE `id` = ?";
        try {
            try (PreparedStatement stmt = CONNECTION.prepareStatement(sql)) {
                stmt.setString(1,account.getPassword());
                stmt.setLong(2, account.getId());
                stmt.executeUpdate();
            }
        }
        catch (SQLException e) {
            throw new DataBaseException("ERROR: Password not updated!");
        }
    }

    private Account find(Object key, String sql) throws DataBaseException {
        try {
            Account account = null;
            try (PreparedStatement stmt = this.CONNECTION.prepareStatement(sql)) {
                if (key instanceof Long id) {
                    stmt.setLong(1, id);
                }
                else if (key instanceof String email) {
                    stmt.setString(1, email);
                }   
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    Customer customer = new Customer();
                    customer.setId(rs.getLong("customers.id"));
                    customer.setCpf(rs.getString("cpf"));
                    customer.setFirstName(rs.getString("first_name"));
                    customer.setLastName(rs.getString("last_name"));
                    account = new Account();
                    account.setId(rs.getLong("accounts.id"));
                    account.setEmail(rs.getString("email"));
                    account.setPassword(rs.getString("password"));
                    account.setCustomer(customer);
                }
            }
            return account;
        }
        catch (SQLException e) {
            throw new DataBaseException("ERROR: Account not found!");
        }
    }

    @Override
    public Account findById(Long id) throws DataBaseException{
        String sql = "SELECT * FROM `accounts` INNER JOIN `customers` ON `customer_id` = customers.id WHERE accounts.id =  ?";
        return this.find(id, sql);
    }

    @Override
    public Account findByEmail(String email) throws DataBaseException{
        String sql = "SELECT * FROM `accounts` INNER JOIN `customers` ON `customer_id` = customers.id WHERE `email` =  ?";
        return this.find(email, sql);
    }
    
}
