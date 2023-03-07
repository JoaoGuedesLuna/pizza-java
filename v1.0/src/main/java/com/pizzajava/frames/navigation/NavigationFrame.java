package main.java.com.pizzajava.frames.navigation;

import java.awt.Color;
import java.util.List;
import javax.swing.JFrame;
import main.java.com.pizzajava.model.Account;
import main.java.com.pizzajava.model.Address;
import main.java.com.pizzajava.model.Contact;
import main.java.com.pizzajava.model.Customer;
import main.java.com.pizzajava.model.Item;
import main.java.com.pizzajava.util.Set;

/**
 * Classe que contem os objetos comuns a tadas as classes de navegação da aplicação.
 * 
 * @author João Guedes.
 */
public sealed abstract class NavigationFrame extends JFrame permits CartFrame, HomeFrame, OrderHistoryFrame, AccountDataFrame, PersonalDataFrame, AddressDataFrame {
    
    private static Customer customer;
    private static Contact contact;
    private static Address address;
    private static Account account;
    private static List<Item> cart;
    protected static final Color BORDER_DEFAULT_COLOR = new Color(35,31,32);
    
    public NavigationFrame() {
        Set.setIconImage(this, "/main/resources/images/pizzajava/black-icon.png");
        super.setLocationRelativeTo(null);
    }
    
    protected Customer getCustomer() {
        return NavigationFrame.customer;
    }

    protected void setCustomer(Customer customer) {
        NavigationFrame.customer = customer;
    }
    
    /**
     * Altera todos os clientes dos objetos da classe.
     * 
     * @param customer Novo cliente dos objetos.
     */
    protected void setAllCustomer(Customer customer) {
        NavigationFrame.customer = customer;
        if (NavigationFrame.contact != null) {
            NavigationFrame.contact.setCustomer(customer);
        }
        if (NavigationFrame.address != null) {
            NavigationFrame.address.setCustomer(customer);
        }
        if (NavigationFrame.account != null) {
            NavigationFrame.account.setCustomer(customer);
        }
    }

    protected Contact getContact() {
        return NavigationFrame.contact;
    }

    protected void setContact(Contact contact) {
        NavigationFrame.contact = contact;
    }

    protected Address getAddress() {
        return NavigationFrame.address;
    }

    protected void setAddress(Address address) {
        NavigationFrame.address = address;
    }

    protected Account getAccount() {
        return NavigationFrame.account;
    }

    protected void setAccount(Account account) {
        NavigationFrame.account = account;
    }

    public List<Item> getCart() {
        return NavigationFrame.cart;
    }

    public void setCart(List<Item> cart) {
        NavigationFrame.cart = cart;
    }
    
    /**
     * Método que coloca null em todos as variáveis estáticas da classe.
     */
    protected void clear() {
        this.customer = null;
        this.contact = null;
        this.address = null;
        this.account = null;
        this.cart = null;
    }
    
    /**
     * Método responsável por limitar os caracteres válidos nos campos de texto da janela atual.
     */
    protected void limitTextFields() {}
    
    /**
     * Faz o painel ficar em seu estado padrão, onde o usuário poderá apenas visualizar seus dados mas não alterá-los.
     */
    protected void changeToDefaultStatus() {}
    
    /**
     * Faz o painel ficar em seu estado de edição, onde o usuário poderá alterar seus dados.
     */
    protected void changeToEditStatus() {}
    
    /**
     * Coloca a foto do perfil do usuário,a foto no painel será uma foto padrão.
     */
    abstract protected void renderUserImage();
    
    /**
     * Coloca o nome do usuário no label firstNameLbl e no label lastNameLbl.
     */
    abstract protected void renderUserName();
    
}