package main.java.com.pizzajava.frames.navigation;

import java.awt.Cursor;
import main.java.com.pizzajava.frames.login.LoginFrame;
import main.java.com.pizzajava.model.Account;
import main.java.com.pizzajava.database.DataBaseException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import main.java.com.pizzajava.dao.FactoryDAO;
import main.java.com.pizzajava.model.Address;
import main.java.com.pizzajava.util.Data;
import main.java.com.pizzajava.util.Documents;
import main.java.com.pizzajava.util.Screen;
import main.java.com.pizzajava.util.Set;

/**
 * Este painel permite ao usuário que ele visualize ou edite seus dados de endereço.
 *
 * @author João Guedes.
 */
public final class AddressDataFrame extends NavigationFrame {
    
    public AddressDataFrame() {
        super();
        this.initComponents();
        this.renderUserImage();
        this.renderUserName();
        this.limitTextFields();
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
        zipCodeLbl = new javax.swing.JLabel();
        zipCodeWarningLbl = new javax.swing.JLabel();
        zipCodeField = new javax.swing.JTextField();
        numberLbl = new javax.swing.JLabel();
        numberWarningLbl = new javax.swing.JLabel();
        numberField = new javax.swing.JTextField();
        streetLbl = new javax.swing.JLabel();
        streetWarningLbl = new javax.swing.JLabel();
        streetField = new javax.swing.JTextField();
        neighborhoodLbl = new javax.swing.JLabel();
        neighborhoodWarningLbl = new javax.swing.JLabel();
        neighborhoodField = new javax.swing.JTextField();
        complementLbl = new javax.swing.JLabel();
        complementWarningLbl = new javax.swing.JLabel();
        complementField = new javax.swing.JTextField();
        cityLbl = new javax.swing.JLabel();
        cityWarningLbl = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        stateLbl = new javax.swing.JLabel();
        stateWarningLbl = new javax.swing.JLabel();
        stateField = new javax.swing.JTextField();
        countryLbl = new javax.swing.JLabel();
        countryWarningLbl = new javax.swing.JLabel();
        countryField = new javax.swing.JTextField();
        editLbl = new javax.swing.JLabel();
        cancelLbl = new javax.swing.JLabel();

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
        personalDataIconLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personalDataIconLblMouseClicked(evt);
            }
        });

        personalDataLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        personalDataLbl.setForeground(new java.awt.Color(204, 204, 204));
        personalDataLbl.setText("Dados Pessoais");
        personalDataLbl.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        personalDataLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        personalDataLbl.setMaximumSize(new java.awt.Dimension(142, 30));
        personalDataLbl.setMinimumSize(new java.awt.Dimension(142, 30));
        personalDataLbl.setPreferredSize(new java.awt.Dimension(142, 30));
        personalDataLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personalDataLblMouseClicked(evt);
            }
        });

        addressIconLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/icons/white-address.png"))); // NOI18N
        addressIconLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addressIconLbl.setMaximumSize(new java.awt.Dimension(30, 30));
        addressIconLbl.setMinimumSize(new java.awt.Dimension(30, 30));
        addressIconLbl.setPreferredSize(new java.awt.Dimension(30, 30));

        addressLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addressLbl.setForeground(new java.awt.Color(204, 204, 204));
        addressLbl.setText("Endereço");
        addressLbl.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        addressLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addressLbl.setMaximumSize(new java.awt.Dimension(142, 30));
        addressLbl.setMinimumSize(new java.awt.Dimension(142, 30));
        addressLbl.setPreferredSize(new java.awt.Dimension(142, 30));

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
        rightPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rightPanel.setMaximumSize(new java.awt.Dimension(400, 500));
        rightPanel.setMinimumSize(new java.awt.Dimension(400, 500));

        titleLbl.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(35, 31, 32));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Endereço");

        zipCodeLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        zipCodeLbl.setForeground(new java.awt.Color(35, 31, 32));
        zipCodeLbl.setText("CEP");

        zipCodeWarningLbl.setForeground(new java.awt.Color(255, 0, 0));

        zipCodeField.setBackground(new java.awt.Color(51, 51, 51));
        zipCodeField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        zipCodeField.setForeground(new java.awt.Color(153, 153, 153));
        zipCodeField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 31, 32), 1, true));
        zipCodeField.setMaximumSize(new java.awt.Dimension(145, 32));
        zipCodeField.setMinimumSize(new java.awt.Dimension(145, 32));
        zipCodeField.setPreferredSize(new java.awt.Dimension(145, 32));
        zipCodeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                zipCodeFieldKeyTyped(evt);
            }
        });

        numberLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numberLbl.setForeground(new java.awt.Color(35, 31, 32));
        numberLbl.setText("Nº (opcional)");

        numberWarningLbl.setForeground(new java.awt.Color(255, 0, 0));

        numberField.setBackground(new java.awt.Color(51, 51, 51));
        numberField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numberField.setForeground(new java.awt.Color(153, 153, 153));
        numberField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 31, 32), 1, true));
        numberField.setMaximumSize(new java.awt.Dimension(145, 32));
        numberField.setMinimumSize(new java.awt.Dimension(145, 32));
        numberField.setPreferredSize(new java.awt.Dimension(145, 32));

        streetLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        streetLbl.setForeground(new java.awt.Color(35, 31, 32));
        streetLbl.setText("Rua");

        streetWarningLbl.setForeground(new java.awt.Color(255, 0, 0));

        streetField.setBackground(new java.awt.Color(51, 51, 51));
        streetField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        streetField.setForeground(new java.awt.Color(153, 153, 153));
        streetField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 31, 32), 1, true));
        streetField.setMaximumSize(new java.awt.Dimension(302, 32));
        streetField.setMinimumSize(new java.awt.Dimension(302, 32));
        streetField.setPreferredSize(new java.awt.Dimension(302, 32));
        streetField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                streetFieldKeyTyped(evt);
            }
        });

        neighborhoodLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        neighborhoodLbl.setForeground(new java.awt.Color(35, 31, 32));
        neighborhoodLbl.setText("Bairro");

        neighborhoodWarningLbl.setForeground(new java.awt.Color(255, 0, 0));

        neighborhoodField.setBackground(new java.awt.Color(51, 51, 51));
        neighborhoodField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        neighborhoodField.setForeground(new java.awt.Color(153, 153, 153));
        neighborhoodField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 31, 32), 1, true));
        neighborhoodField.setMaximumSize(new java.awt.Dimension(302, 32));
        neighborhoodField.setMinimumSize(new java.awt.Dimension(302, 32));
        neighborhoodField.setPreferredSize(new java.awt.Dimension(302, 32));
        neighborhoodField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                neighborhoodFieldKeyTyped(evt);
            }
        });

        complementLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        complementLbl.setForeground(new java.awt.Color(35, 31, 32));
        complementLbl.setText("Complemento (opcional)");

        complementWarningLbl.setForeground(new java.awt.Color(255, 0, 0));

        complementField.setBackground(new java.awt.Color(51, 51, 51));
        complementField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        complementField.setForeground(new java.awt.Color(153, 153, 153));
        complementField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 31, 32), 1, true));
        complementField.setMaximumSize(new java.awt.Dimension(302, 32));
        complementField.setMinimumSize(new java.awt.Dimension(302, 32));
        complementField.setPreferredSize(new java.awt.Dimension(302, 32));

        cityLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cityLbl.setForeground(new java.awt.Color(35, 31, 32));
        cityLbl.setText("Cidade");

        cityWarningLbl.setForeground(new java.awt.Color(255, 0, 0));

        cityField.setBackground(new java.awt.Color(51, 51, 51));
        cityField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cityField.setForeground(new java.awt.Color(153, 153, 153));
        cityField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 31, 32), 1, true));
        cityField.setMaximumSize(new java.awt.Dimension(302, 32));
        cityField.setMinimumSize(new java.awt.Dimension(302, 32));
        cityField.setPreferredSize(new java.awt.Dimension(302, 32));
        cityField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cityFieldKeyTyped(evt);
            }
        });

        stateLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stateLbl.setForeground(new java.awt.Color(35, 31, 32));
        stateLbl.setText("Estado");

        stateWarningLbl.setForeground(new java.awt.Color(255, 0, 0));

        stateField.setBackground(new java.awt.Color(51, 51, 51));
        stateField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        stateField.setForeground(new java.awt.Color(153, 153, 153));
        stateField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 31, 32), 1, true));
        stateField.setMaximumSize(new java.awt.Dimension(302, 32));
        stateField.setMinimumSize(new java.awt.Dimension(302, 32));
        stateField.setPreferredSize(new java.awt.Dimension(302, 32));
        stateField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stateFieldKeyTyped(evt);
            }
        });

        countryLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        countryLbl.setForeground(new java.awt.Color(35, 31, 32));
        countryLbl.setText("País");

        countryWarningLbl.setForeground(new java.awt.Color(255, 0, 0));

        countryField.setBackground(new java.awt.Color(51, 51, 51));
        countryField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        countryField.setForeground(new java.awt.Color(153, 153, 153));
        countryField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 31, 32), 1, true));
        countryField.setMaximumSize(new java.awt.Dimension(302, 32));
        countryField.setMinimumSize(new java.awt.Dimension(302, 32));
        countryField.setPreferredSize(new java.awt.Dimension(302, 32));
        countryField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                countryFieldKeyTyped(evt);
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

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(zipCodeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zipCodeWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numberLbl)
                        .addGap(1, 1, 1)
                        .addComponent(numberWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(streetWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(streetLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(neighborhoodLbl)
                        .addGap(8, 8, 8)
                        .addComponent(neighborhoodWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(complementLbl)
                        .addGap(3, 3, 3)
                        .addComponent(complementWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(neighborhoodField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityLbl)
                    .addComponent(complementField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(cityWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(stateLbl)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(stateWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(countryLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(countryWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cancelLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(countryField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(99, 99, 99))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(titleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zipCodeLbl)
                    .addComponent(zipCodeWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberLbl)
                    .addComponent(numberWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(streetWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(streetLbl))))
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(neighborhoodLbl)
                            .addComponent(neighborhoodWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(neighborhoodField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(complementLbl)
                            .addComponent(complementWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(complementField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cityLbl)
                            .addComponent(cityWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stateLbl)
                            .addComponent(stateWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stateField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(countryLbl)
                            .addComponent(countryWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(countryField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
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
        this.zipCodeField.setDocument(new Documents(8, Documents.REGEX_ONLY_NUMBER));
        this.numberField.setDocument(new Documents(10, Documents.REGEX_ONLY_NUMBER));
        this.streetField.setDocument(new Documents(50, Documents.REGEX_STRING_AND_SPACE));
        this.neighborhoodField.setDocument(new Documents(20, Documents.REGEX_STRING_AND_SPACE));
        this.complementField.setDocument(new Documents(50, Documents.REGEX_SPECIAL_CHARACTER));
        this.cityField.setDocument(new Documents(20, Documents.REGEX_STRING_AND_SPACE));
        this.stateField.setDocument(new Documents(20, Documents.REGEX_STRING_AND_SPACE));
        this.countryField.setDocument(new Documents(15, Documents.REGEX_STRING_AND_SPACE));
    }
    
    @Override
    protected void changeToDefaultStatus() {
        Set.setText("", this.zipCodeWarningLbl, this.numberWarningLbl, this.streetWarningLbl, this.neighborhoodWarningLbl, this.complementWarningLbl, this.cityWarningLbl, this.stateWarningLbl, this.countryWarningLbl);
        Set.setLineBorder(NavigationFrame.BORDER_DEFAULT_COLOR, this.zipCodeField, this.numberField, this.streetField, this.neighborhoodField, this.complementField, this.cityField, this.stateField, this.countryField);
        Set.setCursor(Cursor.DEFAULT_CURSOR, this.zipCodeField, this.numberField, this.streetField, this.neighborhoodField, this.complementField, this.cityField, this.stateField, this.countryField);
        Set.setFocusable(false, this.zipCodeField, this.numberField, this.streetField, this.neighborhoodField, this.complementField, this.cityField, this.stateField, this.countryField);
        Set.setEditable(false, this.zipCodeField, this.numberField, this.streetField, this.neighborhoodField, this.complementField, this.cityField, this.stateField, this.countryField);
        Address userAddress = super.getAddress();
        this.zipCodeField.setText(userAddress.getZipCode());
        this.numberField.setText(Integer.toString(userAddress.getNumber()));
        this.streetField.setText(userAddress.getStreet());
        this.neighborhoodField.setText(userAddress.getNeighborhood());
        this.complementField.setText(userAddress.getComplement());
        this.cityField.setText(userAddress.getCity());
        this.stateField.setText(userAddress.getState());
        this.countryField.setText(userAddress.getCountry());
        this.editLbl.setText("Editar");
        this.cancelLbl.setVisible(false);
    }
    
    @Override
    protected void changeToEditStatus() {
        Set.setCursor(Cursor.TEXT_CURSOR, this.zipCodeField, this.numberField, this.streetField, this.neighborhoodField, this.complementField, this.cityField, this.stateField, this.countryField);
        Set.setFocusable(true, this.zipCodeField, this.numberField, this.streetField, this.neighborhoodField, this.complementField, this.cityField, this.stateField, this.countryField);
        Set.setEditable(true, this.zipCodeField, this.numberField, this.streetField, this.neighborhoodField, this.complementField, this.cityField, this.stateField, this.countryField);
        Set.setVisible(true, this.cancelLbl);
        this.editLbl.setText("Confirmar");
    }
    
    /**
     * verifica se a quantidade de caracteres do código postal (CEP) é inválida.
     *
     * @return true caso quantidade de caracteres do código postal seja inválida ou false caso seja válida.
     */
    private boolean zipCodeSizeIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.zipCodeField, this.zipCodeWarningLbl, this.zipCodeField.getText(),
                "cep", Data.MALE_TEXT_FIELD, 8, 8, NavigationFrame.BORDER_DEFAULT_COLOR);
    }

    /**
     * verifica se a quantidade de caracteres da rua é inválida.
     *
     * @return true caso quantidade de caracteres da rua seja inválida ou false caso seja válida.
     */
    private boolean streetSizeIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.streetField, this.streetWarningLbl, this.streetField.getText(),
                "rua", Data.FEMALE_TEXT_FIELD, 2, 50, NavigationFrame.BORDER_DEFAULT_COLOR);
    }

    /**
     * verifica se a quantidade de caracteres do bairro é inválida.
     *
     * @return true caso quantidade de caracteres do bairro seja inválida ou false caso seja válida.
     */
    private boolean neighborhoodSizeIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.neighborhoodField, this.neighborhoodWarningLbl, this.neighborhoodField.getText(),
                "bairro", Data.MALE_TEXT_FIELD, 2, 30, NavigationFrame.BORDER_DEFAULT_COLOR);
    }

    /**
     * verifica se a quantidade de caracteres da cidade é inválida.
     *
     * @return true caso quantidade de caracteres da cidade seja inválida ou false caso seja válida.
     */
    private boolean citySizeIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.cityField, this.cityWarningLbl, this.cityField.getText(),
                "cidade", Data.FEMALE_TEXT_FIELD, 2, 20, NavigationFrame.BORDER_DEFAULT_COLOR);
    }

    /**
     * verifica se a quantidade de caracteres do estado é inválida.
     *
     * @return true caso quantidade de caracteres do estado seja inválida ou false caso seja válida.
     */
    private boolean stateSizeIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.stateField, this.stateWarningLbl, this.stateField.getText(),
                "estado", Data.MALE_TEXT_FIELD, 2, 20, NavigationFrame.BORDER_DEFAULT_COLOR);
    }

    /**
     * verifica se a quantidade de caracteres do país é inválida.
     *
     * @return true caso quantidade de caracteres do país seja inválida ou false caso seja válida.
     */
    private boolean countrySizeIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.countryField, this.countryWarningLbl, this.countryField.getText(),
                "país", Data.MALE_TEXT_FIELD, 2, 15, NavigationFrame.BORDER_DEFAULT_COLOR);
    }
    
    /**
     * Método que retorna um endereço de acordo com os dados nos campos de texto.
     * 
     * @return Retorna um endereço de acordo com os dados nos campos de texto.
     */
    private Address getAddressTyped() {
        Address addressTyped = new Address();
        addressTyped.setId(super.getAddress().getId());
        addressTyped.setZipCode(this.zipCodeField.getText());
        if (!this.numberField.getText().isEmpty()) {
            addressTyped.setNumber(Integer.parseInt(this.numberField.getText()));
        }
        else {
            addressTyped.setNumber(0);
        }
        addressTyped.setStreet(this.streetField.getText().trim());
        addressTyped.setNeighborhood(this.neighborhoodField.getText().trim());
        if (!this.complementField.getText().isEmpty()) {
            addressTyped.setComplement(this.complementField.getText().trim());
        }
        else {
            addressTyped.setComplement(null);
        }
        addressTyped.setCity(this.cityField.getText().trim());
        addressTyped.setState(this.stateField.getText().trim());
        addressTyped.setCountry(this.countryField.getText().trim());
        addressTyped.setCustomer(super.getCustomer());
        return addressTyped;
    }
    
    /**
     * Método que tenta fazer a atualização dos dados de endereço, verificanodo antes se cada campo preenchido é válido.
     */
    private void updateData() {
        if (this.zipCodeSizeIsInvalid() || this.streetSizeIsInvalid() || this.neighborhoodSizeIsInvalid() || this.citySizeIsInvalid() || this.stateSizeIsInvalid() || this.countrySizeIsInvalid()) {
            return;
        }
        Address addressTyped = this.getAddressTyped();
        try {
            FactoryDAO.createAddressDAO().save(addressTyped);
            super.setAddress(addressTyped);
            this.changeToDefaultStatus();
            JOptionPane.showMessageDialog(this, "Dados atualizados com sucesso!", "Endereço", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (DataBaseException dbe) {
            this.changeToDefaultStatus();
            JOptionPane.showMessageDialog(this, "Desculpe, não foi possível atualizar seus dados. Verifique sua conexão.",
                    "Endereço", JOptionPane.INFORMATION_MESSAGE);
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

    private void personalDataIconLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personalDataIconLblMouseClicked
        Screen.changeScreen(this, new AddressDataFrame());
    }//GEN-LAST:event_personalDataIconLblMouseClicked

    private void personalDataLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personalDataLblMouseClicked
        this.personalDataIconLblMouseClicked(evt);
    }//GEN-LAST:event_personalDataLblMouseClicked

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

    private void zipCodeFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_zipCodeFieldKeyTyped
        if (!this.zipCodeWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(NavigationFrame.BORDER_DEFAULT_COLOR, this.zipCodeField);
            this.zipCodeWarningLbl.setText("");
        }
    }//GEN-LAST:event_zipCodeFieldKeyTyped

    private void streetFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_streetFieldKeyTyped
        if (!this.streetWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(NavigationFrame.BORDER_DEFAULT_COLOR, this.streetField);
            this.streetWarningLbl.setText("");
        }
    }//GEN-LAST:event_streetFieldKeyTyped

    private void neighborhoodFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_neighborhoodFieldKeyTyped
        if (!this.neighborhoodWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(NavigationFrame.BORDER_DEFAULT_COLOR, this.neighborhoodField);
            this.neighborhoodWarningLbl.setText("");
        }
    }//GEN-LAST:event_neighborhoodFieldKeyTyped

    private void cityFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityFieldKeyTyped
        if (!this.cityWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(NavigationFrame.BORDER_DEFAULT_COLOR, this.cityField);
            this.cityWarningLbl.setText("");
        }
    }//GEN-LAST:event_cityFieldKeyTyped

    private void stateFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stateFieldKeyTyped
        if (!this.stateWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(NavigationFrame.BORDER_DEFAULT_COLOR, this.stateField);
            this.stateWarningLbl.setText("");
        }
    }//GEN-LAST:event_stateFieldKeyTyped

    private void countryFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_countryFieldKeyTyped
        if (!this.countryWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(NavigationFrame.BORDER_DEFAULT_COLOR, this.countryField);
            this.countryWarningLbl.setText("");
        }
    }//GEN-LAST:event_countryFieldKeyTyped

    private void cancelLblClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLblClicked
        this.changeToDefaultStatus();
    }//GEN-LAST:event_cancelLblClicked

    private void editLblClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLblClicked
        if (this.editLbl.getText().equalsIgnoreCase("editar")) {
            this.changeToEditStatus();
        }
        else {
            this.updateData();
        }
    }//GEN-LAST:event_editLblClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountDataIconLbl;
    private javax.swing.JLabel accountDataLbl;
    private javax.swing.JLabel addressIconLbl;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JLabel cancelLbl;
    private javax.swing.JLabel cartIconLbl;
    private javax.swing.JLabel cartLbl;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel cityLbl;
    private javax.swing.JLabel cityWarningLbl;
    private javax.swing.JTextField complementField;
    private javax.swing.JLabel complementLbl;
    private javax.swing.JLabel complementWarningLbl;
    private javax.swing.JTextField countryField;
    private javax.swing.JLabel countryLbl;
    private javax.swing.JLabel countryWarningLbl;
    private javax.swing.JLabel deleteAccountIconLbl;
    private javax.swing.JLabel deleteAccountLbl;
    private javax.swing.JLabel editLbl;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JLabel firstNameLbl;
    private javax.swing.JLabel homeIconLbl;
    private javax.swing.JLabel homeLbl;
    private javax.swing.JLabel lastNameLbl;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel logoutIconLbl;
    private javax.swing.JLabel logoutLb;
    private javax.swing.JLabel minimizeLbl;
    private javax.swing.JTextField neighborhoodField;
    private javax.swing.JLabel neighborhoodLbl;
    private javax.swing.JLabel neighborhoodWarningLbl;
    private javax.swing.JTextField numberField;
    private javax.swing.JLabel numberLbl;
    private javax.swing.JLabel numberWarningLbl;
    private javax.swing.JLabel orderLbl;
    private javax.swing.JLabel ordericonLbl;
    private javax.swing.JLabel personalDataIconLbl;
    private javax.swing.JLabel personalDataLbl;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextField stateField;
    private javax.swing.JLabel stateLbl;
    private javax.swing.JLabel stateWarningLbl;
    private javax.swing.JTextField streetField;
    private javax.swing.JLabel streetLbl;
    private javax.swing.JLabel streetWarningLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel userImageLbl;
    private javax.swing.JTextField zipCodeField;
    private javax.swing.JLabel zipCodeLbl;
    private javax.swing.JLabel zipCodeWarningLbl;
    // End of variables declaration//GEN-END:variables

}