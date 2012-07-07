package br.com.facdombosco.progc.app.compras;

import br.com.facdombosco.progc.dvo.compras.Fornecedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class FornecedorTableModel extends AbstractTableModel 
{
    private List<Fornecedor> vFornecedor;
    private String[] columnNames = {"Código", "Nome", "CNPJ"};

    public FornecedorTableModel(List<Fornecedor> vFornecedor) 
    {
        this.vFornecedor = vFornecedor;
    }

    public int getRowCount() 
    {
        return this.vFornecedor.size();
    }

    public int getColumnCount() 
    {
        return this.columnNames.length;
    }

    @Override
    public String getColumnName(int column) 
    {
        return this.columnNames[column];
    }

    public Object getValueAt(int rowIndex, int columnIndex) 
    {
        Fornecedor vFornecedor = this.getFornecedores().get(rowIndex);
        Object value = null;

        switch (columnIndex) 
        {
            case 0:
                value = vFornecedor.getIdFornecedor();
                break;
            case 1:
                value = vFornecedor.getNome();
                break;
            case 2:
                value = vFornecedor.getCnpj();
                break;
            default:
                break;
        }

        return value;
    }

    public List<Fornecedor> getFornecedores() 
    {
        return vFornecedor;
    }

    public void setFornecedor(List<Fornecedor> vFornecedor) 
    {
        this.vFornecedor = vFornecedor;
    }
}

