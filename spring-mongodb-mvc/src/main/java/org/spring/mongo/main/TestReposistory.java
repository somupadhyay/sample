package org.spring.mongo.main;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.spring.mongo.domain.User;
import org.spring.mongo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestReposistory {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:META-INF/mongodb-context.xml");
		UserService userService = appContext.getBean("userService", UserService.class);
		
		User user = new User();
		user.setFristName("Santosh");
		user.setLastName("upadhyay");
		Set<String> interests = new HashSet<String>();
		interests.add("cooking");
		interests.add("chess");
		user.setCreatedDate(new Date());
		user.setInterests(interests );
		userService.saveUser(user);
		
		List<User> users = userService.getUsersByLastName("upadhyay");
		
		for(User use:users){
			System.out.println(use.toString());
		}
	}
}
