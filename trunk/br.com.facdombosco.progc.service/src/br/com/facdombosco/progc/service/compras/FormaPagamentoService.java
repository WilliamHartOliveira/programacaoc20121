package br.com.facdombosco.progc.service.compras;

import br.com.facdombosco.progc.dvo.compras.FormaPagamento;
import br.com.facdombosco.progc.service.baseclasses.BaseService;

public class FormaPagamentoService extends BaseService<FormaPagamento, Integer> 
{
    public FormaPagamentoService() {
        super(FormaPagamento.class);
    }
    
    @Override
    public FormaPagamento save(FormaPagamento object) throws Exception {
        return super.save(object);
    }
}
