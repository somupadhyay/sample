package mvn.spring.mvc.proj.service;

import java.util.List;

import mvn.spring.mvc.proj.entity.JavaBean;

/**
 * 
 * @author Somnath.Upadhyay
 *
 */
public interface JavaBeanService {
	public void saveBean(JavaBean bean);
	public void updateBean(JavaBean bean);
	public void removeBean(JavaBean bean);
	public JavaBean findBean(int id);
	public List<JavaBean> findBeans(String value);
	
	
}
