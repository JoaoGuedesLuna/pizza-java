package main.java.com.pizzajava.database;

/**
 * Classe que disponibiliza uma exceção para métodos da classe DataBase e para métodos que utilizem
 * os métodos da classe DataBase.
 *
 * @author João Guedes.
 */
public class DataBaseException extends Exception{
    
    public DataBaseException(String message) {
        super(message);
    }
    
}