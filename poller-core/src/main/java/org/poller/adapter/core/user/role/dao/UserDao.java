/**
 * 
 */
package org.poller.adapter.core.user.role.dao;

import java.util.List;

import org.poller.adapter.core.dao.AbstractAdapterDao;
import org.poller.adapter.core.domain.User;

/**
 * @author somnath
 *
 */
public interface UserDao extends AbstractAdapterDao<User, Long> {

	public boolean validateUserById(String userId);
    public User findUserById(Long id);
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(User user);
    public List<User> geUserList();
    public User findUserByEmail(String email);
    public List<User> findUsersByEmail(String email);
}
