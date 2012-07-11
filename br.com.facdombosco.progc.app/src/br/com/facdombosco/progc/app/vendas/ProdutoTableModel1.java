package br.com.facdombosco.progc.app.vendas;

import br.com.facdombosco.progc.dvo.vendas.Produto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ProdutoTableModel1 extends AbstractTableModel{

    private List<Produto> produtos;
    private String[] columnNames = {"Cod Item", "Descrição", "Valor Unitario"};

    public ProdutoTableModel1(List<Produto> produto) {
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
                value = produto.getIdProduto();
                break;
            case 1:
                value = produto.getNome().toString();
                break;
            case 2:
                value = produto.getValor();
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
