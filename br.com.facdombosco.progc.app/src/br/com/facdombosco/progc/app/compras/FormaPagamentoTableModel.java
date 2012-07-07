package br.com.facdombosco.progc.app.compras;

import br.com.facdombosco.progc.dvo.compras.FormaPagamento;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class FormaPagamentoTableModel extends AbstractTableModel
{
    private List<FormaPagamento> vFormaPagamento;
    private String[] columnNames = {"Código", "Nome", "quantidadeDiasParcela", "quantidadeParcelas"};

    public FormaPagamentoTableModel(List<FormaPagamento> vFormaPagamento) 
    {
        this.vFormaPagamento = vFormaPagamento;
    }

    public int getRowCount() 
    {
        return this.vFormaPagamento.size();
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
        FormaPagamento vFormaPagamento = this.getFormaPagamento().get(rowIndex);
        Object value = null;

        switch (columnIndex) 
        {
            case 0:
                value = vFormaPagamento.getIdFormaPagamento();
                break;
            case 1:
                value = vFormaPagamento.getNome();
                break;
            case 2:
                value = vFormaPagamento.getQuantidadeDiasParcela();
                break;
            case 3:
                value = vFormaPagamento.getQuantidadeParcelas();
                break;
            default:
                break;
        }

        return value;
    }

    public List<FormaPagamento> getFormaPagamento() 
    {
        return vFormaPagamento;
    }

    public void setFormaPagamento(List<FormaPagamento> vFormaPagamento) 
    {
        this.vFormaPagamento = vFormaPagamento;
    }
}
