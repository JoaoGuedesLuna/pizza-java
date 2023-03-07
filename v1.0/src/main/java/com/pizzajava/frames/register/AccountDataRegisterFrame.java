package main.java.com.pizzajava.frames.register;

import main.java.com.pizzajava.frames.navigation.HomeFrame;
import java.awt.Color;
import java.awt.Cursor;
import main.java.com.pizzajava.model.Account;
import main.java.com.pizzajava.util.Documents;
import main.java.com.pizzajava.database.DataBaseException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import main.java.com.pizzajava.dao.FactoryDAO;
import main.java.com.pizzajava.util.Data;
import main.java.com.pizzajava.util.Screen;
import main.java.com.pizzajava.util.Set;

/**
 * Janela onde o usuário poderá preencher os dados de acesso da conta para poder criar uma nova conta.
 *
 * @author João Guedes.
 */
public final class AccountDataRegisterFrame extends RegisterFrame {
    
    public AccountDataRegisterFrame() {
        super();
        this.initComponents();
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
        passwordLbl = new javax.swing.JLabel();
        passwordWarningLbl = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        confirmPasswordLbl = new javax.swing.JLabel();
        confirmPasswordWarningLbl = new javax.swing.JLabel();
        confirmPasswordField = new javax.swing.JPasswordField();
        previousLbl = new javax.swing.JLabel();
        registerLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);
        setResizable(false);

        leftPanel.setMaximumSize(new java.awt.Dimension(300, 500));
        leftPanel.setMinimumSize(new java.awt.Dimension(300, 500));
        leftPanel.setPreferredSize(new java.awt.Dimension(300, 500));

        logoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/pizzajava/black-logo.png"))); // NOI18N

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoLbl)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        rightPanel.setBackground(new java.awt.Color(254, 223, 19));
        rightPanel.setForeground(new java.awt.Color(35, 31, 32));
        rightPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rightPanel.setMaximumSize(new java.awt.Dimension(400, 500));
        rightPanel.setMinimumSize(new java.awt.Dimension(400, 500));
        rightPanel.setPreferredSize(new java.awt.Dimension(400, 500));

        exitLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitLbl.setForeground(new java.awt.Color(35, 31, 32));
        exitLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/icons/black-exit.png"))); // NOI18N
        exitLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLblClicked(evt);
            }
        });

        minimizeLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        minimizeLbl.setForeground(new java.awt.Color(35, 31, 32));
        minimizeLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/icons/balck-minimize.png"))); // NOI18N
        minimizeLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLblClicked(evt);
            }
        });

        titleLbl.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(35, 31, 32));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Dados da Conta");

        emailLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emailLbl.setForeground(new java.awt.Color(35, 31, 32));
        emailLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        emailLbl.setText("Email");

        emailWarningLbl.setForeground(new java.awt.Color(255, 0, 0));

        emailField.setBackground(new java.awt.Color(51, 51, 51));
        emailField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailField.setForeground(new java.awt.Color(153, 153, 153));
        emailField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 31, 32), 1, true));
        emailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailFieldKeyTyped(evt);
            }
        });

        passwordLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLbl.setForeground(new java.awt.Color(35, 31, 32));
        passwordLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passwordLbl.setText("Senha");

        passwordWarningLbl.setForeground(new java.awt.Color(255, 0, 0));

        passwordField.setBackground(new java.awt.Color(51, 51, 51));
        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(153, 153, 153));
        passwordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 31, 32), 1, true));
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordFieldKeyTyped(evt);
            }
        });

        confirmPasswordLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        confirmPasswordLbl.setForeground(new java.awt.Color(35, 31, 32));
        confirmPasswordLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        confirmPasswordLbl.setText("Confirmar senha");

        confirmPasswordWarningLbl.setForeground(new java.awt.Color(255, 0, 0));

        confirmPasswordField.setBackground(new java.awt.Color(51, 51, 51));
        confirmPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        confirmPasswordField.setForeground(new java.awt.Color(153, 153, 153));
        confirmPasswordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 31, 32), 1, true));
        confirmPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                confirmPasswordFieldKeyTyped(evt);
            }
        });

        previousLbl.setBackground(new java.awt.Color(35, 31, 32));
        previousLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        previousLbl.setForeground(new java.awt.Color(204, 204, 204));
        previousLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        previousLbl.setText("Voltar");
        previousLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previousLbl.setOpaque(true);
        previousLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousLblClicked(evt);
            }
        });

        registerLbl.setBackground(new java.awt.Color(35, 31, 32));
        registerLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registerLbl.setForeground(new java.awt.Color(254, 223, 19));
        registerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerLbl.setText("Cadastrar");
        registerLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerLbl.setOpaque(true);
        registerLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerLblClicked(evt);
            }
        });

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailWarningLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                        .addComponent(previousLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(registerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(confirmPasswordLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirmPasswordWarningLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(passwordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordWarningLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(minimizeLbl)
                .addGap(4, 4, 4)
                .addComponent(exitLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(minimizeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitLbl))
                .addGap(57, 57, 57)
                .addComponent(titleLbl)
                .addGap(10, 10, 10)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailLbl)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(emailWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(0, 0, 0)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl)
                    .addComponent(passwordWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(confirmPasswordLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(confirmPasswordWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114))
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
            .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void limitTextFields() {
        this.emailField.setDocument(new Documents(50, Documents.REGEX_EMAIL));
        this.passwordField.setDocument(new Documents(15, " "));
        this.confirmPasswordField.setDocument(new Documents(15, " "));
    }

    @Override
    protected void populateTextFields() {}
    
    /**
     * Faz o painel ficar em seu estado padrão, permitindo os campos de texto serem editados e os botões de cadastrar
     * e de voltar serem usados.
     */
    private void changeToDefaultStatus() {
        this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        Set.setCursor(Cursor.TEXT_CURSOR, this.emailField, this.passwordField, this.confirmPasswordField);
        Set.setCursor(Cursor.HAND_CURSOR, this.previousLbl, this.registerLbl);
        Set.setFocusable(true, this.emailField, this.passwordField, this.confirmPasswordField);
        Set.setEditable(true, this.emailField, this.passwordField, this.confirmPasswordField);
    }
    
    /**
     * Coloca o painel em estado de carregamento, os campos de texto ficam bloqueados e os botões de voltar
     * e o de cadastar ficam sem poder ser usados.
     */
    private void changeToLoadingStatus() {
        this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        Set.setCursor(Cursor.WAIT_CURSOR, this.emailField, this.passwordField, this.confirmPasswordField, this.previousLbl, this.registerLbl);
        Set.setFocusable(false, this.emailField, this.passwordField, this.confirmPasswordField);
        Set.setEditable(false, this.emailField, this.passwordField, this.confirmPasswordField);
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
     * Verifica se a quantidade de caracteres digitados no email são inválidos ou ser o email já tem um cadastro no sistema.
     *
     * @return true caso a quantidade de caracteres digitados no email sejam inválidos ou caso email já tenha um cadastro no sistema e
     * false caso contrário.
     */
    private boolean emailIsInvalidOrRegistered() {
        boolean emailSizeIsInvalid = Data.textFieldSizeIsInvalid(this.emailField, this.emailWarningLbl,this.emailField.getText(),
                "email", Data.MALE_TEXT_FIELD, 7, 50, RegisterFrame.BORDER_DEFAULT_COLOR);
        if (emailSizeIsInvalid) {
            return emailSizeIsInvalid;
        }
        try {
            Account accountTyped = FactoryDAO.createAccountDAO().findByEmail(this.emailField.getText().toLowerCase());
            if (accountTyped != null) {
                Set.setLineBorder(Color.RED, this.emailField);
                this.emailWarningLbl.setText("email já cadastrado");
                return true;
            }
            return false;
        } catch (DataBaseException dbe) {
            JOptionPane.showMessageDialog(this, "Desculpe, não foi possível verificar se esse email já está cadastrado em nosso sistema. Verifique sua conexão.",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }
    
    /**
     * verifica se a quantidade de caracteres da senha é inválida.
     *
     * @return true caso quantidade de caracteres da senha seja inválida ou false caso seja válida.
     */
    private boolean passwordSizeIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.passwordField, this.passwordWarningLbl, String.valueOf(this.passwordField.getPassword()),
                "senha", Data.FEMALE_TEXT_FIELD,  6, 15, RegisterFrame.BORDER_DEFAULT_COLOR);
    }
    
    /**
     * verifica se a confirmação da senha é inválida.
     *
     * @return true caso quantidade de caracteres da confirmação da senha seja inválida ou caso a senha de confirmação seja diferente da senha
     * false caso seja válida e igual a senha.
     */
    private boolean confirmPasswordIsInvalid() {
        String confirmPassword = String.valueOf(this.confirmPasswordField.getPassword());
        boolean confirmPasswordIsInvalid = Data.textFieldSizeIsInvalid(this.confirmPasswordField, this.confirmPasswordWarningLbl, confirmPassword,
                "senha", Data.FEMALE_TEXT_FIELD, 6, 15, RegisterFrame.BORDER_DEFAULT_COLOR);
        if (confirmPasswordIsInvalid) {
            return true;
        }
        if (!confirmPassword.equals(String.valueOf(this.passwordField.getPassword()))) {
            Set.setLineBorder(Color.RED, this.passwordField, this.confirmPasswordField);
            this.passwordWarningLbl.setText("senhas diferentes"); 
            Thread thread = new Thread(() -> {
                try {
                    Thread.sleep(2500);
                    Set.setLineBorder(this.BORDER_DEFAULT_COLOR, this.passwordField, this.confirmPasswordField);
                    this.passwordWarningLbl.setText("");
                } catch (InterruptedException ignored) {}
            });
            thread.start();
            return true;
        }
        return false;
    }
    
    /**
     * Método que retorna uma conta de acordo com os dados nos campos de texto.
     * 
     * @return Retorna uma conta de acordo com os dados nos campos de texto.
     */
    private Account getAccountTyped() {
        Account accountTyped = new Account();
        accountTyped.setEmail(this.emailField.getText().toLowerCase());
        accountTyped.setPassword(String.valueOf(this.passwordField.getPassword()));
        accountTyped.setCustomer(super.getCustomer());
        return accountTyped;
    }
    
    private void exitLblClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblClicked
        System.exit(0);
    }//GEN-LAST:event_exitLblClicked

    private void minimizeLblClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLblClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeLblClicked

    private void emailFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailFieldKeyTyped
        if (!this.emailWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(RegisterFrame.BORDER_DEFAULT_COLOR, this.emailField);
            this.emailWarningLbl.setText("");
        }
    }//GEN-LAST:event_emailFieldKeyTyped

    private void passwordFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyTyped
        if (!this.passwordWarningLbl.getText().isEmpty() && !this.passwordWarningLbl.getText().equalsIgnoreCase("senhas diferentes")) {
            Set.setLineBorder(RegisterFrame.BORDER_DEFAULT_COLOR, this.passwordField);
            this.passwordWarningLbl.setText("");
        }
    }//GEN-LAST:event_passwordFieldKeyTyped

    private void confirmPasswordFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmPasswordFieldKeyTyped
        if (!this.confirmPasswordWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(RegisterFrame.BORDER_DEFAULT_COLOR, this.confirmPasswordField);
            this.confirmPasswordWarningLbl.setText("");
        }
    }//GEN-LAST:event_confirmPasswordFieldKeyTyped

    private void previousLblClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousLblClicked
        if (this.isLoading()) {
            return;
        }
        super.setAccount(null);
        Screen.changeScreen(this, new AddressDataRegisterFrame());
    }//GEN-LAST:event_previousLblClicked
    
    private void registerLblClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerLblClicked
        if (this.isLoading() || this.emailIsInvalidOrRegistered() || this.passwordSizeIsInvalid() || this.confirmPasswordIsInvalid()) {
            return;
        }
        this.changeToLoadingStatus();
        super.setAccount(this.getAccountTyped());
        int status = super.createRegister();
        if (status == 1) {
            Screen.changeScreen(this, new HomeFrame(super.getCustomer(), super.getContact(), super.getAddress(), super.getAccount()));
            super.clear();
            return;
        }
        this.changeToDefaultStatus();
        JOptionPane.showMessageDialog(this, "Desculpe, não foi possível criar sua conta. Verifique sua conexão.",
                "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_registerLblClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel confirmPasswordLbl;
    private javax.swing.JLabel confirmPasswordWarningLbl;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JLabel emailWarningLbl;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel logoLbl;
    private javax.swing.JLabel minimizeLbl;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JLabel passwordWarningLbl;
    private javax.swing.JLabel previousLbl;
    private javax.swing.JLabel registerLbl;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables

}