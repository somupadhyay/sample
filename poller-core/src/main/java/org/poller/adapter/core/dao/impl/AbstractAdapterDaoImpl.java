/**
 * 
 */
package org.poller.adapter.core.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.poller.adapter.core.dao.AbstractAdapterDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author somnath
 *
 */
public class AbstractAdapterDaoImpl<E, I extends Serializable> implements AbstractAdapterDao<E, I> {

private Class<E> entityClass;
	
    protected AbstractAdapterDaoImpl(Class<E> entityClass) {
        this.entityClass = entityClass;
    }
	
    @Autowired
    private SessionFactory sessionFactory;
    
    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
    
	@SuppressWarnings("unchecked")
	public E findById(I id) {
		return (E) getCurrentSession().get(entityClass, id);
	}

	public void saveOrUpdate(E e) {
		getCurrentSession().saveOrUpdate(e);		
	}

	public void delete(E e) {
		getCurrentSession().delete(e);
	}

	@SuppressWarnings("unchecked")
	public List<E> findByCriteria(Criterion criterion) {
		Criteria criteria = getCurrentSession().createCriteria(entityClass);
        criteria.add(criterion);
        return criteria.list();

	}

	@SuppressWarnings("unchecked")
	public	List<E> findByHQL(String hql) {
		Query query = getCurrentSession().createQuery(hql);
		return query.list();
	}
	

	

}
