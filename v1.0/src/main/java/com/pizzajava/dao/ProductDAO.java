package main.java.com.pizzajava.dao;

import main.java.com.pizzajava.database.DataBaseException;
import java.util.List;
import main.java.com.pizzajava.model.Product;

/**
 * Interface que disponibiliza métodos para a manipulação de registros de products (produtos) no banco de dados.
 *
 * @author Antonio Marinho e João Guedes.
 */
public interface ProductDAO {
    
    Product findById(Long id) throws DataBaseException;
    
    Product findByCode(String code) throws DataBaseException;
    
    List<Product> findAll() throws DataBaseException;
    
}