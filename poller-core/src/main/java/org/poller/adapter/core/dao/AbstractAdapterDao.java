/**
 * 
 */
package org.poller.adapter.core.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.Criterion;

/**
 * @author somnath
 *
 */
public interface AbstractAdapterDao<E, I extends Serializable> {

    E findById(I id);
    void saveOrUpdate(E e);
    void delete(E e);
    List<E> findByCriteria(Criterion criterion);
    List<E> findByHQL(String hql);
    
     
}

