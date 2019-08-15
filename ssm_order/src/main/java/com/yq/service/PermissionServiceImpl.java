package com.yq.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yq.entity.Permission;
import com.yq.mapper.IPermissionDaoMapper;
@Service
public class PermissionServiceImpl implements IPermissionService {
	@Autowired
	private IPermissionDaoMapper permissionMapper;
	public List<Permission> findAll() {
		// TODO Auto-generated method stub
		return permissionMapper.findAll();
	}
	public void save(Permission permission) {
		// TODO Auto-generated method stub
		permission.setId(UUID.randomUUID().toString().replace("-", ""));
		permissionMapper.save(permission);
	}

}
