package br.com.facdombosco.progc.service.suprimentos;

import br.com.facdombosco.progc.dao.suprimentos.EstoqueItemDAO;
import br.com.facdombosco.progc.service.baseclasses.BaseService;

public class EstoqueItemService extends BaseService<EstoqueItemDAO, Integer> {
    public EstoqueItemService() {
        super(EstoqueItemDAO.class);
    }
}
