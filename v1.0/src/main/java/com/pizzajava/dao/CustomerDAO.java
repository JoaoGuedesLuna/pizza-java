package main.java.com.pizzajava.dao;

import main.java.com.pizzajava.database.DataBaseException;
import main.java.com.pizzajava.model.Customer;

/**
 * Interface que disponibiliza métodos para a manipulação de registros de customers (clientes) no banco de dados.
 *
 * @author Antonio Marinho e João Guedes.
 */
public interface CustomerDAO {
    
    void save(Customer customer) throws DataBaseException;
    
    Customer findById(Long id) throws DataBaseException;
    
    Customer findByCpf(String cpf) throws DataBaseException;
    
    void delete(Customer customer) throws DataBaseException;
    
}