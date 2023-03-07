package main.java.com.pizzajava.model;

import java.util.Objects;

/**
 * Classe responsável por representar a entidade contacts (contatos) que está no banco de dados.
 *
 * @author Antonio Marinho e João Guedes.
 */
public class Contact {
    
    private Long id;
    private String telephone;
    private String whatsapp;
    private Customer customer;

    public Contact(Long id, String telephone, String whatsapp, Customer customer) {
        this.id = id;
        this.telephone = telephone;
        this.whatsapp = whatsapp;
        this.customer = customer;
    }

    public Contact() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getWhatsapp() {
        return this.whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
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
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.telephone);
        hash = 89 * hash + Objects.hashCode(this.whatsapp);
        hash = 89 * hash + Objects.hashCode(this.customer);
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
        final Contact other = (Contact) obj;
        if (!Objects.equals(this.telephone, other.telephone)) {
            return false;
        }
        if (!Objects.equals(this.whatsapp, other.whatsapp)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.customer, other.customer);
    }

    @Override
    public String toString() {
        return "Contact{" + 
                "id=" + this.id + 
                ", telephone=" + this.telephone + 
                ", whatsapp=" + this.whatsapp + 
                ", customer=" + this.customer + 
                '}';
    }
    
}