package main.java.com.pizzajava.frames.register;

import javax.swing.JFrame;
import main.java.com.pizzajava.model.Address;
import main.java.com.pizzajava.util.Data;
import main.java.com.pizzajava.util.Documents;
import main.java.com.pizzajava.util.Screen;
import main.java.com.pizzajava.util.Set;

/**
 * Este janela permite ao usuário que ele cadastre seus dados de endereço.
 *
 * @author João Guedes.
 */
public final class AddressDataRegisterFrame extends RegisterFrame {
    
    public AddressDataRegisterFrame() {
        super();
        this.initComponents();
        this.limitTextFields();
        this.populateTextFields();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        leftPanel = new javax.swing.JPanel();
        logoLbl = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        exitLbl = new javax.swing.JLabel();
        minimizeLbl = new javax.swing.JLabel();
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
        previousLbl = new javax.swing.JLabel();
        nextLbl = new javax.swing.JLabel();

        jLabel5.setText("<warning>");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(35, 31, 32));
        jLabel14.setText("CEP");

        jLabel15.setText("<warning>");

        jTextField7.setBackground(new java.awt.Color(51, 51, 51));
        jTextField7.setForeground(new java.awt.Color(153, 153, 153));
        jTextField7.setText("jTextField1");

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
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addComponent(logoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addComponent(logoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        rightPanel.setBackground(new java.awt.Color(254, 223, 19));
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
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(zipCodeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zipCodeWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numberLbl)
                        .addGap(1, 1, 1)
                        .addComponent(numberWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(streetWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(streetLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addComponent(neighborhoodLbl)
                                .addGap(8, 8, 8)
                                .addComponent(neighborhoodWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addComponent(complementLbl)
                                .addGap(3, 3, 3)
                                .addComponent(complementWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(neighborhoodField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cityLbl)
                            .addComponent(complementField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(cityWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stateLbl)
                            .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(stateWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(countryLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stateField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(countryWarningLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(countryField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(previousLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nextLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                .addComponent(minimizeLbl)
                .addGap(4, 4, 4)
                .addComponent(exitLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(minimizeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitLbl))
                .addGap(0, 0, 0)
                .addComponent(titleLbl)
                .addGap(0, 0, 0)
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
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
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
            .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    protected void populateTextFields() {
        if (super.getAddress() == null) {
            return;
        }
        Address address = super.getAddress();
        this.zipCodeField.setText(address.getZipCode());
        if (address.getNumber() != null) {
            this.numberField.setText(address.getNumber().toString());
        }
        this.streetField.setText(address.getStreet());
        this.neighborhoodField.setText(address.getNeighborhood());
        if (address.getComplement() != null) {
            this.complementField.setText(address.getComplement());
        }
        this.cityField.setText(address.getCity());
        this.stateField.setText(address.getState());
        this.countryField.setText(address.getCountry());
    }
    
    /**
     * verifica se a quantidade de caracteres do código postal (CEP) é inválida.
     *
     * @return true caso quantidade de caracteres do código postal seja inválida ou false caso seja válida.
     */
    private boolean zipCodeSizeIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.zipCodeField, this.zipCodeWarningLbl, this.zipCodeField.getText(),
                "cep", Data.MALE_TEXT_FIELD, 8, 8, RegisterFrame.BORDER_DEFAULT_COLOR);
    }

    /**
     * verifica se a quantidade de caracteres da rua é inválida.
     *
     * @return true caso quantidade de caracteres da rua seja inválida ou false caso seja válida.
     */
    private boolean streetSizeIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.streetField, this.streetWarningLbl, this.streetField.getText(),
                "rua", Data.FEMALE_TEXT_FIELD, 2, 50, RegisterFrame.BORDER_DEFAULT_COLOR);
    }

    /**
     * verifica se a quantidade de caracteres do bairro é inválida.
     *
     * @return true caso quantidade de caracteres do bairro seja inválida ou false caso seja válida.
     */
    private boolean neighborhoodSizeIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.neighborhoodField, this.neighborhoodWarningLbl, this.neighborhoodField.getText(),
                "bairro", Data.MALE_TEXT_FIELD, 2, 30, RegisterFrame.BORDER_DEFAULT_COLOR);
    }

    /**
     * verifica se a quantidade de caracteres da cidade é inválida.
     *
     * @return true caso quantidade de caracteres da cidade seja inválida ou false caso seja válida.
     */
    private boolean citySizeIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.cityField, this.cityWarningLbl, this.cityField.getText(),
                "cidade", Data.FEMALE_TEXT_FIELD, 2, 20, RegisterFrame.BORDER_DEFAULT_COLOR);
    }

    /**
     * verifica se a quantidade de caracteres do estado é inválida.
     *
     * @return true caso quantidade de caracteres do estado seja inválida ou false caso seja válida.
     */
    private boolean stateSizeIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.stateField, this.stateWarningLbl, this.stateField.getText(),
                "estado", Data.MALE_TEXT_FIELD, 2, 20, RegisterFrame.BORDER_DEFAULT_COLOR);
    }

    /**
     * verifica se a quantidade de caracteres do país é inválida.
     *
     * @return true caso quantidade de caracteres do país seja inválida ou false caso seja válida.
     */
    private boolean countrySizeIsInvalid() {
        return Data.textFieldSizeIsInvalid(this.countryField, this.countryWarningLbl, this.countryField.getText(),
                "país", Data.MALE_TEXT_FIELD, 2, 15, RegisterFrame.BORDER_DEFAULT_COLOR);
    }
    
    /**
     * Método que retorna um endereço de acordo com os dados nos campos de texto.
     * 
     * @return Retorna um endereço de acordo com os dados nos campos de texto.
     */
    private Address getAddressTyped() {
        Address addressTyped = new Address();
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
    
    private void minimizeLblClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLblClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeLblClicked

    private void exitLblClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblClicked
        System.exit(0);
    }//GEN-LAST:event_exitLblClicked

    private void zipCodeFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_zipCodeFieldKeyTyped
        if (!this.zipCodeWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(RegisterFrame.BORDER_DEFAULT_COLOR, this.zipCodeField);
            this.zipCodeWarningLbl.setText("");
        }
    }//GEN-LAST:event_zipCodeFieldKeyTyped

    private void streetFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_streetFieldKeyTyped
        if (!this.streetWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(RegisterFrame.BORDER_DEFAULT_COLOR, this.streetField);
            this.streetWarningLbl.setText("");
        }
    }//GEN-LAST:event_streetFieldKeyTyped

    private void neighborhoodFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_neighborhoodFieldKeyTyped
        if (!this.neighborhoodWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(RegisterFrame.BORDER_DEFAULT_COLOR, this.neighborhoodField);
            this.neighborhoodWarningLbl.setText("");
        }
    }//GEN-LAST:event_neighborhoodFieldKeyTyped

