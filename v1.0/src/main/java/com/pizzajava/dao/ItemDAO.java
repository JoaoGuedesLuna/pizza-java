package main.java.com.pizzajava.dao;

import main.java.com.pizzajava.database.DataBaseException;
import main.java.com.pizzajava.model.Item;
import java.util.List;

/**
 * Interface que disponibiliza métodos para a manipulação de registros de items (itens) no banco de dados.
 *
 * @author Antonio Marinho e João Guedes.
 */
public interface ItemDAO {
    
    void save(Item item) throws DataBaseException;
    
    List<Item> findAllByOrderId(Long orderId) throws DataBaseException;
    
}