package br.com.facdombosco.progc.app.vendas;

import br.com.facdombosco.progc.dvo.compras.Fornecedor;
import br.com.facdombosco.progc.framework.controls.JComboBox;
import br.com.facdombosco.progc.service.compras.FornecedorService;
import java.util.List;

public class FornecedorJComboBox extends JComboBox<Fornecedor> {

    public void carregar() {
        FornecedorService fornecedorService = new FornecedorService();
        List<Fornecedor> listFornecedor = fornecedorService.findAll();

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("Selecione um item");
        
        listFornecedor.add(0, fornecedor);
        
        this.addAll(listFornecedor);
    }

    public void limpar() {
        this.setSelectedIndex(0);
    }

    public Fornecedor getFornecedorSelecionado() {
        if (this.getSelectedIndex() > 0) {
            return new FornecedorService().findById(((Fornecedor)this.getSelectedItem()).getIdFornecedor());
        }
        else
            return null;
    }

    public void setFornecedorSelecionado(Fornecedor fornecedor) {

        if (fornecedor != null) {
            int idFornecedor = 0;

            for (int i = 0; i < this.getItemCount(); i++) {
                Fornecedor fornecedorItem = (Fornecedor)this.getItemAt(i);

                if (fornecedorItem.getIdFornecedor() == fornecedor.getIdFornecedor()) {
                    idFornecedor = i;
                    break;
                }
            }

            this.setSelectedIndex(idFornecedor);
        }
    }
}
