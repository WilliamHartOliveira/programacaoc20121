package br.com.facdombosco.progc.dao.acessos;

import br.com.facdombosco.progc.dao.baseclasses.BaseDAO;
import br.com.facdombosco.progc.dvo.acessos.Usuario;

public class UsuarioDAO extends BaseDAO<Usuario, Integer>{

    public UsuarioDAO(Class typeClass){
        super(typeClass);
    }
}
