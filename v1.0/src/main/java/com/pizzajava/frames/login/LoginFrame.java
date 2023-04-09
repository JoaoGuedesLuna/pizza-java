package main.java.com.pizzajava.frames.login;

import java.awt.Color;
import main.java.com.pizzajava.model.Account;
import main.java.com.pizzajava.util.Documents;
import main.java.com.pizzajava.database.DataBaseException;
import java.awt.Cursor;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import main.java.com.pizzajava.dao.FactoryDAO;
import main.java.com.pizzajava.frames.navigation.HomeFrame;
import main.java.com.pizzajava.frames.register.PersonalDataRegisterFrame;
import main.java.com.pizzajava.model.Address;
import main.java.com.pizzajava.model.Contact;
import main.java.com.pizzajava.model.Customer;
import main.java.com.pizzajava.util.Data;
import main.java.com.pizzajava.util.Screen;
import main.java.com.pizzajava.util.Set;

/**
 * Janela onde o usuário poderá fazer o login na sua conta caso já tenha uma conta ou acessar a tela de cadastro caso não tenha uma conta.
 *
 * @author João Guedes.
 * 
 * @version 1.0.
 */
public class LoginFrame extends javax.swing.JFrame {
    
    private Account account;
    private final Color BORDER_DEFAULT_COLOR = new Color(254, 223, 19);
    
    public LoginFrame() {
        this.initComponents();
        super.setLocationRelativeTo(null);
        Set.setIconImage(this, "/main/resources/images/pizzajava/black-icon.png");
        this.limitTextFields();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        logoLbl = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        exitLbl = new javax.swing.JLabel();
        minimizeLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        emailWarningLbl = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        passwordlbl = new javax.swing.JLabel();
        passwordWarningLbl = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginLbl = new javax.swing.JLabel();
        registerLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);
        setResizable(false);

        leftPanel.setMaximumSize(new java.awt.Dimension(300, 500));
        leftPanel.setMinimumSize(new java.awt.Dimension(300, 500));
        leftPanel.setPreferredSize(new java.awt.Dimension(300, 500));

        logoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/pizzajava/yellow-logo.png"))); // NOI18N

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addComponent(logoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addComponent(logoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        rightPanel.setBackground(new java.awt.Color(35, 31, 32));
        rightPanel.setMaximumSize(new java.awt.Dimension(400, 500));
        rightPanel.setMinimumSize(new java.awt.Dimension(400, 500));
        rightPanel.setName(""); // NOI18N
        rightPanel.setPreferredSize(new java.awt.Dimension(400, 500));

        exitLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitLbl.setForeground(new java.awt.Color(255, 233, 18));
        exitLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/icons/yellow-exit.png"))); // NOI18N
        exitLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLblClicked(evt);
            }
        });

        minimizeLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        minimizeLbl.setForeground(new java.awt.Color(255, 233, 18));
        minimizeLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/icons/yellow-minimize.png"))); // NOI18N
        minimizeLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLblClicked(evt);
            }
        });

        titleLbl.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(254, 223, 19));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Login");

        emailLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emailLbl.setForeground(new java.awt.Color(254, 223, 19));
        emailLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        emailLbl.setText("Email");

        emailWarningLbl.setForeground(new java.awt.Color(255, 0, 0));

        emailField.setBackground(new java.awt.Color(51, 51, 51));
        emailField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailField.setForeground(new java.awt.Color(153, 153, 153));
        emailField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 233, 18), 1, true));
        emailField.setMaximumSize(new java.awt.Dimension(302, 32));
        emailField.setMinimumSize(new java.awt.Dimension(302, 32));
        emailField.setPreferredSize(new java.awt.Dimension(302, 32));
        emailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailFieldKeyTyped(evt);
            }
        });

        passwordlbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordlbl.setForeground(new java.awt.Color(254, 223, 19));
        passwordlbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passwordlbl.setText("Senha");

        passwordWarningLbl.setForeground(new java.awt.Color(255, 0, 0));

        passwordField.setBackground(new java.awt.Color(51, 51, 51));
        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(153, 153, 153));
        passwordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 233, 18), 1, true));
        passwordField.setMaximumSize(new java.awt.Dimension(302, 32));
        passwordField.setMinimumSize(new java.awt.Dimension(302, 32));
        passwordField.setPreferredSize(new java.awt.Dimension(302, 32));
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordFieldKeyTyped(evt);
            }
        });

        loginLbl.setBackground(new java.awt.Color(254, 223, 19));
        loginLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginLbl.setForeground(new java.awt.Color(35, 31, 32));
        loginLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLbl.setText("Login");
        loginLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginLbl.setOpaque(true);
        loginLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginLblMouseClicked(evt);
            }
        });

        registerLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registerLbl.setForeground(new java.awt.Color(254, 223, 19));
        registerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerLbl.setText("Cadastrar-se");
        registerLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerLblClicked(evt);
            }
        });

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                .addComponent(minimizeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitLbl)
                .addGap(18, 18, 18))
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, rightPanelLayout.createSequentialGroup()
                                .addComponent(passwordlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(passwordWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, rightPanelLayout.createSequentialGroup()
                                .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(emailWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(registerLbl)))
                .addContainerGap())
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(minimizeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(76, 76, 76)
                .addComponent(titleLbl)
                .addGap(10, 10, 10)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailLbl)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(emailWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordlbl)
                    .addComponent(passwordWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(loginLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(leftPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Método responsável por limitar os caracteres válidos nos campos de texto da janela atual.
     */
    private void limitTextFields(){
        this.emailField.setDocument(new Documents(50, Documents.REGEX_EMAIL));
        this.passwordField.setDocument(new Documents(15, " "));
    }
    
    /**
     * Faz o painel de login ficar em seu estado padrão, permitindo os campos de texto serem editados e os botões de login
     * e de cadastrar-se serem usados.
     */
    private void changeToDefaultStatus() {
        this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        Set.setCursor(Cursor.TEXT_CURSOR, this.emailField, this.passwordField);
        Set.setCursor(Cursor.HAND_CURSOR, this.loginLbl, this.registerLbl);
        Set.setFocusable(true, this.emailField, this.passwordField);
        Set.setEditable(true, this.emailField, this.passwordField);
    }
    
    /**
     * Coloca o painel de login em estado de carregamento, os campos de texto ficam bloqueados e os botões de login
     * e registrar-se ficam sem poder ser usados.
     */
    private void changeToLoadingStatus() {
        this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        Set.setCursor(Cursor.WAIT_CURSOR, this.emailField, this.passwordField, this.loginLbl, this.registerLbl);
        Set.setFocusable(false, this.emailField, this.passwordField);
        Set.setEditable(false, this.emailField, this.passwordField);
    }
    
    /**
     * Verifica se a janela atual está em tela de carregamento.
     * 
     * @return Retorna true caso a janela atual esteja em tela de carregamento ou false caso não esteja.
     */
    private boolean isLoading() {
        return super.getCursor().getType() == Cursor.WAIT_CURSOR;
    }
    
     /**
     * Verifica se o campo email tem uma quantidade de caracteres inválida.
     *
     * @return retorna true caso a quantidade de caracteres seja inválida ou false caso seja válida.
     */
    private boolean emailSizeIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.emailField, this.emailWarningLbl, this.emailField.getText(),
                "email", Data.MALE_TEXT_FIELD, 7, 50, this.BORDER_DEFAULT_COLOR);
    }

    /**
     * Verifica se o campo senha tem uma quantidade de caracteres inválida.
     *
     * @return retorna true caso a quantidade de caracteres seja inválida ou false caso seja válida.
     */
    private boolean passwordSizeIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.passwordField, this.passwordWarningLbl, String.valueOf(this.passwordField.getPassword()),
                "senha", Data.FEMALE_TEXT_FIELD, 6, 15, this.BORDER_DEFAULT_COLOR);
    }
    
    /**
     * Verifica se o email digitado não tem uma conta no sistema da aplicação ou se a senha digitada não é a senha
     * da conta digitada.
     *
     * @return retorna true caso o email digitado não tenha uma conta no sistema da aplicação ou se a senha digitada não é a senha
     * da conta digitada  ou retorna false caso o email esteja correto e a senha também.
     */
    private boolean isUnregisteredEmailOrPasswordWrong() {
        try {
            String emailTyped = this.emailField.getText().toLowerCase();
            String passwordTyped = String.valueOf(this.passwordField.getPassword());
            Account accountTyped = FactoryDAO.createAccountDAO().findByEmail(emailTyped);
            if (accountTyped == null || !accountTyped.getPassword().equals(passwordTyped)) {
                Set.setLineBorder(Color.RED, this.emailField, this.passwordField);
                this.emailWarningLbl.setText("usuário ou senha incorreta"); 
                Thread thread = new Thread(() -> {
                    try {
                        Thread.sleep(2500);
                        Set.setLineBorder(this.BORDER_DEFAULT_COLOR, this.emailField, this.passwordField);
                        this.emailWarningLbl.setText("");
                    } catch (InterruptedException ignored) {}
                });
                thread.start();
                return true;
            }
            this.account = accountTyped;
            return false;
        } catch (DataBaseException dbe) {
            JOptionPane.showMessageDialog(this, "Desculpe, não foi possível conectar. Verifique sua conexão.",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }
    
    private void exitLblClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblClicked
        System.exit(0);
    }//GEN-LAST:event_exitLblClicked
    
    private void minimizeLblClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLblClicked
        super.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeLblClicked
    
    private void emailFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailFieldKeyTyped
        if (!this.emailWarningLbl.getText().isEmpty() && !this.emailWarningLbl.getText().equalsIgnoreCase("usuário ou senha incorreta")) {
            Set.setLineBorder(this.BORDER_DEFAULT_COLOR, this.emailField);
            this.emailWarningLbl.setText("");
        }
    }//GEN-LAST:event_emailFieldKeyTyped

    private void passwordFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyTyped
        if (!this.passwordWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(this.BORDER_DEFAULT_COLOR, this.passwordField);
            this.passwordWarningLbl.setText("");
        }
    }//GEN-LAST:event_passwordFieldKeyTyped
    
    private void loginLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLblMouseClicked
        if (this.isLoading() || this.emailSizeIsInvalid() || this.passwordSizeIsInvalid() || this.isUnregisteredEmailOrPasswordWrong()) {
            return;
        }
        this.changeToLoadingStatus();
        Customer customer = this.account.getCustomer();
        try {
            Contact contact = FactoryDAO.createContactDAO().findByCustomerCpf(customer.getCpf());
            Address address = FactoryDAO.createAddressDAO().findByCustomerCpf(customer.getCpf());
            Screen.changeScreen(this, new HomeFrame(this.account.getCustomer(), contact, address, this.account));
        } 
        catch (DataBaseException dbe) {
            this.changeToDefaultStatus();
            JOptionPane.showMessageDialog(this, "Desculpe, não foi possível conectar. Verifique sua conexão.",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_loginLblMouseClicked
    
     private void registerLblClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerLblClicked
        if (this.isLoading()) {
            return;
        }
        Screen.changeScreen(this, new PersonalDataRegisterFrame());
    }//GEN-LAST:event_registerLblClicked
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JLabel emailWarningLbl;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JLabel logoLbl;
    private javax.swing.JLabel minimizeLbl;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordWarningLbl;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JLabel registerLbl;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables

}