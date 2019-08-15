package com.yq.service;

import java.util.List;

import com.yq.entity.Permission;
import com.yq.entity.Role;

public interface IRoleService {
	public List<Role> findAll();
	public void save(Role role);
	public Role findById(String id);
	public List<Permission> findOtherPermission(String id);
	public void addPermissionToRole(String permissionId, String[] roleId);
}
