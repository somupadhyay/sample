/**
 * 
 */
package mvn.spring.mvc.proj.dao;

import java.io.Serializable;

import mvn.spring.mvc.proj.entity.CollectionJavaBean;

/**
 * @author Somnath.Upadhyay
 *
 */
public interface CollectionJavaBeanDao extends AbstractDao<CollectionJavaBean, Serializable>{

	public void addCollectionBean(CollectionJavaBean bean);
	public void updateCollectionBean(CollectionJavaBean bean);
	public void removeCollectionBean(CollectionJavaBean bean);
	public CollectionJavaBean findCollectionJavaBean(int id);
}
