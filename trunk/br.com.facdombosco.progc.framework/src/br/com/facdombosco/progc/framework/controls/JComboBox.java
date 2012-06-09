package br.com.facdombosco.progc.framework.controls;

import java.util.List;

/**
 *
 * @author Marcelo
 */
public abstract class JComboBox<T> extends javax.swing.JComboBox {

    public void addAll(List<T> list) {

        this.removeAllItems();

        for (T object : list)
            this.addItem(object);
    }

    public abstract void carregar();

    public abstract void limpar();
}
