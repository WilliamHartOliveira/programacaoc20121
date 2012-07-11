package br.com.facdombosco.progc.app.vendas;

import br.com.facdombosco.progc.dvo.vendas.Produto;
import br.com.facdombosco.progc.dvo.vendas.Venda;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class VendaTableModel extends AbstractTableModel{

    private List<Venda> vendas;
    private String[] columnNames = {"Cod Item", "Descrição", "Valor Unitario"};

    public VendaTableModel(List<Venda> vendas) {
        this.vendas = vendas;
    }

    public int getRowCount() {
        return this.vendas.size();
    }

    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return this.columnNames[column];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {

        Venda venda = this.getVendas().get(rowIndex);
        Object value = null;

        switch (columnIndex) {
            case 0:
                value = venda.getIdVenda();
                break;
            case 1:
                value = venda.getCliente();
                break;
            case 2:
                value = venda.getVendedor();
            case 3:
                value = venda.getNotaFiscal();
            case 4:
                value = venda.getItemVendas();
            default:
                break;
        }

        return value;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setProdutos(List<Venda> vendas_) {
        this.vendas = vendas_;
    }
}
