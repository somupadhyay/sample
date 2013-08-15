/**
 * 
 */
package mvn.spring.mvc.proj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mvn.spring.mvc.proj.dao.JavaBeanDao;
import mvn.spring.mvc.proj.entity.JavaBean;
import mvn.spring.mvc.proj.service.JavaBeanService;

/**
 * @author Somnath.Upadhyay
 *
 */
@Service("javaBeanService")
@Transactional(readOnly = true)
public class JavaBeanServiceImpl implements JavaBeanService{

	@Autowired
	private JavaBeanDao javaBeanDao; 

	@Transactional(readOnly = false)
	public void saveBean(JavaBean bean) {
		javaBeanDao.saveOrUpdate(bean);
	}

	@Transactional(readOnly = false)
	public void updateBean(JavaBean bean) {
		javaBeanDao.saveOrUpdate(bean);
	}

	@Transactional(readOnly = false)
	public void removeBean(JavaBean bean) {
		javaBeanDao.removeJavaBean(bean);
	}

	public JavaBean findBean(int id) {
		return javaBeanDao.findById(id);
	}

	public List<JavaBean> findBeans(String value) {
		return javaBeanDao.findByName(value);
	}

}
