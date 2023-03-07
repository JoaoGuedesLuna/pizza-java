package main.java.com.pizzajava.dao;

import main.java.com.pizzajava.dao.impl.*;
import main.java.com.pizzajava.database.DataBase;
import main.java.com.pizzajava.database.DataBaseException;

/**
 * Classe que disponibiliza métodos que retornam subtipos de interfaces DAO das entidades do banco de dados.
 *
 * @author Antonio Marinho e João Guedes.
 */
public class FactoryDAO {
    
    public static CustomerDAO createCustomerDAO() throws DataBaseException {
        return new CustomerDAOImpl(DataBase.getConnection());
    }
     
    public static AddressDAO createAddressDAO() throws DataBaseException {
        return new AddressDAOImpl(DataBase.getConnection());
    }
    
    public static ContactDAO createContactDAO() throws DataBaseException {
        return new ContactDAOImpl(DataBase.getConnection());
    }
    
    public static AccountDAO createAccountDAO() throws DataBaseException {
        return new AccountDAOImpl(DataBase.getConnection());
    }
    
    public static ProductDAO createProductDAO() throws DataBaseException{
        return new ProductDAOImpl(DataBase.getConnection());
    }
    
    public static OrderDAO createOrderDAO() throws DataBaseException {
        return new OrderDAOImpl(DataBase.getConnection());
    }
    
    public static ItemDAO createItemDAO() throws DataBaseException {
        return new ItemDAOImpl(DataBase.getConnection());
    }
    
}