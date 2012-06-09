/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.facdombosco.progc.dao.baseclasses;

import java.io.Serializable;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.MatchMode;

/**
 *
 * @author msantos
 */
public class BaseDAO<T, ID extends Serializable> {

    private Class persistentClass;

    public BaseDAO(Class typeClass) {
        this.persistentClass = typeClass;
    }

    public Class<T> getPersistentClass() {
        return persistentClass;
    }

    protected Session getSession() {

        Session session = HibernateUtil.getSessionFactory().openSession();

        if (session == null)
            throw new IllegalStateException("Session has not been set on DAO before usage");
        
        return session;
    }

    public void delete(T object) {
        Session session = this.getSession();
        session.beginTransaction();
        session.delete(object);
        session.getTransaction().commit();
        session.close();
    }

    public T save(T object) {
        Session session = this.getSession();
        session.beginTransaction();
        session.saveOrUpdate(object);
        session.getTransaction().commit();
        session.close();
        return object;
    }

    public T findById(ID id) {
        T entity;
        Session session = this.getSession();
        entity = (T)getSession().load(getPersistentClass(), id);
        session.close();
        return entity;
    }

    public List findAll() {
        Session session = this.getSession();
        Criteria criteria = session.createCriteria(persistentClass);
        List list = criteria.list();
        session.close();
        return list;
    }

    public List findAllByExample(T example, boolean enableLike) {
        Session session = this.getSession();
        Criteria criteria = session.createCriteria(persistentClass);
        Example criteriaExample = Example.create(example);

        if (enableLike)
            criteriaExample.enableLike(MatchMode.ANYWHERE).ignoreCase();

        criteriaExample.excludeZeroes().excludeNone();
        criteria.add(criteriaExample);
        List<T> list = criteria.list();
        session.close();
        return list;
    }

    public List findAllByCriteria(DetachedCriteria detachedCriteria) {
        Session session = this.getSession();
        List<T> list = detachedCriteria.getExecutableCriteria(session).list();
        //session.close();
        return list;
    }

    public List findAllByHql(String hql, Dictionary<String, Object> parameters) {

        return this.getQuery(hql, parameters).list();
    }
    
    private Query getQuery(String hql, Dictionary<String, Object> parameters) {
        
        Session session = this.getSession();
        Query query = session.createQuery(hql);

        if (parameters != null) {

            Enumeration<String> keys = parameters.keys();

            while (keys.hasMoreElements()) {
                String key = keys.nextElement();
                query.setParameter(key, parameters.get(key));
            }
        }

        return query;
    }

    public Object findUniqueResult(String hql) {

        return this.getQuery(hql, null).uniqueResult();
    }

    public Object findUniqueResult(String hql, Dictionary<String, Object> parameters) {

        return this.getQuery(hql, parameters).uniqueResult();
    }

    public List findAllByHql(String hql) {

        return this.findAllByHql(hql, null);
    }

    public List findAll(int first, int max) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List findAllByExample(T example, int first, int max) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List findAll(Dictionary<String, Object> properties) {

        Session session = this.getSession();
        Criteria criteria = session.createCriteria(persistentClass);
        Enumeration<String> keys = properties.keys();

        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            criteria.add(Expression.eq(key, properties.get(key)));
        }

        List list = criteria.list();
        session.close();
        return list;
    }

    public List findAllByProperty(String property, Object value) {
        Session session = this.getSession();
        Criteria criteria = session.createCriteria(persistentClass);
        criteria.add(Expression.eq(property, value));
        List list = criteria.list();
        session.close();
        return list;
    }
}
