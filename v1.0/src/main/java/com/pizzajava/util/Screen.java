package main.java.com.pizzajava.util;

import javax.swing.JFrame;

/**
 * Essa classe disponibiliza métodos relacionados a telas JFrames.
 * 
 * @author João Guedes.
 */
public class Screen {
    
    /**
     * Esse método faz a troca de telas. Fechando a tela atual e abrindo uma nova tela.
     * 
     * @param currentScreen JFrame atual.
     * 
     * @param nextScreen Próximo JFrame.
     */
    public static void changeScreen(JFrame currentScreen, JFrame nextScreen) {
        nextScreen.setVisible(true);
        nextScreen.pack();
        currentScreen.dispose();
    }
    
}