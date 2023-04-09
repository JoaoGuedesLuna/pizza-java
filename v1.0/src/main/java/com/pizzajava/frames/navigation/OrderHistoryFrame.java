package main.java.com.pizzajava.frames.navigation;

import java.awt.Color;
import java.awt.Font;
import java.util.List;
import main.java.com.pizzajava.frames.login.LoginFrame;
import main.java.com.pizzajava.model.Account;
import main.java.com.pizzajava.database.DataBaseException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import main.java.com.pizzajava.dao.FactoryDAO;
import main.java.com.pizzajava.model.Item;
import main.java.com.pizzajava.model.Order;
import main.java.com.pizzajava.util.Data;
import main.java.com.pizzajava.util.Screen;
import main.java.com.pizzajava.util.Set;

/**
 * Painel onde o usuário poderá ver o histórico de pedidos que ele já realizou.
 * 
 * @author João Guedes.
 */
public final class OrderHistoryFrame extends NavigationFrame {
    
    private final Font SEGOIUIFONT = new Font("Segoe UI", Font.BOLD, 14);
    
    public OrderHistoryFrame() {
        super();
        this.initComponents();
        this.renderUserImage();
        this.renderUserName();
        this.renderOrderHistory();
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

        rightPanel.setBackground(new java.awt.Color(51, 51, 51));
        rightPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 30));
        rightPanel.setLayout(new javax.swing.BoxLayout(rightPanel, javax.swing.BoxLayout.Y_AXIS));
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
    
    /**
     * Carrega do banco de dados todos os pedidos feitos pelo usuário da conta.
     */
    private void renderOrderHistory() {
        try {
            List<Order> userOrders = FactoryDAO.createOrderDAO().findAllByCustomerId(this.getCustomer().getId());
            for (int i = 0; i < userOrders.size(); i++) {
                Order order = userOrders.get(i);
                String orderNumberText = String.format("<html><body>Pedido [%d]</body></html>", (i+1));
                JLabel orderNumberLabel = this.createJlabel(orderNumberText, this.SEGOIUIFONT, Color.yellow);
                this.rightPanel.add(orderNumberLabel);
                List<Item> orderItems = FactoryDAO.createItemDAO().findAllByOrderId(order.getId());
                for (int j = 0; j < orderItems.size(); j++) {
                    Item item = orderItems.get(j);
                    String itemText = String.format("<html><body>* Item %d : %d Pizza(s) de %s</body></html>", (j+1), item.getQuantity(), item.getName());
                    JLabel itemLabel = this.createJlabel(itemText, this.SEGOIUIFONT, Color.lightGray);
                    this.rightPanel.add(itemLabel);
                }
                String orderDateText = String.format("<html><body>* Data do Pedido : %s</body></html>", Data.formatDate(order.getDate().toString()));
                JLabel orderDateLabel = this.createJlabel(orderDateText, this.SEGOIUIFONT, Color.lightGray);
                String orderTotalPriceText = String.format("<html><body>* Valor Total : R$ %.2f</body></html>", order.getTotalPrice());
                JLabel orderTotalPriceLabel = this.createJlabel(orderTotalPriceText, this.SEGOIUIFONT, Color.lightGray);
                this.rightPanel.add(orderDateLabel);
                this.rightPanel.add(orderTotalPriceLabel);
                JLabel spaceLabel = this.createJlabel("          ", this.SEGOIUIFONT, Color.lightGray);
                this.rightPanel.add(spaceLabel);
            }
        } catch (DataBaseException dbe) {
            JOptionPane.showMessageDialog(this, "Desculpe, não foi possível buscar seu histórico. Verifique sua conexão.",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * Cria um JLabel.
     *
     * @param text  texto que será inserido no JLabel.
     *
     * @param font fonte do texto do JLabel.
     *
     * @param foregroundColor cor do texto do JLabel.
     *
     * @return retorna um Jlabel.
     */
    private JLabel createJlabel(String text, Font font, Color foregroundColor) {
        JLabel label = new JLabel();
        label.setFont(font);
        label.setForeground(foregroundColor);
        label.setText(text);
        return label;
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

    private void accountDataIconLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountDataIconLblMouseClicked
        Screen.changeScreen(this, new AccountDataFrame());
    }//GEN-LAST:event_accountDataIconLblMouseClicked

    private void accountDataLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountDataLblMouseClicked
        this.accountDataIconLblMouseClicked(evt);
    }//GEN-LAST:event_accountDataLblMouseClicked

    private void personalDataIconLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personalDataIconLblMouseClicked
        Screen.changeScreen(this, new PersonalDataFrame());
    }//GEN-LAST:event_personalDataIconLblMouseClicked

    private void personalDataLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personalDataLblMouseClicked
        this.personalDataIconLblMouseClicked(evt);
    }//GEN-LAST:event_personalDataLblMouseClicked

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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountDataIconLbl;
    private javax.swing.JLabel accountDataLbl;
    private javax.swing.JLabel addressIconLbl;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JLabel cartIconLbl;
    private javax.swing.JLabel cartLbl;
    private javax.swing.JLabel deleteAccountIconLbl;
    private javax.swing.JLabel deleteAccountLbl;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JLabel firstNameLbl;
    private javax.swing.JLabel homeIconLbl;
    private javax.swing.JLabel homeLbl;
    private javax.swing.JLabel lastNameLbl;
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
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel userImageLbl;
    // End of variables declaration//GEN-END:variables

}