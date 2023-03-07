package main.java.com.pizzajava.dao;

import main.java.com.pizzajava.database.DataBaseException;
import main.java.com.pizzajava.model.Contact;

/**
 * Interface que disponibiliza métodos para a manipulação de registros de contacts (contatos) no banco de dados.
 *
 * @author Antonio Marinho e João Guedes.
 */
public interface ContactDAO{
    
    void save(Contact contact) throws DataBaseException;
    
    Contact findById(Long id) throws DataBaseException;
    
    Contact findByCustomerCpf(String customerCpf) throws DataBaseException;
    
}