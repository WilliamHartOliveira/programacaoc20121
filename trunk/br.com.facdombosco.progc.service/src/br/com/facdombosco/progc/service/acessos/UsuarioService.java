package br.com.facdombosco.progc.service.acessos;

import br.com.facdombosco.progc.dao.acessos.UsuarioDAO;
import br.com.facdombosco.progc.service.baseclasses.BaseService;

public class UsuarioService extends BaseService<UsuarioDAO, Integer> {
    public UsuarioService() {
        super(UsuarioDAO.class);
    }
}
