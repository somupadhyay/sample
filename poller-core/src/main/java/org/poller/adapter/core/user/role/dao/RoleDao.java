package org.poller.adapter.core.user.role.dao;

import java.util.List;

import org.poller.adapter.core.dao.AbstractAdapterDao;
import org.poller.adapter.core.domain.Role;

public interface RoleDao extends AbstractAdapterDao<Role, Long> {

    public Role findRoleById(Long id);
    public void saveOrUpdateRole(Role role);
    public void deleteRole(Role role);
    public List<Role> findRolebyRoleName(String name);
    public List<Role> getRoleList();
    public List<Role> listRoles(String hql);
    
}
