package org.spring.mongo.service.impl;

import java.util.List;

import org.spring.mongo.domain.User;
import org.spring.mongo.repositories.UserRepository;
import org.spring.mongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void saveUser(User user) {
		userRepository.save(user);
		
	}

	@Override
	public void updateUser(User user) {
		userRepository.save(user);
		
	}

	@Override
	public void deleteUser(User user) {
		userRepository.delete(user.getId());
	}

	@Override
	public User getUser(String id) {

		return userRepository.findOne(id);
	}

	@Override
	public List<String> getInterest(String username) {

		return null;
	}

	@Override
	public List<User> getUsersByLastName(String lastName) {
		
		return userRepository.findByLastName(lastName);
	}


}
