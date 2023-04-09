package main.java.com.pizzajava.dao;

import main.java.com.pizzajava.database.DataBaseException;
import main.java.com.pizzajava.model.Account;

/**
 * Interface que disponibiliza métodos para a manipulação de registros de accounts (contas) no banco de dados.
 *
 * @author Antonio Marinho e João Guedes.
 */
public interface AccountDAO {
    
    void save(Account account) throws DataBaseException;
    
    Account findById(Long id) throws DataBaseException;
    
    Account findByEmail(String email) throws DataBaseException;
    
}