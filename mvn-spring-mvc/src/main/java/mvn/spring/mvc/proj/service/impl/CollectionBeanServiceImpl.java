/**
 * 
 */
package mvn.spring.mvc.proj.service.impl;

import mvn.spring.mvc.proj.dao.CollectionJavaBeanDao;
import mvn.spring.mvc.proj.dao.JavaBeanDao;
import mvn.spring.mvc.proj.entity.CollectionJavaBean;
import mvn.spring.mvc.proj.service.CollectionBeanService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Somnath.Upadhyay
 *
 */
@Service("collectionBeanService")
@Transactional(readOnly=true)
public class CollectionBeanServiceImpl implements CollectionBeanService {

	@Autowired
	private CollectionJavaBeanDao collectionJavaBeanDao;
	
	@Autowired
	private JavaBeanDao javaBeanDao; 
	
	@Transactional(readOnly=false)
	public void saveCollBean(CollectionJavaBean bean) {
		if(null!=bean.getJavaBean()){
			if(bean.getJavaBean().getId()==0){
				// inserting the JavaBean to database as this is new one
				javaBeanDao.saveOrUpdate(bean.getJavaBean());
			}
		}
		collectionJavaBeanDao.saveOrUpdate(bean);
	}

	@Transactional(readOnly=false)
	public void updateCollBean(CollectionJavaBean bean) {
		collectionJavaBeanDao.saveOrUpdate(bean);
	}

	@Transactional(readOnly=false)
	public void removeCollBean(CollectionJavaBean bean) {
		collectionJavaBeanDao.removeCollectionBean(bean);
	}

	public CollectionJavaBean findCollBean(int id) {
		return collectionJavaBeanDao.findById(id);
	}

}
