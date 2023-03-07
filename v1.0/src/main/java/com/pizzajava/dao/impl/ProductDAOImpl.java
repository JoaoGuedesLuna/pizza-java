package main.java.com.pizzajava.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import main.java.com.pizzajava.database.DataBaseException;
import main.java.com.pizzajava.model.Product;
import main.java.com.pizzajava.dao.ProductDAO;

/**
 * Classe que implementa os métodos da interface ProductDAO. Métodos para a manipulação de registros de products (produtos) no banco de dados.
 *
 * @author Antonio Marinho e João Guedes.
 */
public class ProductDAOImpl implements ProductDAO {
    
    private final Connection CONNECTION;
    
    public ProductDAOImpl(Connection connection) {
        this.CONNECTION = connection;
    }

    private Product find(Object key, String sql) throws DataBaseException {
        try {
            Product product = null;
            try (PreparedStatement stmt = CONNECTION.prepareStatement(sql)) {
                if (key instanceof Long id) {
                    stmt.setLong(1, id);
                }
                else if (key instanceof String code) {
                    stmt.setString(1, code);
                }
                ResultSet rs = stmt.executeQuery();
                if(rs.next()) {
                    product  = new Product();
                    product.setId(rs.getLong("id"));
                    product.setCode(rs.getString("code"));
                    product.setName(rs.getString("name"));
                    product.setDescription("description");
                    product.setSize(rs.getString("size"));
                    product.setUnitPrice(rs.getDouble("unit_price"));
                }
            }
            return product;
        }
        catch (SQLException e) {
            throw new DataBaseException("ERROR: Product not found!");
        }
    }

    @Override
    public Product findById(Long id) throws DataBaseException {
        String sql = "SELECT * FROM `products` WHERE `id` = ?";
        return this.find(id, sql);
    }

    @Override
    public Product findByCode(String code) throws DataBaseException {
        String sql = "SELECT * FROM `products` WHERE `code` = ?";
        return this.find(code, sql);
    }

    @Override
    public List<Product> findAll() throws DataBaseException{
        List<Product> products = new ArrayList<>();
        String sql = "SELECT * FROM products";
        try {
            try (PreparedStatement stmt = CONNECTION.prepareStatement(sql)) {
                ResultSet rs = stmt.executeQuery();
                Product product;
                while (rs.next()) {
                    product = new Product();
                    product.setId(rs.getLong("id"));
                    product.setCode(rs.getString("code"));
                    product.setName(rs.getString("name"));
                    product.setSize(rs.getString("size"));
                    product.setDescription(rs.getString("description"));
                    product.setUnitPrice(rs.getDouble("unit_price"));
                    products.add(product);
                }
            }
            return products;
        }
        catch (SQLException e) {
            throw new DataBaseException("ERROR: Products not found!");
        }
    }
    
}