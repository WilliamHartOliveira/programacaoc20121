package br.com.facdombosco.progc.app.servicos;

import br.com.facdombosco.progc.dvo.servicos.ExemploServico;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ExemploServicoTableModel extends AbstractTableModel{

    private List<ExemploServico> exemploServico;
    private String[] columnNames = {"Coluna 1", "Coluna 2", "Coluna 3", "Coluna 4", "..."};

    public ExemploServicoTableModel(List<ExemploServico> exemploServico) {
        this.exemploServico = exemploServico;
    }

    public int getRowCount() {
        return exemploServico.size();
    }

    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return this.columnNames[column];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {

        ExemploServico exemplo = getExemploServico().get(rowIndex);
        Object value = null;

        switch (columnIndex) {
            case 0:
                value = exemplo.getId();
                break;
            case 1:
                value = exemplo.getDefeito();
                break;
            case 2:
                value = exemplo.getParecer();
                break;
            case 3:
                value = exemplo.getClienteId();
                break;
            case 4:
                value = exemplo.getData().toString();
                break;
            default:
                break;
        }

        return value;
    }

    public List<ExemploServico> getExemploServico() {
        return exemploServico;
    }

    public void setOrcamento(List<ExemploServico> exemploServico) {
        this.exemploServico = exemploServico;
    }
}
