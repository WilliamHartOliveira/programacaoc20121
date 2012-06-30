package br.com.facdombosco.progc.dao.vendas;

import br.com.facdombosco.progc.dao.baseclasses.BaseDAO;
import br.com.facdombosco.progc.dvo.vendas.Produto;

public class ProdutoDAO extends BaseDAO<Produto, Integer> {

    public ProdutoDAO(Class typeClass) {
        super(typeClass);
    }
}
