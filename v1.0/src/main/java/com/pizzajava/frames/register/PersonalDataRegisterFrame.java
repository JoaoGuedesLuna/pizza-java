package main.java.com.pizzajava.frames.register;

import java.awt.Color;
import main.java.com.pizzajava.model.Customer;
import main.java.com.pizzajava.model.Contact;
import main.java.com.pizzajava.util.Documents;
import main.java.com.pizzajava.util.Data;
import main.java.com.pizzajava.frames.login.LoginFrame;
import main.java.com.pizzajava.database.DataBaseException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import main.java.com.pizzajava.dao.FactoryDAO;
import main.java.com.pizzajava.util.Screen;
import main.java.com.pizzajava.util.Set;

/**
 * Janela onde o usuário poderá preencher os dados pessoais e dados de telefone para a criação de uma conta.
 *
 * @author João Guedes.
 */
public final class PersonalDataRegisterFrame extends RegisterFrame {
    
    public PersonalDataRegisterFrame() {
        super();
        this.initComponents();
        this.limitTextFields();
        this.populateTextFields();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        exitLbl = new javax.swing.JLabel();
        minimizeLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        cpfLbl = new javax.swing.JLabel();
        cpfWarningLbl = new javax.swing.JLabel();
        cpfField = new javax.swing.JTextField();
        firstNameLbl = new javax.swing.JLabel();
        firstNameWarningLbl = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameLbl = new javax.swing.JLabel();
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
        previousLbl = new javax.swing.JLabel();
        nextLbl = new javax.swing.JLabel();

        jLabel5.setText("<warning>");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);
        setResizable(false);

