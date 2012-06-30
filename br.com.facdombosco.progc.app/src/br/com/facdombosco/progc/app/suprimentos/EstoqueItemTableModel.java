package br.com.facdombosco.progc.app.suprimentos;

import br.com.facdombosco.progc.app.suprimentos.*;
import br.com.facdombosco.progc.dvo.suprimentos.EstoqueItem;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class EstoqueItemTableModel extends AbstractTableModel{

    private List<EstoqueItem> estoqueItens;
    private String[] columnNames = {"Produto", "Qtd"};

    public EstoqueItemTableModel(List<EstoqueItem> estoqueItem) {
        this.estoqueItens = estoqueItem;
    }

    public int getRowCount() {
        return this.estoqueItens.size();
    }

    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return this.columnNames[column];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {

        EstoqueItem estoqueItem = this.getEstoqueItens().get(rowIndex);
        Object value = null;

        switch (columnIndex) {
            case 0:
                value = estoqueItem.getQtdProduto();
                break;
            case 1:
                value = estoqueItem.getIdProduto();
                break;
            default:
                break;
        }

        return value;
    }

    public List<EstoqueItem> getEstoqueItens() {
        return estoqueItens;
    }

    public void setEstoqueItens(List<EstoqueItem> estoqueItem_) {
        this.estoqueItens = estoqueItem_;
    }
}
