package mvn.spring.mvc.proj.dao.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import mvn.spring.mvc.proj.dao.CollectionJavaBeanDao;
import mvn.spring.mvc.proj.entity.CollectionJavaBean;

/**
 * 
 * @author Somnath.Upadhyay
 *
 */
@Repository
public class CollectionJavaBeanDaoImpl extends AbstractDaoImpl<CollectionJavaBean, Serializable> implements CollectionJavaBeanDao {

	protected CollectionJavaBeanDaoImpl() {
		super(CollectionJavaBean.class);
	}

	public void addCollectionBean(CollectionJavaBean bean) {
		saveOrUpdate(bean);
	}

	public void updateCollectionBean(CollectionJavaBean bean) {
		saveOrUpdate(bean);
	}

	public void removeCollectionBean(CollectionJavaBean bean) {
		removeCollectionBean(bean);
	}

	public CollectionJavaBean findCollectionJavaBean(int id) {
		return findById(id);
	}

}
