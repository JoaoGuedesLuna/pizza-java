package main.java.com.pizzajava.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe de conexão com o banco de dados.
 *
 * @author Antonio Marinho e João Guedes.
 */
public class DataBase {
    
    private static Connection connection = null;
    private static final String USER = "pizzajava";
    private static final String PASSWORD = ""; 
    private static final String URL = "jdbc:h2:mem:pizzajava;";
    private static final String INIT = "INIT=RUNSCRIPT FROM 'classpath:main/resources/database/data.sql'\\;";
    
    /**
     * Método que disponibiliza uma conexão com o banco de dados.
     *
     * @return Retorna a conexão com o banco de dados.
     *
     * @throws DataBaseException Lança uma execeção caso o DriveManager não consiga retornar uma conexão.
     */
    public static Connection getConnection() throws DataBaseException {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL.concat(INIT), USER, PASSWORD);
            } catch (SQLException e) {
                throw new DataBaseException("ERROR: Failed to try to connect to the database!");
            }
        }
        else {
            try {
                if (connection.isClosed()) {
                    connection = null;
                    return DataBase.getConnection();
                }
            } catch (SQLException e) {
                throw new DataBaseException("ERROR: Failed to try to connect to the database!");
            }
        }
        return connection;
    }
    
}