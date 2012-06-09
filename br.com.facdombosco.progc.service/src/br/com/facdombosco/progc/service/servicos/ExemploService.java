package br.com.facdombosco.progc.service.servicos;

import br.com.facdombosco.progc.dao.servicos.ExemploDAO;
import br.com.facdombosco.progc.service.baseclasses.BaseService;

public class ExemploService extends BaseService<ExemploDAO, Integer> {
    public ExemploService() {
        super(ExemploDAO.class);
    }
}
