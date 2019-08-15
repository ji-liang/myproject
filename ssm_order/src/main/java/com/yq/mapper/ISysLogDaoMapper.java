package com.yq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.yq.entity.SysLog;

public interface ISysLogDaoMapper {
	@Select("select * from syslog")
	@Results({
	@Result(id=true,column="id",property="id"),
	@Result(column="visitTime",property="visitTime"),
	@Result(column="ip",property="ip"),
	@Result(column="url",property="url"),
	@Result(column="executionTime",property="executionTime"),
	@Result(column="method",property="method"),
	@Result(column="username",property="username")
	 })
	public List<SysLog> findAll() throws Exception;
	
	@Insert("insert into syslog(id,visitTime,username,ip,url,executionTime,method) values(#{id},#{visitTime},#{username},#{ip},#{url},#{executionTime},#{method})")
	public void save(SysLog log) throws Exception;
}
