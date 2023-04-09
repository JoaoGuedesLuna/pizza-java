package main.java.com.pizzajava.model;

import java.util.Objects;

/**
 * Classe responsável por representar a entidade addresses (endereços) que está no banco de dados.
 *
 * @author Antonio Marinho e João Guedes.
 */
public class Address {
    
    private Long id;
    private Integer number;
    private String street;
    private String neighborhood;
    private String complement;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private Customer customer;

    public Address(Long id, Integer number, String street, String neighborhood, String complement, String city, String state, String zipCode, String country, Customer customer) {
        this.id = id;
        this.number = number;
        this.street = street;
        this.neighborhood = neighborhood;
        this.complement = complement;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
        this.customer = customer;
    }

    public Address() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNeighborhood() {
        return this.neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getComplement() {
        return this.complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
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
        hash = 89 * hash + Objects.hashCode(this.number);
        hash = 89 * hash + Objects.hashCode(this.street);
        hash = 89 * hash + Objects.hashCode(this.neighborhood);
        hash = 89 * hash + Objects.hashCode(this.complement);
        hash = 89 * hash + Objects.hashCode(this.city);
        hash = 89 * hash + Objects.hashCode(this.state);
        hash = 89 * hash + Objects.hashCode(this.zipCode);
        hash = 89 * hash + Objects.hashCode(this.country);
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
        final Address other = (Address) obj;
        if (!Objects.equals(this.street, other.street)) {
            return false;
        }
        if (!Objects.equals(this.neighborhood, other.neighborhood)) {
            return false;
        }
        if (!Objects.equals(this.complement, other.complement)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        if (!Objects.equals(this.zipCode, other.zipCode)) {
            return false;
        }
        if (!Objects.equals(this.country, other.country)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.number, other.number)) {
            return false;
        }
        return Objects.equals(this.customer, other.customer);
    }

    @Override
    public String toString() {
        return "Address{" + 
                "id=" + this.id + 
                ", number=" + this.number + 
                ", street=" + this.street + 
                ", neighborhood=" + this.neighborhood + 
                ", complement=" + this.complement + 
                ", city=" + this.city + 
                ", state=" + this.state + 
                ", zipCode=" + this.zipCode + 
                ", country=" + this.country + 
                ", customer=" + this.customer + 
                '}';
    }
    
}