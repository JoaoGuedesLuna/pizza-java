package main.java.com.pizzajava.dao;

import main.java.com.pizzajava.database.DataBaseException;
import main.java.com.pizzajava.model.Order;
import java.util.List;

/**
 * Interface que disponibiliza métodos para a manipulação de registros de orders (pedidos) no banco de dados.
 *
 * @author Antonio Marinho e João Guedes
 */
public interface OrderDAO {
    
    void save(Order order) throws DataBaseException;
    
    List<Order> findAllByCustomerId(Long CustomerId) throws DataBaseException;
    
}