package main.java.com.pizzajava.model;

import java.util.Objects;

/**
 * Classe responsável por representar a entidade customers (clientes) que está no banco de dados.
 *
 * @author Antonio Marinho e João Guedes.
 */
public class Customer {
    
    private Long id;
    private String cpf;
    private String firstName;
    private String lastName;

    public Customer(Long id, String cpf, String firstName, String lastName) {
        this.id = id;
        this.cpf = cpf;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.cpf);
        hash = 89 * hash + Objects.hashCode(this.firstName);
        hash = 89 * hash + Objects.hashCode(this.lastName);
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
        final Customer other = (Customer) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Customer{" + 
                "id=" + this.id + 
                ", cpf=" + this.cpf + 
                ", firstName=" + this.firstName + 
                ", lastName=" + this.lastName + 
                '}';
    }
    
}