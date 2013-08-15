/**
 * 
 */
package mvn.spring.mvc.proj.dao.impl;

import java.io.Serializable;
import java.util.Collection;

import mvn.spring.mvc.proj.dao.AbstractDao;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Somnath.Upadhyay
 *
 */
public class AbstractDaoImpl<E, I extends Serializable> implements AbstractDao<E, I> {

private Class<E> entityClass;
	
    protected AbstractDaoImpl(Class<E> entityClass) {
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
	public Collection<E> findByCriteria(Criterion criterion) {
		Criteria criteria = getCurrentSession().createCriteria(entityClass);
        criteria.add(criterion);
        return criteria.list();
	}

	@SuppressWarnings("unchecked")
	public Collection<E> findByHQL(String hql) {
		Query query = getCurrentSession().createQuery(hql);
		return query.list();
	}

}
