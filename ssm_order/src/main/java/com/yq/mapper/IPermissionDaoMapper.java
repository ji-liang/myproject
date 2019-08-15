package com.yq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.yq.entity.Permission;

public interface IPermissionDaoMapper {
	@Select("select * from permission where id in(select permissionId from role_permission where roleId=#{roleId})")
	public List<Permission> findByRoleId(String roleId);

	@Select("select * from permission")
	public List<Permission> findAll();
	@Insert("insert into permission values(#{id},#{permissionName},#{url})")
	public void save(Permission permission);
	@Select("select * from permission where id not in(select permissionId from role_permission where roleId=#{roleId})")
	public List<Permission> findOtherPermission(String id);
}
