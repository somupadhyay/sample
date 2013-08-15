package mvn.spring.mvc.web;

import mvn.spring.mvc.proj.entity.JavaBean;
import mvn.spring.mvc.proj.service.JavaBeanService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String args[]){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext.xml");
		
		JavaBeanService service = appContext.getBean("javaBeanService",JavaBeanService.class);
		JavaBean bean = new JavaBean();
		bean.setValue("hello");
		service.saveBean(bean);
	}
}
