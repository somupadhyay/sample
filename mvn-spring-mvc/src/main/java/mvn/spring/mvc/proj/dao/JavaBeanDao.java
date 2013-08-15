/**
 * 
 */
package mvn.spring.mvc.proj.dao;

import java.io.Serializable;
import java.util.List;

import mvn.spring.mvc.proj.entity.JavaBean;

/**
 * @author Somnath.Upadhyay
 *
 */
public interface JavaBeanDao extends AbstractDao<JavaBean, Serializable>{
	
	public void addJavaBean(JavaBean bean);
	public void updateJavaBean(JavaBean bean);
	public void removeJavaBean(JavaBean bean);
	public JavaBean findJavaBean(int id);
	public List<JavaBean> findByName(String value);

}
