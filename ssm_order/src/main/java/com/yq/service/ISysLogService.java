package com.yq.service;

import java.util.List;

import com.yq.entity.SysLog;

public interface ISysLogService {
	public void save(SysLog log);
	public List<SysLog> findAll();
}
