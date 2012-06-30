package br.com.facdombosco.progc.service.acessos;

import br.com.facdombosco.progc.service.baseclasses.BaseService;
import br.com.facdombosco.progc.dvo.acessos.Usuario;
import br.com.facdombosco.progc.framework.utils.StringUtils;
import java.util.Hashtable;
import java.util.List;

public class UsuarioService extends BaseService<Usuario, Integer> {

    public UsuarioService() {
        super(Usuario.class);
    }

    @Override
    public Usuario save(Usuario object) throws Exception {

        StringBuilder sb = new StringBuilder();

        if (object.getNome().isEmpty())
            sb.append("O nome do usu�rio � obrigat�rio.");
        else if (object.getNome().length() > 50)
            sb.append("\nO nome do usu�rio deve conter at� 50 caracteres.");

        if (object.getNomeUsuario().isEmpty())
            sb.append("\nO login do usu�rio � obrigat�rio.");
        else if (object.getNomeUsuario().length() > 30)
            sb.append("\nO login do usu�rio deve conter at� 30 caracteres.");

        if (object.getSenha().isEmpty())
            sb.append("\nA senha do usu�rio � obrigat�ria.");
        else if (object.getSenha().length() > 6)
            sb.append("\nA senha do usu�rio deve conter at� 6 caracteres.");

        if (sb.length() > 0)
            throw new Exception(sb.toString());

        return super.save(object);
    }

    public Usuario login(Usuario usuario) throws Exception {

        if (StringUtils.isNullOrEmpty(usuario.getNomeUsuario()) || StringUtils.isNullOrEmpty(usuario.getSenha()))
            throw  new Exception("Nome de usu�rio e senha s�o obrigat�rios.");

        Hashtable<String, Object> dictionary = new Hashtable<String, Object>();
        dictionary.put("nomeUsuario", usuario.getNomeUsuario());
        dictionary.put("senha", usuario.getSenha());

        List<Usuario> listUsuario = super.findAll(dictionary);

        if (listUsuario.isEmpty())
            throw  new Exception("Usu�rio ou senha incorretos.");

        return listUsuario.get(0);
    }
}
