package main.java.com.pizzajava.model;

import java.util.Objects;

/**
 * Classe responsável por representar a entidade products (produtos) que está no banco de dados.
 *
 * @author Antonio Marinho e João Guedes.
 */
public class Product{
    
    private Long id;
    private String code;
    private String name;
    private String description;
    private String size;
    private Double unitPrice;

    public Product(Long id, String code, String name, String description, String size, Double unitPrice) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.size = size;
        this.unitPrice = unitPrice;
    }

    public Product() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.code);
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + Objects.hashCode(this.size);
        hash = 89 * hash + Objects.hashCode(this.unitPrice);
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
        final Product other = (Product) obj;
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.size, other.size)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.unitPrice, other.unitPrice);
    }

    @Override
    public String toString() {
        return "Product{" + 
                "id=" + this.id + 
                ", code=" + this.code + 
                ", name=" + this.name + 
                ", description=" + this.description + 
                ", size=" + this.size + 
                ", unitPrice=" + this.unitPrice + 
                '}';
    }
    
}