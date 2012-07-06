package br.com.facdombosco.progc.app.vendas;

import br.com.facdombosco.progc.dvo.vendas.Produto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ProdutoTableModel extends AbstractTableModel{

    private List<Produto> produtos;
    private String[] columnNames = {"Nome", "Valor Unitario", "Fornecedor"};

    public ProdutoTableModel(List<Produto> produto) {
        this.produtos = produto;
    }

    public int getRowCount() {
        return this.produtos.size();
    }

    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return this.columnNames[column];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {

        Produto produto = this.getProdutos().get(rowIndex);
        Object value = null;

        switch (columnIndex) {
            case 0:
                value = produto.getNome();
                break;
            case 1:
                value = produto.getValor().toString();
                break;
            case 2:
                value = (produto.getFornecedor() == null ? "" : produto.getFornecedor().getNome());
            default:
                break;
        }

        return value;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos_) {
        this.produtos = produtos_;
    }
}
