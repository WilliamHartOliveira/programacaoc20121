package br.com.facdombosco.progc.service.compras;

import br.com.facdombosco.progc.service.compras.*;
import br.com.facdombosco.progc.dao.compras.FornecedorDAO;
import br.com.facdombosco.progc.dvo.compras.Fornecedor;
import br.com.facdombosco.progc.service.baseclasses.BaseService;
import br.com.facdombosco.progc.service.compras.FornecedorService;
import java.util.List;

public class FornecedorService extends BaseService<Fornecedor, Integer> {
    
    public FornecedorService() {
        super(Fornecedor.class);
    }
    
    @Override
    public Fornecedor save(Fornecedor object) throws Exception {
        return super.save(object);
    }
    
}
