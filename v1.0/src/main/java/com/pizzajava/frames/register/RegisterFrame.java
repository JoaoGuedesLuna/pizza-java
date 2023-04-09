package main.java.com.pizzajava.frames.register;

import java.awt.Color;
import main.java.com.pizzajava.dao.FactoryDAO;
import main.java.com.pizzajava.database.DataBaseException;
import main.java.com.pizzajava.model.Account;
import main.java.com.pizzajava.model.Address;
import main.java.com.pizzajava.model.Contact;
import main.java.com.pizzajava.model.Customer;
import main.java.com.pizzajava.util.Set;

/**
 * Classe que contem os objetos comuns a tadas as classes Register.
 * 
 * @author João Guedes.
 */
public sealed abstract class RegisterFrame extends javax.swing.JFrame permits PersonalDataRegisterFrame, AddressDataRegisterFrame, AccountDataRegisterFrame {
    
    private static Customer customer;
    private static Contact contact;
    private static Address address;
    private static Account account;
    protected static final Color BORDER_DEFAULT_COLOR = new Color(35,31,32);
    
    public RegisterFrame() {
        Set.setIconImage(this, "/main/resources/images/pizzajava/black-icon.png");
        super.setLocationRelativeTo(null);
    }

    protected Customer getCustomer() {
        return RegisterFrame.customer;
    }

    protected void setCustomer(Customer customer) {
        RegisterFrame.customer = customer;
    }

    protected Contact getContact() {
        return RegisterFrame.contact;
    }

    protected void setContact(Contact contact) {
        RegisterFrame.contact = contact;
    }

    protected Address getAddress() {
        return RegisterFrame.address;
    }

    protected void setAddress(Address address) {
        RegisterFrame.address = address;
    }

    protected Account getAccount() {
        return RegisterFrame.account;
    }

    protected void setAccount(Account account) {
        RegisterFrame.account = account;
    }
    
    /**
     * Método para criar um cadastro geral da conta no banco de dados. O cadastro so será criado caso os nenhum dos objetos
     * null.
     *
     * @return caso o cadastro seja criado o valor 1 será retornado caso ocorra alguma falha e o cadastro não seja
     * realizado o valor 0 sera retornado.
     */
    protected int createRegister() {
        if (this.getCustomer() == null || this.getContact() == null || this.getAddress() == null || this.getAccount() == null) {
            return 0;
        }
        try {
            FactoryDAO.createCustomerDAO().save(this.getCustomer());
            FactoryDAO.createContactDAO().save(this.getContact());
            FactoryDAO.createAddressDAO().save(this.getAddress());
            FactoryDAO.createAccountDAO().save(this.getAccount());
            return 1;
        } catch (DataBaseException dbe) {
            return 0;
        }
    }
    
    /**
     * Método que coloca null em todos as variáveis estáticas da classe.
     */
    protected void clear() {
        RegisterFrame.customer = null;
        RegisterFrame.contact = null;
        RegisterFrame.address = null;
        RegisterFrame.account = null;
    }
    
    /**
     * Método responsável por limitar os caracteres válidos nos campos de texto da janela atual.
     */
    abstract protected void limitTextFields();
    
    /**
     * Método que verifica se um os dados da tela já foram preenchidos anteriormente. Se sim, será feito o preenchimento
     * dos campos de acordo com o que já se tinha preenchido.
     */
    abstract protected void populateTextFields();
    
}