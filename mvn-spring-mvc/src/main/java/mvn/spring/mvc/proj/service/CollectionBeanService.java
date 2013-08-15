/**
 * 
 */
package mvn.spring.mvc.proj.service;

import mvn.spring.mvc.proj.entity.CollectionJavaBean;

/**
 * @author Somnath.Upadhyay
 *
 */
public interface CollectionBeanService {
	public void saveCollBean(CollectionJavaBean bean);
	public void updateCollBean(CollectionJavaBean bean);
	public void removeCollBean(CollectionJavaBean bean);
	public CollectionJavaBean findCollBean(int id);

}
