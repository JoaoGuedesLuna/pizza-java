package main.java.com.pizzajava.frames.navigation;

import main.java.com.pizzajava.model.Item;
import main.java.com.pizzajava.util.Set;


/**
 * Essa classe representa gráficamente um item que está contido no carrinho. É um painel que contém o item que o usuário adicionou no carrinho.
 * Nele o usuário poderá escolher a quantidade do produto que ele deseja comprar.
 * 
 * @author João Guedes.
 */
public class AddedItemPanel extends javax.swing.JPanel {
    
    private CartFrame cartFrame;
    private Item item;
    private Double totalPrice;
    
    public AddedItemPanel(CartFrame cartFrame, Item item) {
        this.cartFrame = cartFrame;
        this.item = item;
        this.totalPrice = this.item.getProduct().getUnitPrice() * this.item.getQuantity();
        this.initComponents();
        this.imageLbl.setSize(115, 70);
        Set.setProductImage(this.item.getProduct(), this.imageLbl);
        this.flavorLbl.setText(this.item.getProduct().getName());
        this.priceLbl.setText("R$" + this.totalPrice);
        this.quantitySpn.setValue(this.item.getQuantity());
    }

    public Double getTotalPrice() {
        return totalPrice;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageLbl = new javax.swing.JLabel();
        flavorLbl = new javax.swing.JLabel();
        priceLbl = new javax.swing.JLabel();
        quantitySpn = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(35, 31, 32));
        setMaximumSize(new java.awt.Dimension(520, 92));
        setMinimumSize(new java.awt.Dimension(520, 92));
        setPreferredSize(new java.awt.Dimension(520, 92));

        imageLbl.setBackground(new java.awt.Color(255, 204, 204));
        imageLbl.setForeground(new java.awt.Color(255, 204, 204));
        imageLbl.setIconTextGap(6);
        imageLbl.setMaximumSize(new java.awt.Dimension(115, 70));
        imageLbl.setMinimumSize(new java.awt.Dimension(115, 70));
        imageLbl.setPreferredSize(new java.awt.Dimension(115, 70));

        flavorLbl.setBackground(new java.awt.Color(153, 153, 153));
        flavorLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        flavorLbl.setForeground(new java.awt.Color(204, 204, 204));
        flavorLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flavorLbl.setText("Sabor");
        flavorLbl.setMaximumSize(new java.awt.Dimension(193, 35));
        flavorLbl.setMinimumSize(new java.awt.Dimension(193, 35));
        flavorLbl.setPreferredSize(new java.awt.Dimension(193, 35));

        priceLbl.setBackground(new java.awt.Color(153, 153, 153));
        priceLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        priceLbl.setForeground(new java.awt.Color(204, 204, 204));
        priceLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priceLbl.setText("Valor ");
        priceLbl.setMaximumSize(new java.awt.Dimension(193, 35));
        priceLbl.setMinimumSize(new java.awt.Dimension(193, 35));
        priceLbl.setPreferredSize(new java.awt.Dimension(193, 35));

        quantitySpn.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));
        quantitySpn.setToolTipText("");
        quantitySpn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quantitySpn.setEditor(new javax.swing.JSpinner.NumberEditor(quantitySpn, ""));
        quantitySpn.setName(""); // NOI18N
        quantitySpn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantitySpnStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(flavorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(quantitySpn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(flavorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(priceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quantitySpn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void quantitySpnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantitySpnStateChanged
        int quantity = Integer.parseInt(this.quantitySpn.getValue().toString());
        if (quantity < 1) {
            this.item.setQuantity(1);
            this.cartFrame.getCart().remove(this.item);
            this.cartFrame.updateFrame();
        }
        else {
            this.item.setQuantity(quantity);
            this.totalPrice = this.item.getProduct().getUnitPrice() * quantity;
            this.priceLbl.setText("R$" + this.totalPrice);
            this.cartFrame.updateTotalPrice();
        }
    }//GEN-LAST:event_quantitySpnStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel flavorLbl;
    private javax.swing.JLabel imageLbl;
    private javax.swing.JLabel priceLbl;
    private javax.swing.JSpinner quantitySpn;
    // End of variables declaration//GEN-END:variables
}