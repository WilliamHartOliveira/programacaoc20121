package br.com.facdombosco.progc.framework.utils;

import javax.swing.JOptionPane;

/**
 *
 * @author msantos
 */
public class MessageHelper {

    public static void showError(String message) {
        JOptionPane.showMessageDialog(null, message, "Erro!", JOptionPane.ERROR_MESSAGE);
    }
}
