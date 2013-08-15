package org.poller.adapter.core.user.role.dao.impl;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.poller.adapter.core.dao.impl.AbstractAdapterDaoImpl;
import org.poller.adapter.core.domain.User;
import org.poller.adapter.core.user.role.dao.UserDao;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends AbstractAdapterDaoImpl<User, Long> implements UserDao {

	protected UserDaoImpl() {
		super(User.class);
		
	}

	public boolean validateUserById(String userId) {
		
		return true;
	}

	public User findUserById(Long id) {
		return findById(id);
	}

	public void addUser(User user) {
		saveOrUpdate(user);
	}

	public void updateUser(User user) {
		saveOrUpdate(user);
	}

	public void deleteUser(User user) {
		user.setUserDeleted(true);
		saveOrUpdate(user);
	}

	public List<User> geUserList() {
		return findByCriteria(Restrictions.eq("userActive", true));
	}

	public User findUserByEmail(String email) {
		List<User> users = null;
		if(null != email){
			users = findByHQL("from User where emailId="+email);
		}
		if(null!=users){
			return DataAccessUtils.uniqueResult(users);
		}
		
		return null;
	}

	public List<User> findUsersByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