    private void cityFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityFieldKeyTyped
        if (!this.cityWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(RegisterFrame.BORDER_DEFAULT_COLOR, this.cityField);
            this.cityWarningLbl.setText("");
        }
    }//GEN-LAST:event_cityFieldKeyTyped

    private void stateFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stateFieldKeyTyped
        if (!this.stateWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(RegisterFrame.BORDER_DEFAULT_COLOR, this.stateField);
            this.stateWarningLbl.setText("");
        }
    }//GEN-LAST:event_stateFieldKeyTyped

    private void countryFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_countryFieldKeyTyped
        if (!this.countryWarningLbl.getText().isEmpty()) {
            Set.setLineBorder(RegisterFrame.BORDER_DEFAULT_COLOR, this.countryField);
            this.countryWarningLbl.setText("");
        }
    }//GEN-LAST:event_countryFieldKeyTyped

    private void previousLblClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousLblClicked
        super.setAddress(null);
        Screen.changeScreen(this, new PersonalDataRegisterFrame());
    }//GEN-LAST:event_previousLblClicked
    
    private void nextLblClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextLblClicked
        if (this.zipCodeSizeIsInvalid() || this.streetSizeIsInvalid() || this.neighborhoodSizeIsInvalid() || this.citySizeIsInvalid() || this.stateSizeIsInvalid() || this.countrySizeIsInvalid()) {
            return;
        }
        super.setAddress(this.getAddressTyped());
        Screen.changeScreen(this, new AccountDataRegisterFrame());
    }//GEN-LAST:event_nextLblClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel cityLbl;
    private javax.swing.JLabel cityWarningLbl;
    private javax.swing.JTextField complementField;
    private javax.swing.JLabel complementLbl;
    private javax.swing.JLabel complementWarningLbl;
    private javax.swing.JTextField countryField;
    private javax.swing.JLabel countryLbl;
    private javax.swing.JLabel countryWarningLbl;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel logoLbl;
    private javax.swing.JLabel minimizeLbl;
    private javax.swing.JTextField neighborhoodField;
    private javax.swing.JLabel neighborhoodLbl;
    private javax.swing.JLabel neighborhoodWarningLbl;
    private javax.swing.JLabel nextLbl;
    private javax.swing.JTextField numberField;
    private javax.swing.JLabel numberLbl;
    private javax.swing.JLabel numberWarningLbl;
    private javax.swing.JLabel previousLbl;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JTextField stateField;
    private javax.swing.JLabel stateLbl;
    private javax.swing.JLabel stateWarningLbl;
    private javax.swing.JTextField streetField;
    private javax.swing.JLabel streetLbl;
    private javax.swing.JLabel streetWarningLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JTextField zipCodeField;
    private javax.swing.JLabel zipCodeLbl;
    private javax.swing.JLabel zipCodeWarningLbl;
    // End of variables declaration//GEN-END:variables
}