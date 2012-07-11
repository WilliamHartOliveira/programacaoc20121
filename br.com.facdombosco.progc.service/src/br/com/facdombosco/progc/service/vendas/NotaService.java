package br.com.facdombosco.progc.service.vendas;

import br.com.facdombosco.progc.dvo.suprimentos.EstoqueItem;
import br.com.facdombosco.progc.dvo.vendas.NotaFiscal;
import br.com.facdombosco.progc.service.baseclasses.BaseService;
import br.com.facdombosco.progc.service.suprimentos.EstoqueItemService;
import java.util.List;

public class NotaService extends BaseService<NotaFiscal, Integer> {

    public NotaService() {
        super(NotaFiscal.class);
    }

    @Override
    public NotaFiscal save(NotaFiscal object) throws Exception {

        StringBuilder sb = new StringBuilder();

//        if (object.get)
//            sb.append("O nome do Produto é obrigatório.");
//        else if (object.getNome().length() > 50)
//            sb.append("O nome do Produto deve conter até 50 caracteres.");

        if (sb.length() > 0) {
            throw new Exception(sb.toString());
        }

        return super.save(object);
    }
    
    //Retorna se existe a quantidade em estoque de acordo com o parâmetro passado.
    //O objeto produto deve possuir o id do produto para que a busca seja realizada
    //no banco de dados
    public boolean existeProdutoEstoque(int idProduto, int quantidade) {
        EstoqueItem estoqueItemPesquisa = new EstoqueItemService().findByProduto(idProduto);

        return estoqueItemPesquisa.getQtdProduto() > quantidade;
    }

    //Diminui a quantidade em estoque do produto passado por parametro
    public void diminuirQuantidadeEstoque(int idProduto, int quantidade) throws Exception {
        EstoqueItem estoqueItemPesquisa = new EstoqueItemService().findByProduto(idProduto);

        estoqueItemPesquisa.setQtdProduto(estoqueItemPesquisa.getQtdProduto() - quantidade);

        new EstoqueItemService().save(estoqueItemPesquisa);
    }

//    public List<Produto> findByProduto(int idProduto) {
//
//        List<Produto> listEstoqueProduto = new NotaService().findAllByProperty("idProduto", idProduto);
//
//        if (listEstoqueProduto.size() == 1)
//            return listEstoqueProduto;
//
//        return null;
//    }
    
    public NotaFiscal findByProd() {

        List<NotaFiscal> listNota = new NotaService().findAll();

        if (listNota.size() == 1)
            return listNota.get(listNota.size());

        return null;
    }
}

