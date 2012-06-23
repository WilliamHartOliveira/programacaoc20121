package br.com.facdombosco.progc.dao.suprimentos;

import br.com.facdombosco.progc.dao.baseclasses.BaseDAO;
import br.com.facdombosco.progc.dvo.suprimentos.EstoqueItem;

public class EstoqueItemDAO extends BaseDAO<EstoqueItem, Integer>{

    public EstoqueItemDAO(Class typeClass){
        super(typeClass);
    }
}
