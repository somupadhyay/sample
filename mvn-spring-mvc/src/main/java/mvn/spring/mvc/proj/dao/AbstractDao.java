/**
 * 
 */
package mvn.spring.mvc.proj.dao;

import java.io.Serializable;
import java.util.Collection;

import org.hibernate.criterion.Criterion;

/**
 * @author Somnath.Upadhyay
 *
 */
public interface AbstractDao<E, I extends Serializable> {

    E findById(I id);
    void saveOrUpdate(E e);
    void delete(E e);
    Collection<E> findByCriteria(Criterion criterion);
    Collection<E> findByHQL(String hql);
         
}

