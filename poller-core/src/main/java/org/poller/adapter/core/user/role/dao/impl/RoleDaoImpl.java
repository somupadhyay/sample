package org.poller.adapter.core.user.role.dao.impl;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.poller.adapter.core.dao.impl.AbstractAdapterDaoImpl;
import org.poller.adapter.core.domain.Role;
import org.poller.adapter.core.user.role.dao.RoleDao;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractAdapterDaoImpl<Role, Long> implements RoleDao {

	protected RoleDaoImpl() {
		super(Role.class);
	}

	public Role findRoleById(Long id) {
		
		return findById(id);
	}

	public void saveOrUpdateRole(Role role) {
		saveOrUpdate(role);
	}

	public void deleteRole(Role role) {
		delete(role);
	}

	public List<Role> findRolebyRoleName(String name) {
		return findByCriteria(Restrictions.like("name", "%"+name +"%"));
	}

	public List<Role> listRoles(String hql) {
		return findByHQL("from Role");
	}

	public List<Role> getRoleList() {

		return findByCriteria(Restrictions.eq("active", true));
	}

	
}
