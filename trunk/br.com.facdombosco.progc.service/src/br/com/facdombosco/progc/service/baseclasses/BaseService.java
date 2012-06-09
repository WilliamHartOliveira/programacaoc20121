/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.facdombosco.progc.service.baseclasses;

import br.com.facdombosco.progc.dao.baseclasses.BaseDAO;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;

/**
 *
 * @author msantos
 */
public class BaseService<T, ID extends Serializable> {

    private BaseDAO<T, ID> baseDao;

    public BaseService(Class typeClass) {
        baseDao = new BaseDAO<T, ID>(typeClass);
    }

    private BaseDAO<T, ID> getBaseDAO() {
        return this.baseDao;
    }

    public void delete(T object) {
        this.getBaseDAO().delete(object);
    }

    public T save(T object) throws Exception {
        return this.getBaseDAO().save(object);
    }

    public T findById(ID primaryKey) {
        return this.getBaseDAO().findById(primaryKey);
    }

    public List findAll() {
        return this.getBaseDAO().findAll();
    }

    public List findAllByExample(T example, boolean enableLike) {
        return this.getBaseDAO().findAllByExample(example, enableLike);
    }

    public List findAll(int first, int max) {
        return this.getBaseDAO().findAll(first, max);
    }

    public List findAllByExample(T example, int first, int max) {
        return this.getBaseDAO().findAllByExample(example, first, max);
    }

    public List findAllByProperty(String property, Object value) {
        return this.getBaseDAO().findAllByProperty(property, value);
    }

    public List findAll(Dictionary<String, Object> properties) {
        return this.getBaseDAO().findAll(properties);
    }
}
