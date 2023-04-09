package main.java.com.pizzajava.frames.navigation;

import main.java.com.pizzajava.model.Item;
import main.java.com.pizzajava.util.Set;
import java.awt.Color;

/**
 * Essa classe é um painel que representa um anúncio de um produto, contendo a foto, o nome, a descrição e o valor do produto.
 *
 * @author João Guedes.
 */
public class AdPanel extends javax.swing.JPanel {
    
    private final NavigationFrame navigationFrame;
    private final Item item;
    private boolean added;
    private final Color ADDED_DEFAULT_COLOR = new Color (102,255,102);
    private final Color NOT_ADDED_DEFAULT_COLOR = new Color (255,255,51);
    
    public AdPanel(NavigationFrame navigationFrame, Item item, boolean added) {
        this.navigationFrame = navigationFrame;
        this.item = item;
        this.added = added;
        this.initComponents();
        Set.setProductImage(item.getProduct(), this.imageLbl);
        String size = null;
        if (item.getProduct().getSize().equalsIgnoreCase("G")) {
            size = "Grande";
        }
        this.nameLbl.setText("<html><body>" + item.getProduct().getName() + " (" + size + ")</body><html>");
        this.descriptionLbl.setText("<html><body>" + item.getProduct().getDescription() + "</body><html>");
        if (this.added) {
            this.changeToAddedState();
        }
        else {
            this.changeToDefaultState();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLbl = new javax.swing.JLabel();
        descriptionLbl = new javax.swing.JLabel();
        priceLbl = new javax.swing.JLabel();
        imageLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        nameLbl.setBackground(new java.awt.Color(204, 204, 204));
        nameLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(0, 0, 0));
        nameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLbl.setText("<Titulo>");
        nameLbl.setOpaque(true);

        descriptionLbl.setBackground(new java.awt.Color(102, 102, 102));
        descriptionLbl.setForeground(new java.awt.Color(255, 255, 255));
        descriptionLbl.setText("<descricao>");
        descriptionLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        descriptionLbl.setOpaque(true);

        priceLbl.setBackground(new java.awt.Color(255, 255, 51));
        priceLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        priceLbl.setForeground(new java.awt.Color(51, 51, 51));
        priceLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priceLbl.setText("Adicionar R$");
        priceLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        priceLbl.setOpaque(true);
        priceLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                priceLblMouseClicked(evt);
            }
        });

        imageLbl.setMaximumSize(new java.awt.Dimension(270, 153));
        imageLbl.setMinimumSize(new java.awt.Dimension(270, 153));
        imageLbl.setOpaque(true);
        imageLbl.setPreferredSize(new java.awt.Dimension(270, 153));
        imageLbl.setSize(270, 153);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(descriptionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(priceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(descriptionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(priceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Faz o anúncio ficar em seu estado padrão, onde o usuário poderá adicionar o produto ao carrinho se assim desejar.
     */
    private void changeToDefaultState() {
        this.priceLbl.setText("Adicionar R$" + this.item.getProduct().getUnitPrice());
        this.priceLbl.setBackground(this.NOT_ADDED_DEFAULT_COLOR);
    }
    
     /**
     * Faz o anúncio ficar em seu estado de adicionado, onde o usuário poderá remover o produto do carrinho se assim desejar.
     */
    private void changeToAddedState() {
        this.priceLbl.setText("Adicionado");
        this.priceLbl.setBackground(this.ADDED_DEFAULT_COLOR);
    }

    /**
     * Adiciona ao carrinho o item do anúncio.
     */
    private void addToCart() {
        this.navigationFrame.getCart().add(this.item);
        this.added = true;
        this.changeToAddedState();
    }

    /**
     * Remove do carrinho o item do anúncio.
     */
    private void removeFromCart() {
        this.navigationFrame.getCart().remove(this.item);
        this.added = false;
        this.item.setQuantity(1);
        this.changeToDefaultState();
    }
    
    private void priceLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priceLblMouseClicked
        if(this.added) {
            this.removeFromCart();
        }
        else {
            this.addToCart();
        }
    }//GEN-LAST:event_priceLblMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descriptionLbl;
    private javax.swing.JLabel imageLbl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel priceLbl;
    // End of variables declaration//GEN-END:variables
            
}