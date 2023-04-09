package main.java.com.pizzajava.dao;

import main.java.com.pizzajava.database.DataBaseException;
import main.java.com.pizzajava.model.Address;

/**
 * Interface que disponibiliza métodos para a manipulação de registros de addresses (endereços) no banco de dados.
 *
 * @author Antonio Marinho e João Guedes.
 */
public interface AddressDAO{
    
   void save(Address address) throws DataBaseException;
   
   Address findById(Long id) throws DataBaseException;
   
   Address findByCustomerCpf(String customerCpf) throws DataBaseException;
   
   void delete(Address address) throws DataBaseException;
    
}