        leftPanel.setMaximumSize(new java.awt.Dimension(300, 500));
        leftPanel.setMinimumSize(new java.awt.Dimension(300, 500));
        leftPanel.setPreferredSize(new java.awt.Dimension(300, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/pizzajava/black-logo.png"))); // NOI18N

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        rightPanel.setBackground(new java.awt.Color(254, 223, 19));
        rightPanel.setMaximumSize(new java.awt.Dimension(400, 500));
        rightPanel.setMinimumSize(new java.awt.Dimension(400, 500));

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
        titleLbl.setText("Dados Pessoais");
        titleLbl.setMaximumSize(new java.awt.Dimension(400, 500));
        titleLbl.setMinimumSize(new java.awt.Dimension(400, 500));

        cpfLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cpfLbl.setForeground(new java.awt.Color(35, 31, 32));
        cpfLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cpfLbl.setText("CPF");

        cpfWarningLbl.setForeground(new java.awt.Color(255, 0, 0));

        cpfField.setBackground(new java.awt.Color(51, 51, 51));
        cpfField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cpfField.setForeground(new java.awt.Color(153, 153, 153));
        cpfField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 31, 32), 1, true));
        cpfField.setMaximumSize(new java.awt.Dimension(302, 32));
        cpfField.setMinimumSize(new java.awt.Dimension(302, 32));
        cpfField.setPreferredSize(new java.awt.Dimension(302, 32));
        cpfField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cpfFieldKeyTyped(evt);
            }
        });

        firstNameLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        firstNameLbl.setForeground(new java.awt.Color(35, 31, 32));
        firstNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        firstNameLbl.setText("Primeiro nome");

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

        lastNameLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lastNameLbl.setForeground(new java.awt.Color(35, 31, 32));
        lastNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lastNameLbl.setText("Último nome");

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

        nextLbl.setBackground(new java.awt.Color(35, 31, 32));
        nextLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nextLbl.setForeground(new java.awt.Color(254, 223, 19));
        nextLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextLbl.setText("Avançar");
        nextLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextLbl.setOpaque(true);
        nextLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextLblClicked(evt);
            }
        });

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(cpfLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(cpfWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(firstNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(firstNameWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lastNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(lastNameWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(telephoneLbl)
                .addGap(6, 6, 6)
                .addComponent(telephoneWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(dddTelephoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(telephoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(whatsappLbl)
                .addGap(6, 6, 6)
                .addComponent(whatsappWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(dddWhatsappField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(whatsappField, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(previousLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(nextLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpfLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telephoneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(telephoneWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(previousLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
            .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
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
    protected void populateTextFields() {
        if (super.getContact() == null) {
            return;
        }
        this.cpfField.setText(super.getCustomer().getCpf());
        this.firstNameField.setText(super.getCustomer().getFirstName());
        this.lastNameField.setText(super.getCustomer().getLastName());
        String telephone = super.getContact().getTelephone();
        this.dddTelephoneField.setText(telephone.substring(0,3));
        this.telephoneField.setText(telephone.substring(3,12));
        String whatsapp = super.getContact().getWhatsapp();
        if (whatsapp != null) {
            this.dddWhatsappField.setText(whatsapp.substring(0,3));
            this.whatsappField.setText(whatsapp.substring(3,12));
        }
    }
    
    /**
     * Verifica se o CPF digitado é inválido. Se ele tem um tamanho errado, se é um CPF que não existe ou se é um
     * CPF que já foi cadastrado.
     *
     * @return retorna true caso o CPF seja inválido ou false caso seja válido.
     */
    private boolean cpfIsInvalid() {
        String cpf = this.cpfField.getText();
        boolean cpfSizeIsInvalid = Data.textFieldSizeIsInvalid(this.cpfField, this.cpfWarningLbl, cpf,
                "cpf", Data.MALE_TEXT_FIELD, 11, 11, RegisterFrame.BORDER_DEFAULT_COLOR);
        if (cpfSizeIsInvalid) {
            return true;
        }
        String warning = null;
        if (!Data.cpfIsValid(cpf)) {
            warning = "cpf inválido";
        }
        else {
            try {
                Customer customerTyped = FactoryDAO.createCustomerDAO().findByCpf(cpf);
                if (customerTyped != null) {
                    warning = "cpf já cadastrado";
                }
            } catch (DataBaseException dbe) {
                JOptionPane.showMessageDialog(this, "Desculpe, não foi possível verificar se esse CPF já está cadastrado em nosso sistema. Verifique sua conexão.",
                        "Aviso", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        }
        if (warning != null) {
            Set.setLineBorder(Color.RED, this.cpfField);
            this.cpfWarningLbl.setText(warning);
            return true;
        }
        return false;
    }
    
    /**
     * Verifica se o campo primeiro nome tem uma quantidade de caracteres inválida.
     *
     * @return retorna true caso a quantidade de caracteres seja inválida ou false caso seja válida.
     */
    private boolean firstNameSizeNameIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.firstNameField, this.firstNameWarningLbl, this.firstNameField.getText(),
                "nome", Data.MALE_TEXT_FIELD, 2, 15, RegisterFrame.BORDER_DEFAULT_COLOR);
    }
    
    /**
     * Verifica se o campo último nome tem uma quantidade de caracteres inválida.
     *
     * @return retorna true caso a quantidade de caracteres seja inválida ou false caso seja válida.
     */
    private boolean lastNameSizeIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.lastNameField, this.lastNameWarningLbl,this.lastNameField.getText(),
                "nome", Data.MALE_TEXT_FIELD, 2, 15, RegisterFrame.BORDER_DEFAULT_COLOR);
    }
    
    /**
     * Verifica se o campo ddd do telefone tem uma quantidade de caracteres inválida.
     *
     * @return retorna true caso a quantidade de caracteres seja inválida ou false caso seja válida.
     */
    private boolean dddTelephoneSizeIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.dddTelephoneField, this.telephoneWarningLbl, this.dddTelephoneField.getText(),
            "ddd", Data.MALE_TEXT_FIELD, 3, 3, RegisterFrame.BORDER_DEFAULT_COLOR);
    }
    
    /**
     * Verifica se o campo telefone tem uma quantidade de caracteres inválida.
     *
     * @return retorna true caso a quantidade de caracteres seja inválida ou false caso seja válida.
     */
    private boolean telephoneSizeIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.telephoneField, this.telephoneWarningLbl, this.telephoneField.getText(),
            "telefone", Data.MALE_TEXT_FIELD, 9, 9, RegisterFrame.BORDER_DEFAULT_COLOR);
    }
    
    /**
    * Verifica se o campo ddd do whatsapp tem uma quantidade de caracteres inválida.
    *
    * @return retorna true caso a quantidade de caracteres seja inválida ou false caso seja válida.
    */
    private boolean dddWhatsappSizeIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.dddWhatsappField, this.whatsappWarningLbl, this.dddWhatsappField.getText(),
            "ddd", Data.MALE_TEXT_FIELD, 3, 3, RegisterFrame.BORDER_DEFAULT_COLOR);
    }
    
    /**
    * Verifica se o campo whatsapp tem uma quantidade de caracteres inválida.
    *
    * @return retorna true caso a quantidade de caracteres seja inválida ou false caso seja válida.
    */
    private boolean whatsappSizeIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.whatsappField, this.whatsappWarningLbl, this.whatsappField.getText(),
            "whatsapp", Data.MALE_TEXT_FIELD, 9, 9, RegisterFrame.BORDER_DEFAULT_COLOR);
    }
    
    /**
     * Método que retorna um cliente de acordo com os dados nos campos de texto.
     * 
     * @return Retorna um cliente de acordo com os dados nos campos de texto.
     */
    private Customer getCustomerTyped() {
        Customer customerTyped = new Customer();
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
    
    private void exitLblClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblClicked
        System.exit(0);
    }//GEN-LAST:event_exitLblClicked
    
    private void minimizeLblClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLblClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeLblClicked

    private void cpfFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpfFieldKeyTyped
        if (!this.cpfWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(RegisterFrame.BORDER_DEFAULT_COLOR, this.cpfField);
            this.cpfWarningLbl.setText("");
        }
    }//GEN-LAST:event_cpfFieldKeyTyped

    private void firstNameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameFieldKeyTyped
        if (!this.firstNameWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(RegisterFrame.BORDER_DEFAULT_COLOR, this.firstNameField);
            this.firstNameWarningLbl.setText("");
        }
    }//GEN-LAST:event_firstNameFieldKeyTyped

    private void lastNameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameFieldKeyTyped
        if (!this.lastNameWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(RegisterFrame.BORDER_DEFAULT_COLOR, this.lastNameField);
            this.lastNameWarningLbl.setText("");
        }
    }//GEN-LAST:event_lastNameFieldKeyTyped

    private void dddTelephoneFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dddTelephoneFieldKeyTyped
        if (!this.telephoneWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(RegisterFrame.BORDER_DEFAULT_COLOR, this.dddTelephoneField);
            this.telephoneWarningLbl.setText("");
        }
    }//GEN-LAST:event_dddTelephoneFieldKeyTyped

    private void telephoneFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telephoneFieldKeyTyped
        if (!this.telephoneWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(RegisterFrame.BORDER_DEFAULT_COLOR, this.telephoneField);
            this.telephoneWarningLbl.setText("");
        }
    }//GEN-LAST:event_telephoneFieldKeyTyped

    private void dddWhatsappFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dddWhatsappFieldKeyTyped
        if (!this.whatsappWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(RegisterFrame.BORDER_DEFAULT_COLOR, this.dddWhatsappField);
            this.whatsappWarningLbl.setText("");
        }
    }//GEN-LAST:event_dddWhatsappFieldKeyTyped

    private void whatsappFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_whatsappFieldKeyTyped
        if (!this.whatsappWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(RegisterFrame.BORDER_DEFAULT_COLOR, this.whatsappField);
            this.whatsappWarningLbl.setText("");
        }
    }//GEN-LAST:event_whatsappFieldKeyTyped

    private void previousLblClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousLblClicked
        super.setCustomer(null);
        super.setContact(null);
        Screen.changeScreen(this, new LoginFrame());
    }//GEN-LAST:event_previousLblClicked

    private void nextLblClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextLblClicked
        if (this.cpfIsInvalid() || this.firstNameSizeNameIsInvalid() || this.lastNameSizeIsInvalid() || this.dddTelephoneSizeIsInvalid() || this.telephoneSizeIsInvalid()) {
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
        Contact contactTyped = this.getContactTyped();
        super.setCustomer(contactTyped.getCustomer());
        super.setContact(contactTyped);
        Screen.changeScreen(this, new AddressDataRegisterFrame());
    }//GEN-LAST:event_nextLblClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cpfField;
    private javax.swing.JLabel cpfLbl;
    private javax.swing.JLabel cpfWarningLbl;
    private javax.swing.JTextField dddTelephoneField;
    private javax.swing.JTextField dddWhatsappField;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLbl;
    private javax.swing.JLabel firstNameWarningLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLbl;
    private javax.swing.JLabel lastNameWarningLbl;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel minimizeLbl;
    private javax.swing.JLabel nextLbl;
    private javax.swing.JLabel previousLbl;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JTextField telephoneField;
    private javax.swing.JLabel telephoneLbl;
    private javax.swing.JLabel telephoneWarningLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JTextField whatsappField;
    private javax.swing.JLabel whatsappLbl;
    private javax.swing.JLabel whatsappWarningLbl;
    // End of variables declaration//GEN-END:variables

}