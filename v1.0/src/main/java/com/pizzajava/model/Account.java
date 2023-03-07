package main.java.com.pizzajava.model;

import java.util.Objects;

/**
 * Classe responsável por representar a entidade accounts (contas) que está no banco de dados.
 *
 * @author Antonio Marinho e João Guedes.
 */
public class Account {
    
    private Long id;
    private String email;
    private String password;
    private Customer customer;

    public Account(Long id, String email, String password, Customer customer) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.customer = customer;
    }

    public Account() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.id);
        hash = 13 * hash + Objects.hashCode(this.email);
        hash = 13 * hash + Objects.hashCode(this.password);
        hash = 13 * hash + Objects.hashCode(this.customer);
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
        final Account other = (Account) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.customer, other.customer);
    }

    @Override
    public String toString() {
        return "Account{" + 
                "id=" + this.id + 
                ", email=" + this.email + 
                ", password=" + this.password + 
                ", customer=" + this.customer + 
                '}';
    }
    
}