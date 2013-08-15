package mvn.spring.mvc.proj.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import mvn.spring.mvc.proj.dao.JavaBeanDao;
import mvn.spring.mvc.proj.entity.JavaBean;

/**
 * 
 * @author Somnath.Upadhyay
 *
 */
@Repository
public class JavaBeanDaoImpl extends AbstractDaoImpl<JavaBean, Serializable> implements JavaBeanDao {

	protected JavaBeanDaoImpl() {
		super(JavaBean.class);
	}

	public void addJavaBean(JavaBean bean) {
		saveOrUpdate(bean);
	}

	public void updateJavaBean(JavaBean bean) {
		saveOrUpdate(bean);
	}

	public void removeJavaBean(JavaBean bean) {
		removeJavaBean(bean);
	}

	public JavaBean findJavaBean(int id) {
		return findById(id);
	}

	public List<JavaBean> findByName(String value) {
		
		return (List<JavaBean>) findByCriteria(Restrictions.like("value", value,MatchMode.START));
	}

}
