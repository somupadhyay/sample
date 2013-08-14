package org.spring.mongo.repositories;

import java.util.List;

import org.spring.mongo.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

	public List<User> findByLastName(String lastName);
	
}
