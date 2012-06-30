package br.com.facdombosco.progc.service.suprimentos;

import br.com.facdombosco.progc.dao.suprimentos.EstoqueItemDAO;
import br.com.facdombosco.progc.dvo.suprimentos.EstoqueItem;
import br.com.facdombosco.progc.service.baseclasses.BaseService;
import br.com.facdombosco.progc.service.vendas.ProdutoService;
import java.util.List;

public class EstoqueItemService extends BaseService<EstoqueItem, Integer> {
    
    public EstoqueItemService() {
        super(EstoqueItemDAO.class);
    }
    
    @Override
    public EstoqueItem save(EstoqueItem object) throws Exception {

        StringBuilder sb = new StringBuilder();

        if (object.getQtdProduto() > 0)
            sb.append("A quantidade de estoque é obrigatória.");
        
        if (sb.length() > 0) {
            throw new Exception(sb.toString());
        }

        return super.save(object);
    }
    
    public EstoqueItem findByProduto(int idProduto) {

        List<EstoqueItem> listEstoqueProduto = new ProdutoService().findAllByProperty("idProduto", idProduto);
        
        if (listEstoqueProduto.size() == 1)
            return listEstoqueProduto.get(0);

        return null;
    }
}
