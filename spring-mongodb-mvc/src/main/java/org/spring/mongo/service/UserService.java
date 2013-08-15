package org.spring.mongo.service;

import java.util.List;

import org.spring.mongo.domain.User;

public interface UserService {

	public void saveUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
	public User getUser(String id);
	public List<String> getInterest(String username);
	public List<User> getUsersByLastName(String lastName);
	
}
