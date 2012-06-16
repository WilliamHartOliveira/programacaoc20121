/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.facdombosco.progc.dao.vendas;

import br.com.facdombosco.progc.dao.baseclasses.BaseDAO;
import br.com.facdombosco.progc.dvo.vendas.Venda;

/**
 *
 * @author 8213032
 */
public class VendaDAO extends BaseDAO<Venda, Integer>{

    public VendaDAO(Class typeClass){
        super(typeClass);
    }
}
