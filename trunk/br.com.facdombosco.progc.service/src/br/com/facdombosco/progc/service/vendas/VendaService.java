package br.com.facdombosco.progc.service.vendas;

import br.com.facdombosco.progc.dvo.suprimentos.EstoqueItem;
import br.com.facdombosco.progc.dvo.vendas.NotaFiscal;
import br.com.facdombosco.progc.dvo.vendas.Produto;
import br.com.facdombosco.progc.dvo.vendas.Venda;
import br.com.facdombosco.progc.service.baseclasses.BaseService;
import br.com.facdombosco.progc.service.suprimentos.EstoqueItemService;
import java.util.List;

public class VendaService extends BaseService<Venda, Integer> {

    public VendaService() {
        super(Venda.class);
    }

    @Override
    public Venda save(Venda object) throws Exception {

        StringBuilder sb = new StringBuilder();

        if (object.getCliente().getCpf().isEmpty())
            sb.append("Definir um cliente é obrigatório.");
        if (object.getVendedor().getIdVendedor() == null)
            sb.append("Definir um vendedor é obrigatório.");
        if (object.getItemVendas().isEmpty())
            sb.append("Itens de venda são obrigatórios.");
        
        NotaService notasv = new NotaService();
        NotaFiscal nota = new NotaFiscal();
        notasv.save(nota);
        object.setNotaFiscal(notasv.findByProd());

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

    //Diminui a quantidade em estoque do produto passado por parametro
//    public void diminuirQuantidadeEstoque(int idProduto, int quantidade) throws Exception {
//        EstoqueItem estoqueItemPesquisa = new EstoqueItemService().findByProduto(idProduto);
//
//        estoqueItemPesquisa.setQtdProduto(estoqueItemPesquisa.getQtdProduto() - quantidade);
//
//        new EstoqueItemService().save(estoqueItemPesquisa);
//    }

    public List<Produto> encontr(int idProduto) {

        List<Produto> listEstoqueProduto = new VendaService().findAllByProperty("idProduto", idProduto);

        if (listEstoqueProduto.size() == 1)
            return listEstoqueProduto;

        return null;
    }
    
    public Produto findByProd(int idProduto) {

        List<Produto> listEstoqueProduto = new VendaService().findAllByProperty("idProduto", idProduto);

        if (listEstoqueProduto.size() == 1)
            return listEstoqueProduto.get(0);

        return null;
    }
    
    public Venda findLastVenda() {
        List<Venda> listVenda = new VendaService().findAll();
        Venda ven = null;
        if (listVenda.size() == 1)
        {
            ven = listVenda.get(listVenda.size());
            return ven;
        }else
            return null;
    }
}

