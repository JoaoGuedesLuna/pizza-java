package main.java.com.pizzajava.model;;

import java.util.Date;
import java.util.Objects;

/**
 * Classe responsável por representar a entidade orders (pedidos) que está no banco de dados.
 *
 * @author Antonio Marinho e João Guedes.
 */
public class Order {
    
    private Long id;
    private Date date;
    private Double totalPrice;
    private Customer customer;

    public Order(Long id, Date date, Double totalPrice, Customer customer) {
        this.id = id;
        this.date = date;
        this.totalPrice = totalPrice;
        this.customer = customer;
    }

    public Order() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.date);
        hash = 97 * hash + Objects.hashCode(this.totalPrice);
        hash = 97 * hash + Objects.hashCode(this.customer);
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
        final Order other = (Order) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.totalPrice, other.totalPrice)) {
            return false;
        }
        return Objects.equals(this.customer, other.customer);
    }

    @Override
    public String toString() {
        return "Order{" + 
                "id=" + this.id + 
                ", date=" + this.date + 
                ", totalPrice=" + this.totalPrice + 
                ", customer=" + this.customer + 
                '}';
    }
    
}