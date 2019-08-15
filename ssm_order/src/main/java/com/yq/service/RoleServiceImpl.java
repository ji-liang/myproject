package com.yq.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yq.entity.Permission;
import com.yq.entity.Role;
import com.yq.mapper.IPermissionDaoMapper;
import com.yq.mapper.IRoleDaoMapper;
@Service("roleService")
public class RoleServiceImpl implements IRoleService {
	@Autowired
	private IRoleDaoMapper roleMapper;
	@Autowired
	private IPermissionDaoMapper permissionMapper;
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return roleMapper.findAll();
	}

	public void save(Role role) {
		// TODO Auto-generated method stub
		role.setId(UUID.randomUUID().toString().replace("-", "").toUpperCase());
		roleMapper.save(role);
	}

	public Role findById(String id) {
		// TODO Auto-generated method stub
		return roleMapper.findById();
	}

	public List<Permission> findOtherPermission(String id) {
		// TODO Auto-generated method stub
		return permissionMapper.findOtherPermission(id);
	}

	public void addPermissionToRole(String permissionId, String[] roleId) {
		// TODO Auto-generated method stub
		for (int i = 0; i < roleId.length; i++) {
			roleMapper.addPermissionToRole(permissionId,roleId[i]);
		}
	}

}
