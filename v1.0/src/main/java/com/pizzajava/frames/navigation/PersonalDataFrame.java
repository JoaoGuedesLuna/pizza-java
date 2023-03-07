package main.java.com.pizzajava.frames.navigation;

import java.awt.Cursor;
import main.java.com.pizzajava.frames.login.LoginFrame;
import main.java.com.pizzajava.model.Account;
import main.java.com.pizzajava.database.DataBaseException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import main.java.com.pizzajava.dao.FactoryDAO;
import main.java.com.pizzajava.model.Contact;
import main.java.com.pizzajava.model.Customer;
import main.java.com.pizzajava.util.Data;
import main.java.com.pizzajava.util.Documents;
import main.java.com.pizzajava.util.Screen;
import main.java.com.pizzajava.util.Set;

/**
 * Este painel permite ao usuário que ele visualize seus dados pessoais e se quiser altere-os.
 *
 * @author João Guedes.
 */
public final class PersonalDataFrame extends NavigationFrame {
    
    public PersonalDataFrame() {
        super();
        this.initComponents();
        this.renderUserImage();
        this.renderUserName();
        this.limitTextFields();
        this.cpfField.setText(super.getCustomer().getCpf());
        this.changeToDefaultStatus();
        this.scrollPane.getVerticalScrollBar().setUnitIncrement(16);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel = new javax.swing.JPanel();
        minimizeLbl = new javax.swing.JLabel();
        exitLbl = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        userImageLbl = new javax.swing.JLabel();
        firstNameLbl = new javax.swing.JLabel();
        lastNameLbl = new javax.swing.JLabel();
        cartIconLbl = new javax.swing.JLabel();
        cartLbl = new javax.swing.JLabel();
        homeIconLbl = new javax.swing.JLabel();
        homeLbl = new javax.swing.JLabel();
        ordericonLbl = new javax.swing.JLabel();
        orderLbl = new javax.swing.JLabel();
        accountDataIconLbl = new javax.swing.JLabel();
        accountDataLbl = new javax.swing.JLabel();
        personalDataIconLbl = new javax.swing.JLabel();
        personalDataLbl = new javax.swing.JLabel();
        addressIconLbl = new javax.swing.JLabel();
        addressLbl = new javax.swing.JLabel();
        deleteAccountIconLbl = new javax.swing.JLabel();
        deleteAccountLbl = new javax.swing.JLabel();
        logoutIconLbl = new javax.swing.JLabel();
        logoutLb = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        rightPanel = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        cpfLbl = new javax.swing.JLabel();
        cpfWarningLbl = new javax.swing.JLabel();
        cpfField = new javax.swing.JTextField();
        firstNameLbl1 = new javax.swing.JLabel();
        firstNameWarningLbl = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameLbl1 = new javax.swing.JLabel();
        lastNameWarningLbl = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        telephoneLbl = new javax.swing.JLabel();
        telephoneWarningLbl = new javax.swing.JLabel();
        dddTelephoneField = new javax.swing.JTextField();
        telephoneField = new javax.swing.JTextField();
        whatsappLbl = new javax.swing.JLabel();
        whatsappWarningLbl = new javax.swing.JLabel();
        dddWhatsappField = new javax.swing.JTextField();
        whatsappField = new javax.swing.JTextField();
        cancelLbl = new javax.swing.JLabel();
        editLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);

        topPanel.setBackground(new java.awt.Color(58, 58, 58));
        topPanel.setMaximumSize(new java.awt.Dimension(800, 36));
        topPanel.setMinimumSize(new java.awt.Dimension(800, 36));
        topPanel.setPreferredSize(new java.awt.Dimension(800, 36));

        minimizeLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        minimizeLbl.setForeground(new java.awt.Color(255, 233, 18));
        minimizeLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/icons/yellow-minimize.png"))); // NOI18N
        minimizeLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLblClicked(evt);
            }
        });

        exitLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitLbl.setForeground(new java.awt.Color(255, 233, 18));
        exitLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/icons/yellow-exit.png"))); // NOI18N
        exitLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLblClicked(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addGap(732, 732, 732)
                .addComponent(minimizeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitLbl)
                .addGap(18, 18, 18))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(minimizeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        leftPanel.setBackground(new java.awt.Color(35, 31, 32));
        leftPanel.setMaximumSize(new java.awt.Dimension(180, 570));
        leftPanel.setMinimumSize(new java.awt.Dimension(180, 570));
        leftPanel.setPreferredSize(new java.awt.Dimension(180, 570));

        userImageLbl.setIconTextGap(6);
        userImageLbl.setMaximumSize(new java.awt.Dimension(84, 84));
        userImageLbl.setMinimumSize(new java.awt.Dimension(84, 84));
        userImageLbl.setPreferredSize(new java.awt.Dimension(84, 84));

        firstNameLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        firstNameLbl.setForeground(new java.awt.Color(204, 204, 204));
        firstNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstNameLbl.setText("<first_name>");
        firstNameLbl.setMaximumSize(new java.awt.Dimension(180, 20));
        firstNameLbl.setMinimumSize(new java.awt.Dimension(180, 20));
        firstNameLbl.setPreferredSize(new java.awt.Dimension(180, 20));

        lastNameLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lastNameLbl.setForeground(new java.awt.Color(204, 204, 204));
        lastNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lastNameLbl.setText("<last_name>");
        lastNameLbl.setMaximumSize(new java.awt.Dimension(180, 20));
        lastNameLbl.setMinimumSize(new java.awt.Dimension(180, 20));
        lastNameLbl.setPreferredSize(new java.awt.Dimension(180, 20));

        cartIconLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/icons/white-cart.png"))); // NOI18N
        cartIconLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cartIconLbl.setMaximumSize(new java.awt.Dimension(30, 30));
        cartIconLbl.setMinimumSize(new java.awt.Dimension(30, 30));
        cartIconLbl.setPreferredSize(new java.awt.Dimension(30, 30));
        cartIconLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartIconLblMouseClicked(evt);
            }
        });

        cartLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cartLbl.setForeground(new java.awt.Color(204, 204, 204));
        cartLbl.setText("Carrinho");
        cartLbl.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        cartLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cartLbl.setMaximumSize(new java.awt.Dimension(142, 30));
        cartLbl.setMinimumSize(new java.awt.Dimension(142, 30));
        cartLbl.setPreferredSize(new java.awt.Dimension(142, 30));
        cartLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartLblMouseClicked(evt);
            }
        });

        homeIconLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/icons/white-home.png"))); // NOI18N
        homeIconLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeIconLbl.setMaximumSize(new java.awt.Dimension(30, 30));
        homeIconLbl.setMinimumSize(new java.awt.Dimension(30, 30));
        homeIconLbl.setPreferredSize(new java.awt.Dimension(30, 30));
        homeIconLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeIconLblMouseClicked(evt);
            }
        });

        homeLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        homeLbl.setForeground(new java.awt.Color(204, 204, 204));
        homeLbl.setText("Início");
        homeLbl.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        homeLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeLbl.setMaximumSize(new java.awt.Dimension(142, 30));
        homeLbl.setMinimumSize(new java.awt.Dimension(142, 30));
        homeLbl.setPreferredSize(new java.awt.Dimension(142, 30));
        homeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLblMouseClicked(evt);
            }
        });

        ordericonLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/icons/white-orders.png"))); // NOI18N
        ordericonLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ordericonLbl.setMaximumSize(new java.awt.Dimension(30, 30));
        ordericonLbl.setMinimumSize(new java.awt.Dimension(30, 30));
        ordericonLbl.setPreferredSize(new java.awt.Dimension(30, 30));
        ordericonLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordericonLblMouseClicked(evt);
            }
        });

        orderLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        orderLbl.setForeground(new java.awt.Color(204, 204, 204));
        orderLbl.setText("Histórico Pedidos");
        orderLbl.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        orderLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        orderLbl.setMaximumSize(new java.awt.Dimension(142, 30));
        orderLbl.setMinimumSize(new java.awt.Dimension(142, 30));
        orderLbl.setPreferredSize(new java.awt.Dimension(142, 30));
        orderLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderLblMouseClicked(evt);
            }
        });

        accountDataIconLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/icons/white-data_account.png"))); // NOI18N
        accountDataIconLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accountDataIconLbl.setMaximumSize(new java.awt.Dimension(30, 30));
        accountDataIconLbl.setMinimumSize(new java.awt.Dimension(30, 30));
        accountDataIconLbl.setPreferredSize(new java.awt.Dimension(30, 30));
        accountDataIconLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountDataIconLblMouseClicked(evt);
            }
        });

        accountDataLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        accountDataLbl.setForeground(new java.awt.Color(204, 204, 204));
        accountDataLbl.setText("Dados da Conta");
        accountDataLbl.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        accountDataLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accountDataLbl.setMaximumSize(new java.awt.Dimension(142, 30));
        accountDataLbl.setMinimumSize(new java.awt.Dimension(142, 30));
        accountDataLbl.setPreferredSize(new java.awt.Dimension(142, 30));
        accountDataLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountDataLblMouseClicked(evt);
            }
        });

        personalDataIconLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/icons/white-personal_informations.png"))); // NOI18N
        personalDataIconLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        personalDataIconLbl.setMaximumSize(new java.awt.Dimension(30, 30));
        personalDataIconLbl.setMinimumSize(new java.awt.Dimension(30, 30));
        personalDataIconLbl.setPreferredSize(new java.awt.Dimension(30, 30));

        personalDataLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        personalDataLbl.setForeground(new java.awt.Color(204, 204, 204));
        personalDataLbl.setText("Dados Pessoais");
        personalDataLbl.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        personalDataLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        personalDataLbl.setMaximumSize(new java.awt.Dimension(142, 30));
        personalDataLbl.setMinimumSize(new java.awt.Dimension(142, 30));
        personalDataLbl.setPreferredSize(new java.awt.Dimension(142, 30));

        addressIconLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/icons/white-address.png"))); // NOI18N
        addressIconLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addressIconLbl.setMaximumSize(new java.awt.Dimension(30, 30));
        addressIconLbl.setMinimumSize(new java.awt.Dimension(30, 30));
        addressIconLbl.setPreferredSize(new java.awt.Dimension(30, 30));
        addressIconLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addressIconLblMouseClicked(evt);
            }
        });

        addressLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addressLbl.setForeground(new java.awt.Color(204, 204, 204));
        addressLbl.setText("Endereço");
        addressLbl.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        addressLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addressLbl.setMaximumSize(new java.awt.Dimension(142, 30));
        addressLbl.setMinimumSize(new java.awt.Dimension(142, 30));
        addressLbl.setPreferredSize(new java.awt.Dimension(142, 30));
        addressLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addressLblMouseClicked(evt);
            }
        });

        deleteAccountIconLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/icons/white-delete_account.png"))); // NOI18N
        deleteAccountIconLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteAccountIconLbl.setMaximumSize(new java.awt.Dimension(30, 30));
        deleteAccountIconLbl.setMinimumSize(new java.awt.Dimension(30, 30));
        deleteAccountIconLbl.setPreferredSize(new java.awt.Dimension(30, 30));
        deleteAccountIconLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteAccountIconLblMouseClicked(evt);
            }
        });

        deleteAccountLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteAccountLbl.setForeground(new java.awt.Color(204, 204, 204));
        deleteAccountLbl.setText("Deletar Conta");
        deleteAccountLbl.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        deleteAccountLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteAccountLbl.setMaximumSize(new java.awt.Dimension(142, 30));
        deleteAccountLbl.setMinimumSize(new java.awt.Dimension(142, 30));
        deleteAccountLbl.setPreferredSize(new java.awt.Dimension(142, 30));
        deleteAccountLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteAccountLblMouseClicked(evt);
            }
        });

        logoutIconLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/icons/white-logout.png"))); // NOI18N
        logoutIconLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutIconLbl.setMaximumSize(new java.awt.Dimension(30, 30));
        logoutIconLbl.setMinimumSize(new java.awt.Dimension(30, 30));
        logoutIconLbl.setPreferredSize(new java.awt.Dimension(30, 30));
        logoutIconLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutIconLblMouseClicked(evt);
            }
        });

        logoutLb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutLb.setForeground(new java.awt.Color(204, 204, 204));
        logoutLb.setText("Sair da conta");
        logoutLb.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        logoutLb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutLb.setMaximumSize(new java.awt.Dimension(142, 30));
        logoutLb.setMinimumSize(new java.awt.Dimension(142, 30));
        logoutLb.setPreferredSize(new java.awt.Dimension(142, 30));
        logoutLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLbMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lastNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cartIconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(cartLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(userImageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(homeIconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(homeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ordericonLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(orderLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(accountDataIconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(accountDataLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(personalDataIconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(personalDataLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addressIconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(addressLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                                .addComponent(deleteAccountIconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(deleteAccountLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                                .addComponent(logoutIconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(logoutLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(userImageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lastNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cartIconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cartLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeIconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ordericonLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accountDataIconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountDataLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personalDataIconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personalDataLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressIconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteAccountIconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteAccountLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutIconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        scrollPane.setBackground(new java.awt.Color(102, 102, 102));
        scrollPane.setBorder(null);
        scrollPane.setMaximumSize(new java.awt.Dimension(620, 600));
        scrollPane.setMinimumSize(new java.awt.Dimension(620, 600));
        scrollPane.setPreferredSize(new java.awt.Dimension(620, 600));

        rightPanel.setBackground(new java.awt.Color(254, 223, 19));
        rightPanel.setMaximumSize(new java.awt.Dimension(400, 500));
        rightPanel.setMinimumSize(new java.awt.Dimension(400, 500));

        titleLbl.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(35, 31, 32));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Dados Pessoais");
        titleLbl.setMaximumSize(new java.awt.Dimension(400, 500));
        titleLbl.setMinimumSize(new java.awt.Dimension(400, 500));

        cpfLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cpfLbl.setForeground(new java.awt.Color(35, 31, 32));
        cpfLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cpfLbl.setText("CPF");

        cpfWarningLbl.setForeground(new java.awt.Color(255, 0, 0));

        cpfField.setEditable(false);
        cpfField.setBackground(new java.awt.Color(51, 51, 51));
        cpfField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cpfField.setForeground(new java.awt.Color(153, 153, 153));
        cpfField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 31, 32), 1, true));
        cpfField.setFocusable(false);
        cpfField.setMaximumSize(new java.awt.Dimension(302, 32));
        cpfField.setMinimumSize(new java.awt.Dimension(302, 32));
        cpfField.setPreferredSize(new java.awt.Dimension(302, 32));

        firstNameLbl1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        firstNameLbl1.setForeground(new java.awt.Color(35, 31, 32));
        firstNameLbl1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        firstNameLbl1.setText("Primeiro nome");

        firstNameWarningLbl.setForeground(new java.awt.Color(255, 0, 0));

        firstNameField.setBackground(new java.awt.Color(51, 51, 51));
        firstNameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstNameField.setForeground(new java.awt.Color(153, 153, 153));
        firstNameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 31, 32), 1, true));
        firstNameField.setMaximumSize(new java.awt.Dimension(302, 32));
        firstNameField.setMinimumSize(new java.awt.Dimension(302, 32));
        firstNameField.setPreferredSize(new java.awt.Dimension(302, 32));
        firstNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                firstNameFieldKeyTyped(evt);
            }
        });

        lastNameLbl1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lastNameLbl1.setForeground(new java.awt.Color(35, 31, 32));
        lastNameLbl1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lastNameLbl1.setText("Último nome");

        lastNameWarningLbl.setForeground(new java.awt.Color(255, 0, 0));

        lastNameField.setBackground(new java.awt.Color(51, 51, 51));
        lastNameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lastNameField.setForeground(new java.awt.Color(153, 153, 153));
        lastNameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 31, 32), 1, true));
        lastNameField.setMaximumSize(new java.awt.Dimension(302, 32));
        lastNameField.setMinimumSize(new java.awt.Dimension(302, 32));
        lastNameField.setPreferredSize(new java.awt.Dimension(302, 32));
        lastNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lastNameFieldKeyTyped(evt);
            }
        });

        telephoneLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        telephoneLbl.setForeground(new java.awt.Color(35, 31, 32));
        telephoneLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        telephoneLbl.setText("DDD       Telefone");

        telephoneWarningLbl.setForeground(new java.awt.Color(255, 0, 0));

        dddTelephoneField.setBackground(new java.awt.Color(51, 51, 51));
        dddTelephoneField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dddTelephoneField.setForeground(new java.awt.Color(153, 153, 153));
        dddTelephoneField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 31, 32), 1, true));
        dddTelephoneField.setMaximumSize(new java.awt.Dimension(43, 32));
        dddTelephoneField.setMinimumSize(new java.awt.Dimension(43, 32));
        dddTelephoneField.setPreferredSize(new java.awt.Dimension(43, 32));
        dddTelephoneField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dddTelephoneFieldKeyTyped(evt);
            }
        });

        telephoneField.setBackground(new java.awt.Color(51, 51, 51));
        telephoneField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        telephoneField.setForeground(new java.awt.Color(153, 153, 153));
        telephoneField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 31, 32), 1, true));
        telephoneField.setMaximumSize(new java.awt.Dimension(253, 32));
        telephoneField.setMinimumSize(new java.awt.Dimension(253, 32));
        telephoneField.setPreferredSize(new java.awt.Dimension(253, 32));
        telephoneField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telephoneFieldKeyTyped(evt);
            }
        });

        whatsappLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        whatsappLbl.setForeground(new java.awt.Color(35, 31, 32));
        whatsappLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        whatsappLbl.setText("DDD       Whatsapp (opcional)");

        whatsappWarningLbl.setForeground(new java.awt.Color(255, 0, 0));

        dddWhatsappField.setBackground(new java.awt.Color(51, 51, 51));
        dddWhatsappField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dddWhatsappField.setForeground(new java.awt.Color(153, 153, 153));
        dddWhatsappField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 31, 32), 1, true));
        dddWhatsappField.setMaximumSize(new java.awt.Dimension(43, 32));
        dddWhatsappField.setMinimumSize(new java.awt.Dimension(43, 32));
        dddWhatsappField.setPreferredSize(new java.awt.Dimension(43, 32));
        dddWhatsappField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dddWhatsappFieldKeyTyped(evt);
            }
        });

        whatsappField.setBackground(new java.awt.Color(51, 51, 51));
        whatsappField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        whatsappField.setForeground(new java.awt.Color(153, 153, 153));
        whatsappField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 31, 32), 1, true));
        whatsappField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                whatsappFieldKeyTyped(evt);
            }
        });

        cancelLbl.setBackground(new java.awt.Color(35, 31, 32));
        cancelLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelLbl.setForeground(new java.awt.Color(204, 204, 204));
        cancelLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelLbl.setText("Cancelar");
        cancelLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelLbl.setOpaque(true);
        cancelLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelLblClicked(evt);
            }
        });

        editLbl.setBackground(new java.awt.Color(35, 31, 32));
        editLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editLbl.setForeground(new java.awt.Color(254, 223, 19));
        editLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editLbl.setText("Editar");
        editLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editLbl.setOpaque(true);
        editLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editLblClicked(evt);
            }
        });

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(cpfLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cpfWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(firstNameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(firstNameWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(lastNameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(lastNameWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(telephoneLbl)
                        .addGap(6, 6, 6)
                        .addComponent(telephoneWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addComponent(dddTelephoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(telephoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addComponent(whatsappLbl)
                                .addGap(6, 6, 6)
                                .addComponent(whatsappWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(rightPanelLayout.createSequentialGroup()
                                    .addComponent(dddWhatsappField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(whatsappField, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(editLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(105, 105, 105))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpfLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstNameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastNameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telephoneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telephoneWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dddTelephoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telephoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(whatsappLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(whatsappWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dddWhatsappField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(whatsappField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(editLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        scrollPane.setViewportView(rightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void renderUserImage() {
        Set.setImageResizable(this.userImageLbl, "/main/resources/images/icons/yellow-user_image.png");
    }
    
    @Override
    protected void renderUserName() {
        this.firstNameLbl.setText(super.getCustomer().getFirstName());
        this.lastNameLbl.setText(super.getCustomer().getLastName());
    }
    
    @Override
    protected void limitTextFields() {
        this.cpfField.setDocument(new Documents(11, Documents.REGEX_ONLY_NUMBER));
        this.firstNameField.setDocument(new Documents(15, Documents.REGEX_ONLY_STRING));
        this.lastNameField.setDocument(new Documents(15, Documents.REGEX_ONLY_STRING));
        this.dddTelephoneField.setDocument(new Documents(3, Documents.REGEX_ONLY_NUMBER));
        this.telephoneField.setDocument(new Documents(9, Documents.REGEX_ONLY_NUMBER));
        this.dddWhatsappField.setDocument(new Documents(3, Documents.REGEX_ONLY_NUMBER));
        this.whatsappField.setDocument(new Documents(9, Documents.REGEX_ONLY_NUMBER));
    }
    
    @Override
    protected void changeToDefaultStatus() {
        this.firstNameField.setText(super.getCustomer().getFirstName());
        this.lastNameField.setText(super.getCustomer().getLastName());
        String telephone = super.getContact().getTelephone();
        this.dddTelephoneField.setText(telephone.substring(0, 3));
        this.telephoneField.setText(telephone.substring(3));
        String whatsapp = super.getContact().getWhatsapp();
        if (whatsapp != null) {
            this.dddWhatsappField.setText(whatsapp.substring(0, 3));
            this.whatsappField.setText(whatsapp.substring(3));
        }
        else {
            this.dddWhatsappField.setText("");
            this.whatsappField.setText("");
        }
        Set.setLineBorder(NavigationFrame.BORDER_DEFAULT_COLOR, this.firstNameField, this.lastNameField, this.dddTelephoneField, this.telephoneField, this.dddWhatsappField, this.whatsappField);
        Set.setText("", this.firstNameWarningLbl, this.lastNameWarningLbl, this.telephoneWarningLbl, this.whatsappWarningLbl);
        Set.setCursor(Cursor.DEFAULT_CURSOR, this.firstNameField, this.lastNameField, this.dddTelephoneField, this.telephoneField, this.dddWhatsappField, this.whatsappField);
        Set.setFocusable(false, this.firstNameField, this.lastNameField, this.dddTelephoneField, this.telephoneField, this.dddWhatsappField, this.whatsappField);
        Set.setEditable(false, this.firstNameField, this.lastNameField, this.dddTelephoneField, this.telephoneField, this.dddWhatsappField, this.whatsappField);
        Set.setVisible(false, this.cancelLbl);
        this.editLbl.setText("Editar");
    }
    
    @Override
    protected void changeToEditStatus() {
        Set.setCursor(Cursor.TEXT_CURSOR, this.firstNameField, this.lastNameField, this.dddTelephoneField, this.telephoneField, this.dddWhatsappField, this.whatsappField);
        Set.setFocusable(true, this.firstNameField, this.lastNameField, this.dddTelephoneField, this.telephoneField, this.dddWhatsappField, this.whatsappField);
        Set.setEditable(true, this.firstNameField, this.lastNameField, this.dddTelephoneField, this.telephoneField, this.dddWhatsappField, this.whatsappField);
        Set.setVisible(true, this.cancelLbl);
        this.editLbl.setText("Confirmar");
    }
    
    /**
     * Verifica se o campo primeiro nome tem uma quantidade de caracteres inválida.
     *
     * @return retorna true caso a quantidade de caracteres seja inválida ou false caso seja válida.
     */
    private boolean firstNameSizeNameIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.firstNameField, this.firstNameWarningLbl, this.firstNameField.getText(),
                "nome", Data.MALE_TEXT_FIELD, 2, 15, NavigationFrame.BORDER_DEFAULT_COLOR);
    }
    
    /**
     * Verifica se o campo último nome tem uma quantidade de caracteres inválida.
     *
     * @return retorna true caso a quantidade de caracteres seja inválida ou false caso seja válida.
     */
    private boolean lastNameSizeIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.lastNameField, this.lastNameWarningLbl,this.lastNameField.getText(),
                "nome", Data.MALE_TEXT_FIELD, 2, 15, NavigationFrame.BORDER_DEFAULT_COLOR);
    }
    
    /**
     * Verifica se o campo ddd do telefone tem uma quantidade de caracteres inválida.
     *
     * @return retorna true caso a quantidade de caracteres seja inválida ou false caso seja válida.
     */
    private boolean dddTelephoneSizeIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.dddTelephoneField, this.telephoneWarningLbl, this.dddTelephoneField.getText(),
            "ddd", Data.MALE_TEXT_FIELD, 3, 3, NavigationFrame.BORDER_DEFAULT_COLOR);
    }
    
    /**
     * Verifica se o campo telefone tem uma quantidade de caracteres inválida.
     *
     * @return retorna true caso a quantidade de caracteres seja inválida ou false caso seja válida.
     */
    private boolean telephoneSizeIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.telephoneField, this.telephoneWarningLbl, this.telephoneField.getText(),
            "telefone", Data.MALE_TEXT_FIELD, 9, 9, NavigationFrame.BORDER_DEFAULT_COLOR);
    }
    
    /**
    * Verifica se o campo ddd do whatsapp tem uma quantidade de caracteres inválida.
    *
    * @return retorna true caso a quantidade de caracteres seja inválida ou false caso seja válida.
    */
    private boolean dddWhatsappSizeIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.dddWhatsappField, this.whatsappWarningLbl, this.dddWhatsappField.getText(),
            "ddd", Data.MALE_TEXT_FIELD, 3, 3, NavigationFrame.BORDER_DEFAULT_COLOR);
    }
    
    /**
    * Verifica se o campo whatsapp tem uma quantidade de caracteres inválida.
    *
    * @return retorna true caso a quantidade de caracteres seja inválida ou false caso seja válida.
    */
    private boolean whatsappSizeIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.whatsappField, this.whatsappWarningLbl, this.whatsappField.getText(),
            "whatsapp", Data.MALE_TEXT_FIELD, 9, 9, NavigationFrame.BORDER_DEFAULT_COLOR);
    }
    
    /**
     * Método que retorna um cliente de acordo com os dados nos campos de texto.
     * 
     * @return Retorna um cliente de acordo com os dados nos campos de texto.
     */
    private Customer getCustomerTyped() {
        Customer customerTyped = new Customer();
        customerTyped.setId(super.getCustomer().getId());
        customerTyped.setCpf(this.cpfField.getText());
        customerTyped.setFirstName(this.firstNameField.getText());
        customerTyped.setLastName(this.lastNameField.getText());
        return customerTyped;
    }
    
    /**
     * Método que retorna um contato de acordo com os dados nos campos de texto.
     * 
     * @return Retorna um contato de acordo com os dados nos campos de texto.
     */
    private Contact getContactTyped() {
        Contact contactTyped = new Contact();
        contactTyped.setId(super.getContact().getId());
        contactTyped.setTelephone(this.dddTelephoneField.getText() + this.telephoneField.getText());
        String dddWhatsapp = this.dddWhatsappField.getText();
        String whatsapp = this.whatsappField.getText();
        if (whatsapp.isEmpty()) {
            contactTyped.setWhatsapp(null);
        }
        else {
            contactTyped.setWhatsapp(dddWhatsapp.concat(whatsapp));
        }
        contactTyped.setCustomer(this.getCustomerTyped());
        return contactTyped;
    }
    
    /**
     * Método que tenta fazer a atualização dos dados de endereço, verificanodo antes se cada campo preenchido é válido.
     */
    private void updateData() {
        if (this.firstNameSizeNameIsInvalid() || this.lastNameSizeIsInvalid() || this.dddTelephoneSizeIsInvalid() || this.telephoneSizeIsInvalid()) {
            return;
        }
        String dddWhatsapp = this.dddWhatsappField.getText();
        String whatsapp = this.whatsappField.getText();
        if((!dddWhatsapp.isEmpty() || !whatsapp.isEmpty()) && this.dddWhatsappSizeIsInvalid()) {
            return;
        }
        if(!dddWhatsapp.isEmpty() && this.whatsappSizeIsInvalid()) {
            return;
        }
        Customer customerTyped = this.getCustomerTyped();
        Contact contactTyped = this.getContactTyped();
        try {
            FactoryDAO.createCustomerDAO().save(customerTyped);
            super.setAllCustomer(customerTyped);
            this.renderUserName();
            FactoryDAO.createContactDAO().save(contactTyped);
            super.setContact(contactTyped);
            this.changeToDefaultStatus();
            JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!", "Dados pessoais", JOptionPane.INFORMATION_MESSAGE);
        } catch (DataBaseException dbe) {
            this.changeToDefaultStatus();
            JOptionPane.showMessageDialog(this, "Desculpe, não foi possível atualizar seu dados. Verifique sua conexão.",
                    "Dados Pessoais", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void minimizeLblClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLblClicked
        super.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeLblClicked

    private void exitLblClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblClicked
        System.exit(0);
    }//GEN-LAST:event_exitLblClicked

    private void cartIconLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartIconLblMouseClicked
        if (super.getCart().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Carrinho vazio!", null, JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            Screen.changeScreen(this, new CartFrame());
        }
    }//GEN-LAST:event_cartIconLblMouseClicked

    private void cartLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartLblMouseClicked
        this.cartIconLblMouseClicked(evt);
    }//GEN-LAST:event_cartLblMouseClicked

    private void homeIconLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeIconLblMouseClicked
        Screen.changeScreen(this, new HomeFrame());
    }//GEN-LAST:event_homeIconLblMouseClicked

    private void homeLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLblMouseClicked
        this.homeIconLblMouseClicked(evt);
    }//GEN-LAST:event_homeLblMouseClicked

    private void ordericonLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordericonLblMouseClicked
        Screen.changeScreen(this, new OrderHistoryFrame());
    }//GEN-LAST:event_ordericonLblMouseClicked

    private void orderLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderLblMouseClicked
        this.ordericonLblMouseClicked(evt);
    }//GEN-LAST:event_orderLblMouseClicked

    private void accountDataIconLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountDataIconLblMouseClicked
        Screen.changeScreen(this, new AccountDataFrame());
    }//GEN-LAST:event_accountDataIconLblMouseClicked

    private void accountDataLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountDataLblMouseClicked
        this.accountDataIconLblMouseClicked(evt);
    }//GEN-LAST:event_accountDataLblMouseClicked

    private void addressIconLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressIconLblMouseClicked
        Screen.changeScreen(this, new AddressDataFrame());
    }//GEN-LAST:event_addressIconLblMouseClicked

    private void addressLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressLblMouseClicked
        this.addressIconLblMouseClicked(evt);
    }//GEN-LAST:event_addressLblMouseClicked

    private void deleteAccountIconLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAccountIconLblMouseClicked
        String[] options = {"Cancelar", "Sim, deletar conta"};
        int choice = JOptionPane.showOptionDialog(this, """
                                                        Você tem certeza que deseja DELETAR sua conta?
                                                        Se você optar por essa escolha  todos os  seus
                                                        dados  serão  apagados,  e  você não terá mais
                                                        uma conta.
                                                        """, 
                                                      "Deletar conta", 
                                                      JOptionPane.DEFAULT_OPTION, 
                                                      JOptionPane.QUESTION_MESSAGE , 
                                                      null, options, null);
        if (choice == 0) {
            return;
        }
        String password = null;
        Account userAccount = super.getAccount();
        boolean passwordIsNullOrEquals = false;
        do {
            password = JOptionPane.showInputDialog(this, """
                                                         Digite sua senha para confirmar o cancelamento
                                                         da sua conta.
                                                         """, "Deletar conta", JOptionPane.PLAIN_MESSAGE);
            if (password != null && !password.equals(userAccount.getPassword())) {
                passwordIsNullOrEquals = false;
                JOptionPane.showMessageDialog(this, "Senha incorreta!", "Deletar Conta", JOptionPane.ERROR_MESSAGE);
            }
            else {
                passwordIsNullOrEquals = true;
            }
        } while(!passwordIsNullOrEquals);
        if (password == null) {
            return;
        }
        try {
            FactoryDAO.createCustomerDAO().delete(userAccount.getCustomer());
            super.clear();
            Screen.changeScreen(this, new LoginFrame());
            JOptionPane.showMessageDialog(this, "Conta deletada com sucesso.", null, JOptionPane.INFORMATION_MESSAGE);
        } catch (DataBaseException dbe) {
            JOptionPane.showMessageDialog(this, """
                                                Desculpe, não foi possível deletar sua conta.
                                                Verifique sua conexão.
                                                """, null, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_deleteAccountIconLblMouseClicked

    private void deleteAccountLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAccountLblMouseClicked
        this.deleteAccountIconLblMouseClicked(evt);
    }//GEN-LAST:event_deleteAccountLblMouseClicked

    private void logoutIconLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutIconLblMouseClicked
        String[] options = {"Cancelar", "Confirmar"};
        int choice = JOptionPane.showOptionDialog(this, "Tem certeza que deseja sair da conta?",
                "Sair da conta", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
        if (choice == 1) {
            super.clear();
            Screen.changeScreen(this, new LoginFrame());
        }
    }//GEN-LAST:event_logoutIconLblMouseClicked

    private void logoutLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLbMouseClicked
        this.logoutIconLblMouseClicked(evt);
    }//GEN-LAST:event_logoutLbMouseClicked

    private void firstNameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameFieldKeyTyped
        if (!this.firstNameWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(NavigationFrame.BORDER_DEFAULT_COLOR, this.firstNameField);
            this.firstNameWarningLbl.setText("");
        }
    }//GEN-LAST:event_firstNameFieldKeyTyped

    private void lastNameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameFieldKeyTyped
        if (!this.lastNameWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(NavigationFrame.BORDER_DEFAULT_COLOR, this.lastNameField);
            this.lastNameWarningLbl.setText("");
        }
    }//GEN-LAST:event_lastNameFieldKeyTyped

    private void dddTelephoneFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dddTelephoneFieldKeyTyped
        if (!this.telephoneWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(NavigationFrame.BORDER_DEFAULT_COLOR, this.dddTelephoneField);
            this.telephoneWarningLbl.setText("");
        }
    }//GEN-LAST:event_dddTelephoneFieldKeyTyped

    private void telephoneFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telephoneFieldKeyTyped
        if (!this.telephoneWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(NavigationFrame.BORDER_DEFAULT_COLOR, this.telephoneField);
            this.telephoneWarningLbl.setText("");
        }
    }//GEN-LAST:event_telephoneFieldKeyTyped

    private void dddWhatsappFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dddWhatsappFieldKeyTyped
        if (!this.whatsappWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(NavigationFrame.BORDER_DEFAULT_COLOR, this.dddWhatsappField);
            this.whatsappWarningLbl.setText("");
        }
    }//GEN-LAST:event_dddWhatsappFieldKeyTyped

    private void whatsappFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_whatsappFieldKeyTyped
        if (!this.whatsappWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(NavigationFrame.BORDER_DEFAULT_COLOR, this.whatsappField);
            this.whatsappWarningLbl.setText("");
        }
    }//GEN-LAST:event_whatsappFieldKeyTyped

    private void editLblClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLblClicked
        if (this.editLbl.getText().equalsIgnoreCase("editar")) {
            this.changeToEditStatus();
        }
        else {
            this.updateData();
        }
    }//GEN-LAST:event_editLblClicked

    private void cancelLblClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLblClicked
        this.changeToDefaultStatus();
    }//GEN-LAST:event_cancelLblClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountDataIconLbl;
    private javax.swing.JLabel accountDataLbl;
    private javax.swing.JLabel addressIconLbl;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JLabel cancelLbl;
    private javax.swing.JLabel cartIconLbl;
    private javax.swing.JLabel cartLbl;
    private javax.swing.JTextField cpfField;
    private javax.swing.JLabel cpfLbl;
    private javax.swing.JLabel cpfWarningLbl;
    private javax.swing.JTextField dddTelephoneField;
    private javax.swing.JTextField dddWhatsappField;
    private javax.swing.JLabel deleteAccountIconLbl;
    private javax.swing.JLabel deleteAccountLbl;
    private javax.swing.JLabel editLbl;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLbl;
    private javax.swing.JLabel firstNameLbl1;
    private javax.swing.JLabel firstNameWarningLbl;
    private javax.swing.JLabel homeIconLbl;
    private javax.swing.JLabel homeLbl;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLbl;
    private javax.swing.JLabel lastNameLbl1;
    private javax.swing.JLabel lastNameWarningLbl;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel logoutIconLbl;
    private javax.swing.JLabel logoutLb;
    private javax.swing.JLabel minimizeLbl;
    private javax.swing.JLabel orderLbl;
    private javax.swing.JLabel ordericonLbl;
    private javax.swing.JLabel personalDataIconLbl;
    private javax.swing.JLabel personalDataLbl;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextField telephoneField;
    private javax.swing.JLabel telephoneLbl;
    private javax.swing.JLabel telephoneWarningLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel userImageLbl;
    private javax.swing.JTextField whatsappField;
    private javax.swing.JLabel whatsappLbl;
    private javax.swing.JLabel whatsappWarningLbl;
    // End of variables declaration//GEN-END:variables

}