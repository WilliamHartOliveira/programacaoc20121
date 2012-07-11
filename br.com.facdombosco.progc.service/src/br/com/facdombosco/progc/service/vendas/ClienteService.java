package br.com.facdombosco.progc.service.vendas;

import br.com.facdombosco.progc.dvo.suprimentos.EstoqueItem;
import br.com.facdombosco.progc.dvo.vendas.Cliente;
import br.com.facdombosco.progc.dvo.vendas.Produto;
import br.com.facdombosco.progc.service.baseclasses.BaseService;
import br.com.facdombosco.progc.service.suprimentos.EstoqueItemService;
import java.util.List;

public class ClienteService extends BaseService<Cliente, String> {

    public ClienteService() {
        super(Cliente.class);
    }

    @Override
    public Cliente save(Cliente object) throws Exception {

        StringBuilder sb = new StringBuilder();

        if (object.getCpf().isEmpty())
            sb.append("O cpf do Cliente é obrigatório.");

        if (sb.length() > 0) {
            throw new Exception(sb.toString());
        }

        return super.save(object);
    }
    
    //Retorna se existe a quantidade em estoque de acordo com o parâmetro passado.
    //O objeto produto deve possuir o id do produto para que a busca seja realizada
    //no banco de dados
//    public boolean existeProdutoEstoque(int idProduto, int quantidade) {
//        EstoqueItem estoqueItemPesquisa = new EstoqueItemService().findByProduto(idProduto);
//
//        return estoqueItemPesquisa.getQtdProduto() > quantidade;
//    }
//
//    //Diminui a quantidade em estoque do produto passado por parametro
//    public void diminuirQuantidadeEstoque(int idProduto, int quantidade) throws Exception {
//        EstoqueItem estoqueItemPesquisa = new EstoqueItemService().findByProduto(idProduto);
//
//        estoqueItemPesquisa.setQtdProduto(estoqueItemPesquisa.getQtdProduto() - quantidade);
//
//        new EstoqueItemService().save(estoqueItemPesquisa);
//    }

//    public List<Produto> findByProduto(int idProduto) {
//
//        List<Produto> listEstoqueProduto = new ClienteService().findAllByProperty("idProduto", idProduto);
//
//        if (listEstoqueProduto.size() == 1)
//            return listEstoqueProduto;
//
//        return null;
//    }
    
    public Cliente findByCpf(String cpf) {

        List<Cliente> listCliente = new ClienteService().findAllByProperty("cpf", cpf);

        if (listCliente.size() == 1)
            return listCliente.get(0);

        return null;
    }
}

