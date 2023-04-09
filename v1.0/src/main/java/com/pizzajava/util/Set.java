package main.java.com.pizzajava.util;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import main.java.com.pizzajava.model.Product;

/**
 * Classe que disponíbiliza alguns métodos set's para JComponentes (componentes gráficos).
 *
 * @author João Guedes.
 */
public class Set  {
    
    public static void setText(String text, JTextField... jTextField) {
        for (JTextField txtField : jTextField) {
            txtField.setText(text);
        }
    }
    
    public static void setText(String text, JLabel... jLabel) {
        for (JLabel jLbl : jLabel) {
            jLbl.setText(text);
        }
    }
    
    public static void setEditable(boolean isEditable, JTextField... jTextField) {
        for (JTextField jTxtField : jTextField) {
            jTxtField.setEditable(isEditable);
        }
    }
    
    public static void setFocusable(boolean isFoculable, JTextField... jTextField) {
        for (JTextField JTxtField : jTextField) {
            JTxtField.setFocusable(isFoculable);
        }
    }
    
    public static void setVisible(boolean isVisible, JComponent... jComponent) {
        for (JComponent jComp : jComponent) {
            jComp.setVisible(isVisible);
        }
    }
    
    public static void setCursor(int cursorType, JComponent... jComponents) {
        for(JComponent jComp : jComponents) {
            jComp.setCursor(new Cursor(cursorType));
        }
    }
    
    public static void setLineBorder(Color lineBorderColor, JTextField... jTextField) {
        for (JTextField jTxtField : jTextField) {
            jTxtField.setBorder(new LineBorder(lineBorderColor, 1, true));
        }
    }
    
    public static void setIconImage(JFrame jFrame, String path) {
        jFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(Set.class.getResource(path)));
    }
    
    /**
     * Método responsável por adicionar uma imagem redimensionada em um JLabel. A imagem terá as mesmas dimensões do JLabel.
     *
     * @param jLabel JLabel que tera uma imagem adicionada em seu atributo icon.
     * 
     * @param path Caminho de diretório da imagem que será adicionada ao JLabel.
     */
    public static void setImageResizable(JLabel jLabel, String path) {
        ImageIcon icon = new ImageIcon(Set.class.getResource(path));
        ImageIcon image = new ImageIcon(icon.getImage().getScaledInstance(jLabel.getWidth(), jLabel.getHeight(), Image.SCALE_DEFAULT));
        jLabel.setIcon(image);
    }
    
    /**
     * Método responsável por adicionar a imagem de uma pizza em um JLabel.
     *
     * @param pizza Esté objeto é necessário pra que de acordo com o código do produto se saiba qual imagem será adicionada ao JLabel.
     *
     * @param imageLbl JLabel que terá uma imagem adicionada ao seu atributo icon.
     */
    public static void setProductImage(Product pizza, JLabel imageLbl) {
        switch (pizza.getCode()) {
            case "PZ00002" ->
                    Set.setImageResizable(imageLbl, "/main/resources/images/products/pizzas/calabresa.png");
            case "PZ00003" ->
                    Set.setImageResizable(imageLbl, "/main/resources/images/products/pizzas/portuguesa.png");
            case "PZ00004" ->
                    Set.setImageResizable(imageLbl, "/main/resources/images/products/pizzas/mucarela.png");
            case "PZ00005" ->
                    Set.setImageResizable(imageLbl, "/main/resources/images/products/pizzas/marguerita.png");
            case "PZ00006" ->
                    Set.setImageResizable(imageLbl, "/main/resources/images/products/pizzas/quatro_queijos.png");
            case "PZ00007" ->
                    Set.setImageResizable(imageLbl, "/main/resources/images/products/pizzas/frango_catupiry.png");
            case "PZ00008" ->
                    Set.setImageResizable(imageLbl, "/main/resources/images/products/pizzas/napolitana.png");
            case "PZ00009" ->
                    Set.setImageResizable(imageLbl, "/main/resources/images/products/pizzas/romeu_julieta.png");
            case "PZ00010" ->
                    Set.setImageResizable(imageLbl, "/main/resources/images/products/pizzas/atum.png");
            case "PZ00011" ->
                    Set.setImageResizable(imageLbl, "/main/resources/images/products/pizzas/camarao.png");
            case "PZ00012" ->
                    Set.setImageResizable(imageLbl, "/main/resources/images/products/pizzas/pepperoni.png");
            case "PZ00013" ->
                    Set.setImageResizable(imageLbl, "/main/resources/images/products/pizzas/canadense.png");
            default ->
                Set.setImageResizable(imageLbl, "/main/resources/images/products/pizzas/no_image.png");
        }
    }
    
}