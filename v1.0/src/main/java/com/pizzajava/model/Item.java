package main.java.com.pizzajava.model;

import java.util.Objects;

/**
 * Classe responsável por representar a entidade items (itens) que está no banco de dados.
 *
 * @author Antonio Marinho e João Guedes.
 */
public class Item {
    
    private Long id;
    private String name;
    private Integer quantity;
    private Product product;
    private Order order;

    public Item(Long id, String name, Integer quantity, Product product, Order order) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.product = product;
        this.order = order;
    }

    public Item() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return this.order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.quantity);
        hash = 67 * hash + Objects.hashCode(this.product);
        hash = 67 * hash + Objects.hashCode(this.order);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.quantity, other.quantity)) {
            return false;
        }
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        return Objects.equals(this.order, other.order);
    }

    @Override
    public String toString() {
        return "Item{" + 
                "id=" + this.id + 
                ", name=" + this.name + 
                ", quantity=" + this.quantity + 
                ", product=" + this.product + 
                ", order=" + this.order + 
                '}';
    }
    
}