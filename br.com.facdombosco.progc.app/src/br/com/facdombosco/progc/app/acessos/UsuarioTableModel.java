package br.com.facdombosco.progc.app.acessos;

import br.com.facdombosco.progc.dvo.acessos.Usuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class UsuarioTableModel extends AbstractTableModel {

    private List<Usuario> usuarios;
    private String[] columnNames = {"Código", "Nome", "Login"};

    public UsuarioTableModel(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public int getRowCount() {
        return this.usuarios.size();
    }

    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return this.columnNames[column];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {

        Usuario usuario = this.getUsuarios().get(rowIndex);
        Object value = null;

        switch (columnIndex) {
            case 0:
                value = usuario.getIdUsuario();
                break;
            case 1:
                value = usuario.getNome();
                break;
            case 2:
                value = usuario.getNomeUsuario();
                break;
            default:
                break;
        }

        return value;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
